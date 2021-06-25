//import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
//import java.util.List;

//import javax.json.JsonArray;

import org.restlet.Application;
import org.restlet.Component;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.Restlet;
import org.restlet.data.MediaType;
import org.restlet.data.Protocol;
import org.restlet.resource.Directory;
import org.restlet.resource.Get;
import org.restlet.routing.Router;
import org.restlet.service.CorsService;
//import org.restlet.service;
//import com.zps.middleware.MiddlewareHelper;
import org.springframework.scheduling.annotation.Async;




public class Index extends Application{
	
	/****
	 * 
	 * 
	 * 
	 * TEST IBM DB2 Query
	 * 
	 * 
	 */
	static String testIBMDB2 = "";
	
	/***
	 * 
	 * 
	 * TEST MSSQLDB14
	 * 
	 */
	static String testMSSQLDB14 = "";
	
	/** Pohledavky Firma **/
	static String getAll_10 ="";
	static String getAll_50 ="";
	static String getAll_100 ="";
	static String getAll_Vsechno ="";
	static String getAllVsechno_do_splatnosti ="";
	static String getAllVsechno_do_splatnostiOne ="";
	static String getAllVsechno_do_splatnostiTwo ="";
	
	/** END **/
	
	/** Pohledavky Admin **/
	
	static String getAllAdmin_10 ="";
	static String getAllAdmin_50 ="";
	static String getAllAdmin_100 ="";
	static String getAllAdmin_Vsechno ="";
	static String getAllAdminVsechno_do_splatnosti ="";
	static String getAllAdminVsechno_do_splatnostiOne ="";
	static String getAllAdminVsechno_do_splatnostiTwo ="";
	
	/** END **/
	
	/** Zavazky Firma **/
	static String getZavazkyFirmaAll_10 ="";
	static String getZavazkyFirmaAll_50 ="";
	static String getZavazkyFirmaAll_100 ="";
	static String getZavazkyFirmaAll_Vsechno ="";
	static String getZavazkyFirmaAllVsechno_do_splatnosti ="";
	static String getZavazkyFirmaAllVsechno_do_splatnostiOne ="";
	static String getZavazkyFirmaAllVsechno_do_splatnostiTwo ="";
	
	/** END **/
	
/** Zavazky Admin **/
	
	static String getZavazkyAllAdmin_10 ="";
	static String getZavazkyAllAdmin_50 ="";
	static String getZavazkyAllAdmin_100 ="";
	static String getZavazkyAllAdmin_Vsechno ="";
	static String getZavazkyAllAdminVsechno_do_splatnosti ="";
	static String getZavazkyAllAdminVsechno_do_splatnostiOne ="";
	static String getZavazkyAllAdminVsechno_do_splatnostiTwo ="";
	
	/** END **/
	
   public Index() {
	CorsService corsService = new CorsService();
    corsService.setAllowingAllRequestedHeaders(true);
    corsService.setAllowedOrigins(new HashSet<String>(Arrays.asList("*")));
    corsService.setAllowedCredentials(true);

    getServices().add(corsService);
	
   }
   
