//import java.util.List;

//import javax.json.JsonArray;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;
import org.springframework.scheduling.annotation.Async;

import com.zps.routes.naklady.vynosy.hl_kniha;
import com.zps.routes.naklady.vynosy.hl_kniha_porovnani;
import com.zps.routes.pohl.zavazky.pohledavky_admin;
import com.zps.routes.pohl.zavazky.pohledavky_firma;
import com.zps.routes.pohl.zavazky.zavazky_admin;
import com.zps.routes.pohl.zavazky.zavazky_firma;

public class App extends ServerResource {
	
	public App()  {}
	
	/**
	 * 
	 * 
	 * IBM DB2 Query Running Test
	 * 
	 * 
	 */
	 @Async
     @Post
     @Produces(MediaType.APPLICATION_JSON)
     public static String InnitIBMDB2Routes() throws ClassNotFoundException, Exception {
    	 
    	 return hl_kniha.getAllIBMStrings();
     }
     /***
      * 
      * MSSQLDB14 Querry Running Test
      * 
      * 
      */
	 @Async
     @Post
     @Produces(MediaType.APPLICATION_JSON)
     public static String InnitMSSQLDB14Routes() throws ClassNotFoundException, Exception{
    	 return hl_kniha_porovnani.gettAllMSSQLStrings();
     }
	
	/** Pohledavky Firma **/
	@Async
	@Post
	@Produces(MediaType.APPLICATION_JSON)
	public static  String InnitRoutes() throws ClassNotFoundException, Exception  {
   
		return pohledavky_firma.getAll_10();
	
	}
	@Async
	@Produces(MediaType.APPLICATION_JSON)
	public static  String InnitRoutes1()throws ClassNotFoundException, Exception  {  
		
		return pohledavky_firma.getAll_50();
		}
	@Async
	@Post
	@Produces(MediaType.APPLICATION_JSON)
	public static  String InnitRoutes2() throws ClassNotFoundException, Exception {
		
		return pohledavky_firma.getAll_100();
		}
	@Async
	@Post
	@Produces(MediaType.APPLICATION_JSON)
	public static  String InnitRoutes3() throws ClassNotFoundException, Exception {
		   
		return pohledavky_firma.getAll_Vsechno();
		}
	@Async
	@Post
	@Produces(MediaType.APPLICATION_JSON)
	public static String InnitRoutes4() throws ClassNotFoundException, Exception {
		   
		return pohledavky_firma.getAllVsechno_do_splatnosti();
		}
	@Async
	@Post
	@Produces(MediaType.APPLICATION_JSON)
	public static String InnitRoutes5() throws ClassNotFoundException, Exception {
		
		return pohledavky_firma.getAllVsechno_do_splatnostiOne();
		}
	@Async
	@Post
	@Produces(MediaType.APPLICATION_JSON)
    public static  String InnitRoutes6() throws ClassNotFoundException, Exception {
		return pohledavky_firma.getAllVsechno_do_splatnostiTwo();
		}
    /**   END  **/
	
/** Pohledavky Admin **/
	@Async
	@Post
	@Produces(MediaType.APPLICATION_JSON)
	public static  String InnitRoutesAdmin() throws ClassNotFoundException, Exception  {
   
		return pohledavky_admin.getAll_10();
	
	}
	@Async
	@Post
	@Produces(MediaType.APPLICATION_JSON)
	public static  String InnitRoutesAdmin1()throws ClassNotFoundException, Exception  {  
		
		return pohledavky_admin.getAll_50();
		}
	@Async
	@Post
	@Produces(MediaType.APPLICATION_JSON)
	public static  String InnitRoutesAdmin2() throws ClassNotFoundException, Exception {
		
		return pohledavky_admin.getAll_100();
		}
	@Async
	@Post
	@Produces(MediaType.APPLICATION_JSON)
	public static  String InnitRoutesAdmin3() throws ClassNotFoundException, Exception {
		   
		return pohledavky_admin.getAll_Vsechno();
		}
	@Async
	@Post
	@Produces(MediaType.APPLICATION_JSON)
	public static String InnitRoutesAdmin4() throws ClassNotFoundException, Exception {
		   
		return pohledavky_admin.getAllVsechno_do_splatnosti();
		}
	@Async
	@Post
	@Produces(MediaType.APPLICATION_JSON)
	public static String InnitRoutesAdmin5() throws ClassNotFoundException, Exception {
		
		return pohledavky_admin.getAllVsechno_do_splatnostiOne();
		}
	@Async
	@Post
	@Produces(MediaType.APPLICATION_JSON)
    public static  String InnitRoutesAdmin6() throws ClassNotFoundException, Exception {
		return pohledavky_admin.getAllVsechno_do_splatnostiTwo();
		}
    /**   END  **/
	
