package com.zps.routes.pohl.zavazky;

//import java.util.List;

//import javax.json.JsonArray;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.restlet.resource.Get;
//import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;
import org.springframework.scheduling.annotation.Async;

import com.zps.mdx.controllers.MDXController;
import com.zps.models.ReceivablesListDBMDXStrings;

@Path("main")
public class pohledavky_firma  extends ServerResource {
	 @Async
	 @Get
	 @Produces("text/JSON")
	public static String getAll_10() throws ClassNotFoundException, Exception {
		 
		String value = ReceivablesListDBMDXStrings.receivable_10;
		 String returnValue = MDXController.runMDX(value).toString();
		return returnValue;
		}
	 @Async	
	 @Get
	 @Produces("text/JSON")
	public static String getAll_50() throws ClassNotFoundException, Exception {
		String value = ReceivablesListDBMDXStrings.receivable_50;
		String returnValue = MDXController.runMDX(value);
		return returnValue;
		}
	 @Async
	 @Get
	 @Produces("text/JSON")
	public static String getAll_100() throws ClassNotFoundException, Exception {
		String value = ReceivablesListDBMDXStrings.receivable_100;
		String returnValue = MDXController.runMDX(value);
		return returnValue;
		}
	 @Async
	 @Get
	 @Produces("text/JSON")
	public static String  getAll_Vsechno() throws ClassNotFoundException, Exception {
		String value = ReceivablesListDBMDXStrings.receivable_all;
		String returnValue = MDXController.runMDX(value);
		return returnValue;
		}
	 @Async
	 @Get
	 @Produces("text/JSON")
	public static String getAllVsechno_do_splatnosti() throws ClassNotFoundException, Exception {
		String value = ReceivablesListDBMDXStrings.receivable_all0;
		String returnValue = MDXController.runMDX(value);
		return returnValue;
		
		}
	 @Async
	 @Get
	 @Produces("text/JSON")
	public static String getAllVsechno_do_splatnostiOne() throws ClassNotFoundException, Exception {
		String value = ReceivablesListDBMDXStrings.receivable_all90;
		String returnValue = MDXController.runMDX(value);
		return returnValue;
		}
	 @Async
	 @Get
	 @Produces("text/JSON")
	public static String getAllVsechno_do_splatnostiTwo() throws ClassNotFoundException, Exception {
		String value = ReceivablesListDBMDXStrings.receivable_allNaN;
		String returnValue = MDXController.runMDX(value);
		return returnValue;
		}
	
	
}