   /****
    * 
    * 
    * Main Method
    * 
    * 
    * @param args
    * @throws Exception
    */
	 
public static void main(String[] args) throws Exception {
	
	/*****
	 * 
	 * IBM DB2 Query Receiving
	 * 
	 */
	
	Index.testIBMDB2 = App.InnitIBMDB2Routes();
	
	/*****
	 * 
	 * MSSQLDB14 Query Receiving
	 * 
	 */
	
	Index.testMSSQLDB14 = App.InnitMSSQLDB14Routes();
	
	/** Pohledavky firma routes Initialization **/
	
	Index.getAll_10 = App.InnitRoutes();
	Index.getAll_50 = App.InnitRoutes1();
	Index.getAll_100 = App.InnitRoutes2();
	Index.getAll_Vsechno = App.InnitRoutes3();
	Index.getAllVsechno_do_splatnosti = App.InnitRoutes4();
	Index.getAllVsechno_do_splatnostiOne = App.InnitRoutes5();
	Index.getAllVsechno_do_splatnostiTwo = App.InnitRoutes6();
	
    /** END **/ 
	
/** Pohledavky Admin routes Initialization **/
	
	Index.getAllAdmin_10 = App.InnitRoutesAdmin();
	Index.getAllAdmin_50 = App.InnitRoutesAdmin1();
	Index.getAllAdmin_100 = App.InnitRoutesAdmin2();
	Index.getAllAdmin_Vsechno = App.InnitRoutesAdmin3();
	Index.getAllAdminVsechno_do_splatnosti = App.InnitRoutesAdmin4();
	Index.getAllAdminVsechno_do_splatnostiOne = App.InnitRoutesAdmin5();
	Index.getAllAdminVsechno_do_splatnostiTwo = App.InnitRoutesAdmin6();
	
    /** END **/ 
	
	/** Zavazky firma routes Initialization **/
	
	Index.getZavazkyFirmaAll_10 = App.InnitZavazkyFirmaRoutes();
	Index.getZavazkyFirmaAll_50 = App.InnitZavazkyFirmaRoutes1();
	Index.getZavazkyFirmaAll_100 = App.InnitZavazkyFirmaRoutes2();
	Index.getZavazkyFirmaAll_Vsechno = App.InnitZavazkyFirmaRoutes3();
	Index.getZavazkyFirmaAllVsechno_do_splatnosti = App.InnitZavazkyFirmaRoutes4();
	Index.getZavazkyFirmaAllVsechno_do_splatnostiOne = App.InnitZavazkyFirmaRoutes5();
	Index.getZavazkyFirmaAllVsechno_do_splatnostiTwo = App.InnitZavazkyFirmaRoutes6();
	
    /** END **/ 
	
   /** Zavazky Admin routes Initialization **/
	
	Index.getZavazkyAllAdmin_10 = App.InnitZavazkyRoutesAdmin();
	Index.getZavazkyAllAdmin_50 = App.InnitZavazkyRoutesAdmin1();
	Index.getZavazkyAllAdmin_100 = App.InnitZavazkyRoutesAdmin2();
	Index.getZavazkyAllAdmin_Vsechno = App.InnitZavazkyRoutesAdmin3();
	Index.getZavazkyAllAdminVsechno_do_splatnosti = App.InnitZavazkyRoutesAdmin4();
	Index.getZavazkyAllAdminVsechno_do_splatnostiOne = App.InnitZavazkyRoutesAdmin5();
	Index.getZavazkyAllAdminVsechno_do_splatnostiTwo = App.InnitZavazkyRoutesAdmin6();
	
    /** END **/ 
	
	//response.addHeader("Access-Control-Allow-Origin", "*");
	Component component = new Component();  

    // Add a new HTTP server listening on port 8182.  
    component.getServers().add(Protocol.HTTP, 8585);  
    Index index = new Index();
    component.getClients().add(Protocol.CLAP);
    // Attach the sample application.
    component.getDefaultHost().attach("http://localhost:8585", index);
    component.getDefaultHost().attachDefault(index);
    //component.getDefaultHost().attachDefault(  
           // new Index()); 
    // Start the component.  
    component.start(); 
    
    
	}

/** Pohledavky Firma Routes **/
 
  Restlet route1  = new Restlet() {
	    @Async
	    @Override
	    @Get
	    public void handle(Request request, Response response) {
	    	/*response.getRequest().getHeaders().add("Access-Control-Allow-Origin", "*");
	    	response.getRequest().getHeaders().add("Access-Control-Allow-Methods", "GET,POST,PUT,DELETE,OPTIONS, HEAD");
	    	response.getRequest().getHeaders().add("Access-Control-Allow-Headers", "X-PINGOTHER, Origin,  X-Requested-With, Accept, Content-Type, Content-Length");
	    	response.getRequest().getHeaders().add("Access-Control-Max-Age", "1728000");*/
            response.setEntity(Index.getAll_10, MediaType.APPLICATION_JSON);
	    }};
	         
  Restlet route2  = new Restlet() {
	        @Async
		    @Override
		    public void handle(Request request, Response response) {
		      response.getAccessControlAllowHeaders();
		      response.setEntity(Index.getAll_50, MediaType.APPLICATION_JSON);
		    }};
		    