	/** Zavazky Firma **/
	@Async
	@Post
	@Produces(MediaType.APPLICATION_JSON)
	public static  String InnitZavazkyFirmaRoutes() throws ClassNotFoundException, Exception  {
  
		return zavazky_firma.getZavazkyAll_10();
	
	}
	@Async
	@Produces(MediaType.APPLICATION_JSON)
	public static  String InnitZavazkyFirmaRoutes1()throws ClassNotFoundException, Exception  {  
		
		return zavazky_firma.getZavazkyAll_50();
		}
	@Async
	@Post
	@Produces(MediaType.APPLICATION_JSON)
	public static  String InnitZavazkyFirmaRoutes2() throws ClassNotFoundException, Exception {
		
		return zavazky_firma.getZavazkyAll_100();
		}
	@Async
	@Post
	@Produces(MediaType.APPLICATION_JSON)
	public static  String InnitZavazkyFirmaRoutes3() throws ClassNotFoundException, Exception {
		   
		return zavazky_firma.getZavazkyAll_Vsechno();
		}
	@Async
	@Post
	@Produces(MediaType.APPLICATION_JSON)
	public static String InnitZavazkyFirmaRoutes4() throws ClassNotFoundException, Exception {
		   
		return zavazky_firma.getZavazkyAllVsechno_do_splatnosti();
		}
	@Async
	@Post
	@Produces(MediaType.APPLICATION_JSON)
	public static String InnitZavazkyFirmaRoutes5() throws ClassNotFoundException, Exception {
		
		return zavazky_firma.getZavazkyAllVsechno_do_splatnostiOne();
		}
	@Async
	@Post
	@Produces(MediaType.APPLICATION_JSON)
   public static  String InnitZavazkyFirmaRoutes6() throws ClassNotFoundException, Exception {
		
		return zavazky_firma.getZavazkyAllVsechno_do_splatnostiTwo();
		
		}
   /**   END  **/
/** Zavazky Admin **/
	@Async
	@Post
	@Produces(MediaType.APPLICATION_JSON)
	public static  String InnitZavazkyRoutesAdmin() throws ClassNotFoundException, Exception  {
   
		return zavazky_admin.getZavazkyAdminAll_10();
	
	}
	@Async
	@Post
	@Produces(MediaType.APPLICATION_JSON)
	public static  String InnitZavazkyRoutesAdmin1()throws ClassNotFoundException, Exception  {  
		
		return zavazky_admin.getZavazkyAdminAll_50();
		}
	@Async
	@Post
	@Produces(MediaType.APPLICATION_JSON)
	public static  String InnitZavazkyRoutesAdmin2() throws ClassNotFoundException, Exception {
		
		return zavazky_admin.getZavazkyAdminAll_100();
		}
	@Async
	@Post
	@Produces(MediaType.APPLICATION_JSON)
	public static  String InnitZavazkyRoutesAdmin3() throws ClassNotFoundException, Exception {
		   
		return zavazky_admin.getZavazkyAdminAll_Vsechno();
		}
	@Async
	@Post
	@Produces(MediaType.APPLICATION_JSON)
	public static String InnitZavazkyRoutesAdmin4() throws ClassNotFoundException, Exception {
		   
		return zavazky_admin.getZavazkyAdminAllVsechno_do_splatnosti();
		}
	@Async
	@Post
	@Produces(MediaType.APPLICATION_JSON)
	public static String InnitZavazkyRoutesAdmin5() throws ClassNotFoundException, Exception {
		
		return zavazky_admin.getZavazkyAdminAllVsechno_do_splatnostiOne();
		}
	@Async
	@Post
	@Produces(MediaType.APPLICATION_JSON)
    public static  String InnitZavazkyRoutesAdmin6() throws ClassNotFoundException, Exception {
		return zavazky_admin.getZavazkyAdminAllVsechno_do_splatnostiTwo();
		}
    /**   END  **/
}
