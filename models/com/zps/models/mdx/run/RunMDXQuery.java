package com.zps.models.mdx.run;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.zps.config.keys.*;
import org.olap4j.Cell;
import org.olap4j.CellSet;
import org.olap4j.OlapConnection;
import org.olap4j.OlapStatement;
import org.olap4j.Position;
import org.olap4j.metadata.Member;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;
import org.springframework.scheduling.annotation.Async;


//@Path("query")
public class RunMDXQuery extends ServerResource {
	
	public static  Connection connection;
	public static    OlapConnection olapConnection;
	public static   OlapStatement statement;
	public static CellSet cellSet;
	/*******
	 * 
	 * 
	 * 
	 * IBM DB2 input Values
	 * 
	 * 
	 * 
	 * 
	 */
	
	static Statement stmt = null;
	static ResultSet rs = null;
	static String OSCIS = null;
	static String PRIJMENI = null;
	static String JMENO = null;
	static String TITUL = null;
	static String ODD = null;
	static String NAZODD = null;
	static List<String> OSCISResult;
	/*****
	 * 
	 * 
	 *  MSSqlDB14 input values
	 * 
	 * 
	 */
	static Connection mscon = null;
	static Statement msstmt = null;
	static String msQuery = null;
	static ResultSet msrs = null;
	static List<String> msqueryResult = null;
	
	public RunMDXQuery() {}
	@Async
	@Post
	@Produces(MediaType.APPLICATION_JSON)
	public String getMDXQueryResults(String mdxQueryResult) throws ClassNotFoundException , Exception {
		
		JsonArrayBuilder olapJsonbuilder = Json.createArrayBuilder();
		JsonObjectBuilder olapJson = Json.createObjectBuilder();
	
        Class.forName(Keys.configOlap4Driver);
		
		connection = DriverManager.getConnection( Keys.driverManager,
				Keys.dbUser, Keys.dbPassword );
		olapConnection = connection.unwrap(OlapConnection.class);
		statement = olapConnection.createStatement();
			
	   cellSet = statement.executeOlapQuery(mdxQueryResult);

	for(Position row: cellSet.getAxes().get(1)) {
 	   for(Position column: cellSet.getAxes().get(0)) {
 		   for(Member member: row.getMembers()){
 			   olapJsonbuilder.add(olapJson.add("row", member.getName()).build());}
 		   
 		   for(Member member: column.getMembers()) {
 			   olapJsonbuilder.add(olapJson.add("column", member.getName()).build());}
 		   
 		  Cell cell = cellSet.getCell(column, row) ; 
 		  olapJsonbuilder.add(olapJson.add("value", cell.getFormattedValue()).build());}}
	
	Gson gson = new Gson(); //gson library instance
	String resultString = gson.toJson(olapJsonbuilder); //json string
	
	System.out.println("The server is starting!!! Please wait....");
	
	olapConnection.close();
	connection.close(); 
	
     return resultString;
    
	}

	
	/**
	 * 
	 * IBM DB2 OS400 Connection
	 * 
	 * 
	 * 
	 */
	
	@Post
	@Produces(MediaType.APPLICATION_JSON)
	public String getSqlDB2Query(String ibmSqlQueryResult) throws ClassNotFoundException, Exception{
		OSCISResult = new ArrayList<>();
		String resultString = null;
		
	      try {
	         Class.forName("com.ibm.as400.access.AS400JDBCDriver");
	       
	         Connection conn = DriverManager.getConnection(Keys.configIBMDB2DriverValue,Keys.dbUser ,Keys.dbPassword );
	         stmt = conn.createStatement();
	         rs = stmt.executeQuery(ibmSqlQueryResult);
	         
	         while(rs.next()) {
	        	 OSCIS = rs.getString(1);
	        	 PRIJMENI = rs.getString(2);
	        	 JMENO = rs.getString(3);
	        	 TITUL = rs.getString(4);
	        	 ODD = rs.getString(5);
	        	 NAZODD = rs.getString(6);
	        	 
	        	 OSCISResult.add(OSCIS);
	        	 OSCISResult.add(PRIJMENI);
	        	 OSCISResult.add(JMENO);
	        	 OSCISResult.add(TITUL);
	        	 OSCISResult.add(ODD);
	        	 OSCISResult.add(NAZODD);
	        	 
	         }
	         
	         Gson gson = new Gson();
	         resultString = gson.toJson(OSCISResult);
	          //System.out.println(resultString);
	         
	       rs.close();
           stmt.close();
           conn.commit();
           conn.close();
	         
	         //conn.close();
	      } catch (ClassNotFoundException cnf) {
	         System.out.println("ERROR: One of the JDBC drivers did not load.");
	         System.exit(0);
	      }
	      
	   return resultString;
	}
	
	/*****
	 * 
	 * 
	 * MSSQLDB14 Microsoft Query Connection pool
	 * 
	 * 
	 */
	@Post
	@Produces(MediaType.APPLICATION_JSON)
	public String getMSSQLDB14Query(String  mssqlQueryResult) throws SQLException {
		
		msqueryResult = new ArrayList<>();
		
		//create variable for connection String
		
		mscon = DriverManager.getConnection(Keys.msSqlConnectionString);
		msstmt = mscon.createStatement();
	    msQuery =  mssqlQueryResult;
		msrs = msstmt.executeQuery(msQuery);
		
		while(msrs.next()) {
			msqueryResult.add(msrs.getString("timestamp"));
			msqueryResult.add(msrs.getString("Code"));
			msqueryResult.add(msrs.getString("Name"));
			msqueryResult.add(msrs.getString("Commission _"));
			msqueryResult.add(msrs.getString("Global Dimension 1 Code"));
			msqueryResult.add(msrs.getString("Global Dimension 2 Code"));
			msqueryResult.add(msrs.getString("E-Mail"));
			msqueryResult.add(msrs.getString("Phone No_"));
			msqueryResult.add(msrs.getString("Job Title"));
			msqueryResult.add(msrs.getString("Search E-Mail"));
			msqueryResult.add(msrs.getString("E-Mail 2"));
			msqueryResult.add(msrs.getString("Instant Messaging"));
			msqueryResult.add(msrs.getString("Mobile Phone No_"));
		
		}
		
		Gson gson = new Gson();
		String resultString = gson.toJson(msqueryResult);
		msrs.close();
		msstmt.close();
		mscon.commit();
		mscon.close();
		
		return resultString;
	}
	
}