  Restlet route3  = new Restlet() {
	  @Async
	  @Override
	 public void handle(Request request, Response response) {
	  response.getAccessControlAllowHeaders();
	  response.setEntity(Index.getAll_100, MediaType.APPLICATION_JSON);
	 }};
	 
  Restlet route4  = new Restlet() {
	@Async
	@Override
    public void handle(Request request, Response response) {
	response.getAccessControlAllowHeaders();
	response.setEntity(Index.getAll_Vsechno, MediaType.APPLICATION_JSON);
	}};
	
  Restlet route5  = new Restlet() {
	 @Async
	 @Override
	public void handle(Request request, Response response) {
	response.setEntity(Index.getAllVsechno_do_splatnosti, MediaType.APPLICATION_JSON);
      }};

  Restlet route6  = new Restlet() {
	@Async
    @Override
    public void handle(Request request, Response response) {
    response.setEntity(Index.getAllVsechno_do_splatnostiOne, MediaType.APPLICATION_JSON);
     }};
     
  Restlet route7  = new Restlet() {
	@Async
    @Override
    public void handle(Request request, Response response) {
	response.setEntity(Index.getAllVsechno_do_splatnostiTwo, MediaType.APPLICATION_JSON);
     }};
		    
/**  END **/
     
     
/**
 * 
 * 
 * 
 * 
 * 
 */
     /** Pohledavky Admin Routes **/

     Restlet route11  = new Restlet() {
    	@Async
   	    @Override
   	    @Get
   	    public void handle(Request request, Response response) {
   	    	/*response.getRequest().getHeaders().add("Access-Control-Allow-Origin", "*");
   	    	response.getRequest().getHeaders().add("Access-Control-Allow-Methods", "GET,POST,PUT,DELETE,OPTIONS, HEAD");
   	    	response.getRequest().getHeaders().add("Access-Control-Allow-Headers", "X-PINGOTHER, Origin,  X-Requested-With, Accept, Content-Type, Content-Length");
   	    	response.getRequest().getHeaders().add("Access-Control-Max-Age", "1728000");*/
               response.setEntity(Index.getAllAdmin_10, MediaType.APPLICATION_JSON);
   	    }};
   	    
     Restlet route12  = new Restlet() {
    	    @Async
   		    @Override
   		    public void handle(Request request, Response response) {
   		      response.getAccessControlAllowHeaders();
   		      response.setEntity(Index.getAllAdmin_50, MediaType.APPLICATION_JSON);
   		    }};
   		    
     Restlet route13  = new Restlet() {
      @Async
   	  @Override
   	 public void handle(Request request, Response response) {
   	  response.getAccessControlAllowHeaders();
   	  response.setEntity(Index.getAllAdmin_100, MediaType.APPLICATION_JSON);
   	 }};
   	 
     Restlet route14  = new Restlet() {
    @Async
   	@Override
       public void handle(Request request, Response response) {
   	response.getAccessControlAllowHeaders();
   	response.setEntity(Index.getAllAdmin_Vsechno, MediaType.APPLICATION_JSON);
   	}};
   	
     Restlet route15  = new Restlet() {
     @Async
   	 @Override
   	public void handle(Request request, Response response) {
   	response.setEntity(Index.getAllAdminVsechno_do_splatnosti, MediaType.APPLICATION_JSON);
         }};

     Restlet route16  = new Restlet() {
       @Async
       @Override
       public void handle(Request request, Response response) {
       response.setEntity(Index.getAllAdminVsechno_do_splatnostiOne, MediaType.APPLICATION_JSON);
        }};
        
     Restlet route17  = new Restlet() {
       @Async
       @Override
       public void handle(Request request, Response response) {
   	response.setEntity(Index.getAllAdminVsechno_do_splatnostiTwo, MediaType.APPLICATION_JSON);
        }};
        
    /********* END *********/
        
        /** Zavazky Firma Routes **/

        Restlet route111  = new Restlet() {
        	@Async
      	    @Override
      	    @Get
      	    public void handle(Request request, Response response) {
      	    	/*response.getRequest().getHeaders().add("Access-Control-Allow-Origin", "*");
      	    	response.getRequest().getHeaders().add("Access-Control-Allow-Methods", "GET,POST,PUT,DELETE,OPTIONS, HEAD");
      	    	response.getRequest().getHeaders().add("Access-Control-Allow-Headers", "X-PINGOTHER, Origin,  X-Requested-With, Accept, Content-Type, Content-Length");
      	    	response.getRequest().getHeaders().add("Access-Control-Max-Age", "1728000");*/
                  response.setEntity(Index.getZavazkyFirmaAll_10, MediaType.APPLICATION_JSON);
      	    }};
      	         
