package com.zps.routes.pohl.zavazky;

import javax.ws.rs.Produces;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;
import org.springframework.scheduling.annotation.Async;

import com.zps.mdx.controllers.MDXController;
import com.zps.models.PayablesListDBMDXStrings;


public class zavazky_firma extends ServerResource {
	@Async
	@Get
	@Produces("text/JSON")
	public static String getZavazkyAll_10() throws ClassNotFoundException, Exception {
		 
		String value = PayablesListDBMDXStrings.payables_10;
		 String returnValue = MDXController.runMDX(value).toString();
		return returnValue;
		}
	 @Async	
	 @Get
	 @Produces("text/JSON")
	public static String getZavazkyAll_50() throws ClassNotFoundException, Exception {
		String value = PayablesListDBMDXStrings.payables_50;
		String returnValue = MDXController.runMDX(value);
		return returnValue;
		}
	 @Async
	 @Get
	 @Produces("text/JSON")
	public static String getZavazkyAll_100() throws ClassNotFoundException, Exception {
		String value = PayablesListDBMDXStrings.payables_100;
		String returnValue = MDXController.runMDX(value);
		return returnValue;
		}
	 @Async
	 @Get
	 @Produces("text/JSON")
	public static String  getZavazkyAll_Vsechno() throws ClassNotFoundException, Exception {
		String value = PayablesListDBMDXStrings.payables_all;
		String returnValue = MDXController.runMDX(value);
		return returnValue;
		}
	 @Async
	 @Get
	 @Produces("text/JSON")
	public static String getZavazkyAllVsechno_do_splatnosti() throws ClassNotFoundException, Exception {
		String value = PayablesListDBMDXStrings.payables_all0;
		String returnValue = MDXController.runMDX(value);
		return returnValue;
		
		}
	 @Async
	 @Get
	 @Produces("text/JSON")
	public static String getZavazkyAllVsechno_do_splatnostiOne() throws ClassNotFoundException, Exception {
		String value = PayablesListDBMDXStrings.payables_all90;
		String returnValue = MDXController.runMDX(value);
		return returnValue;
		}
	 @Async
	 @Get
	 @Produces("text/JSON")
	public static String getZavazkyAllVsechno_do_splatnostiTwo() throws ClassNotFoundException, Exception {
		String value = PayablesListDBMDXStrings.payables_allNaN;
		String returnValue = MDXController.runMDX(value);
		return returnValue;
		}
	

}
