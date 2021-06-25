package com.zps.mdx.controllers;


//import java.util.ArrayList;
//import java.util.List;

//import javax.json.JsonArray;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;
import org.springframework.scheduling.annotation.Async;

import com.zps.models.mdx.run.*;

import mondrian.spi.impl.Db2Dialect;

//import objects.OlapObjects;

public  class MDXController extends ServerResource {
	
	public MDXController() {}
	/***
	 * 
	 *  MDX OLAP olap4j Controller 
	 * @param value
	 * @return
	 * @throws ClassNotFoundException
	 * @throws Exception
	 */
	@Async
	@Post
	@Produces(MediaType.APPLICATION_JSON)
	public static  String runMDX(String value) throws ClassNotFoundException, Exception {
		
	RunMDXQuery runMdx = new RunMDXQuery();
    String returnValue = runMdx.getMDXQueryResults(value) ;
    
    return returnValue;
	}
	/*******
	 * 
	 * IBM OS/400 {@link Db2Dialect} Controller
	 * @param value
	 * @return
	 * @throws ClassNotFoundException
	 * @throws Exception
	 */
	@Post
	@Produces(MediaType.APPLICATION_JSON)
	public static String runIBMDD2(String value) throws ClassNotFoundException, Exception {
		
		RunMDXQuery runIBMDB2 = new RunMDXQuery();
		String returnValue = runIBMDB2.getSqlDB2Query(value);
		return returnValue;
	
	}
	/**
	 * 
	 *  MSSQLDB14 COntroller
	 * @param value
	 * @return
	 * @throws ClassNotFoundException
	 * @throws Exception
	 */
	@Post
	@Produces(MediaType.APPLICATION_JSON)
	public static String runMSSQLDB14(String value) throws ClassNotFoundException, Exception {
		
		RunMDXQuery runMSSQLDB = new RunMDXQuery();
		String returnValue = runMSSQLDB.getMSSQLDB14Query(value);
		return returnValue;
	}
	
}