        Restlet route112  = new Restlet() {
        	    @Async
      		    @Override
      		    public void handle(Request request, Response response) {
      		      response.getAccessControlAllowHeaders();
      		      response.setEntity(Index.getZavazkyFirmaAll_50, MediaType.APPLICATION_JSON);
      		    }};
      		    
        Restlet route113  = new Restlet() {
          @Async
      	  @Override
      	 public void handle(Request request, Response response) {
      	  response.getAccessControlAllowHeaders();
      	  response.setEntity(Index.getZavazkyFirmaAll_100, MediaType.APPLICATION_JSON);
      	 }};
      	 
        Restlet route114  = new Restlet() {
        @Async
      	@Override
          public void handle(Request request, Response response) {
      	response.getAccessControlAllowHeaders();
      	response.setEntity(Index.getZavazkyFirmaAll_Vsechno, MediaType.APPLICATION_JSON);
      	}};
      	
        Restlet route115  = new Restlet() {
         @Async
      	 @Override
      	public void handle(Request request, Response response) {
      	response.setEntity(Index.getZavazkyFirmaAllVsechno_do_splatnosti, MediaType.APPLICATION_JSON);
            }};

        Restlet route116  = new Restlet() {
          @Async
          @Override
          public void handle(Request request, Response response) {
          response.setEntity(Index.getZavazkyFirmaAllVsechno_do_splatnostiOne, MediaType.APPLICATION_JSON);
           }};
           
        Restlet route117  = new Restlet() {
          @Async
          @Override
          public void handle(Request request, Response response) {
      	response.setEntity(Index.getZavazkyFirmaAllVsechno_do_splatnostiTwo, MediaType.APPLICATION_JSON);
           }};
      		    
      /**  END **/
      
           /**
            * 
            * 
            * 
            * 
            * 
            */
              /** Zavazky Admin Routes **/

            Restlet route121  = new Restlet() {
            @Async
            @Override
            @Get
            public void handle(Request request, Response response) {
            /*response.getRequest().getHeaders().add("Access-Control-Allow-Origin", "*");
             response.getRequest().getHeaders().add("Access-Control-Allow-Methods", "GET,POST,PUT,DELETE,OPTIONS, HEAD");
             response.getRequest().getHeaders().add("Access-Control-Allow-Headers", "X-PINGOTHER, Origin,  X-Requested-With, Accept, Content-Type, Content-Length");
             response.getRequest().getHeaders().add("Access-Control-Max-Age", "1728000");*/
             response.setEntity(Index.getZavazkyAllAdmin_10, MediaType.APPLICATION_JSON);
             }};
              	    
            Restlet route122  = new Restlet() {
            @Async
            @Override
            public void handle(Request request, Response response) {
            response.getAccessControlAllowHeaders();
            response.setEntity(Index.getZavazkyAllAdmin_50, MediaType.APPLICATION_JSON);
            }};
              		    
            Restlet route123  = new Restlet() {
            @Async
            @Override
            public void handle(Request request, Response response) {
            response.getAccessControlAllowHeaders();
            response.setEntity(Index.getZavazkyAllAdmin_100, MediaType.APPLICATION_JSON);
            }};
              	 
            Restlet route124  = new Restlet() {
            @Async
            @Override
            public void handle(Request request, Response response) {
            response.getAccessControlAllowHeaders();
            response.setEntity(Index.getZavazkyAllAdmin_Vsechno, MediaType.APPLICATION_JSON);
            }};
              	
            Restlet route125  = new Restlet() {
            @Async
            @Override
            public void handle(Request request, Response response) {
            response.setEntity(Index.getZavazkyAllAdminVsechno_do_splatnosti, MediaType.APPLICATION_JSON);
             }};

            Restlet route126  = new Restlet() {
            @Async
            @Override
            public void handle(Request request, Response response) {
            response.setEntity(Index.getZavazkyAllAdminVsechno_do_splatnostiOne, MediaType.APPLICATION_JSON);
            }};
                   
            Restlet route127  = new Restlet() {
            @Async
            @Override
            public void handle(Request request, Response response) {
            response.setEntity(Index.getZavazkyAllAdminVsechno_do_splatnostiTwo, MediaType.APPLICATION_JSON);
            }};
                   
               /********* END *********/
        /**
         * 
         * IBM DB2 ROUTE Definition
         * 
         * 
         */
        
        Restlet routeIBM  = new Restlet() {
        	@Async
            @Override
            public void handle(Request request, Response response) {
        	response.setEntity(Index.testIBMDB2, MediaType.APPLICATION_JSON);
             }};
             
          /**
           * 
           *   MSSQLDB14 Route Definition 
           *    
           *    
           */
          Restlet routeMSSQL  = new Restlet() {
        	@Async
            @Override
            public void handle(Request request, Response response) {
            response.setEntity(Index.testMSSQLDB14, MediaType.APPLICATION_JSON);
            }};  
        @Async
	    @Override
	    public synchronized Restlet createInboundRoot() {
	        // Create a router Restlet that routes each call to a new instance of HelloWorldResource.
	        Router router = new Router(getContext());

	        // Defines only one route
	        /** Pohledavky Firma Routes **/
	        router.attach("/deset", route1);
	        router.attach("/padesat", route2);
	        router.attach("/sto", route3);
	        router.attach("/vsechno", route4);
	        router.attach("/vsechnoDoSplatnosti", route5);
	        router.attach("/vsechnoDoSplatnostiOne", route6);
	        router.attach("/vsechnoDoSplatnostiTwo", route7);
	        
	       // router.attach("/static", new Directory(
	              // getContext(), "clap:///test/static"));
	        /** Pohledavky END Routes **/
	       
           /** Pohledavky Admin Routes **/
	        
	        router.attach("/desetAdmin", route11);
	        router.attach("/padesatAdmin", route12);
	        router.attach("/stoAdmin", route13);
	        router.attach("/vsechnoAdmin", route14);
	        router.attach("/vsechnoDoSplatnostiAdmin", route15);
	        router.attach("/vsechnoDoSplatnostiOneAdmin", route16);
	        router.attach("/vsechnoDoSplatnostiTwoAdmin", route17);
	       
	       // router.attach("/static", new Directory(
	              // getContext(), "clap:///test/static"));
	        /** Pohledavky END Routes **/
	        
           /** Zavazky Firma Routes **/
	        
	        router.attach("/zavazkydeset", route111);
	        router.attach("/zavazkypadesat", route112);
	        router.attach("/zavazkysto", route113);
	        router.attach("/zavazkyvsechno", route114);
	        router.attach("/zavazkyvsechnoDoSplatnosti", route115);
	        router.attach("/zavazkyvsechnoDoSplatnostiOne", route116);
	        router.attach("/zavazkyvsechnoDoSplatnostiTwo", route117);
	        
	      /** END Zavazky Firma Routes **/
	        
          /** Zavazky Admin Routes **/
	        
	        router.attach("/zavazkydesetAdmin", route121);
	        router.attach("/zavazkypadesatAdmin", route122);
	        router.attach("/zavazkystoAdmin", route123);
	        router.attach("/zavazkyvsechnoAdmin", route124);
	        router.attach("/zavazkyvsechnoDoSplatnostiAdmin", route125);
	        router.attach("/zavazkyvsechnoDoSplatnostiOneAdmin", route126);
	        router.attach("/zavazkyvsechnoDoSplatnostiTwoAdmin", route127);
	        
	       // router.attach("/static", new Directory(
	              // getContext(), "clap:///test/static"));
	        /** Pohledavky END Routes **/
	        
	     /**
	      * 
	      * 
	      * IBM DB2 ROUTE Creation
	      * 
	      */
	      router.attach("/ibmDB2", routeIBM);
	      /**
	       * MSSQLDB14 Route Creation
	       * 
	       */
	      router.attach("/msSql", routeMSSQL);
	      
	      router.attachDefault(new Directory(getContext(), "clap://class/cors/"));

	        return router;
	    }
}
