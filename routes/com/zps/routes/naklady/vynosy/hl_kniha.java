package com.zps.routes.naklady.vynosy;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.restlet.resource.Post;

import com.zps.mdx.controllers.MDXController;
import com.zps.models.ibm.db2.query.strings.IBMDB2SqlQueryStrings;

@Path("HlKniha")
public class hl_kniha {
	@Post
	@Produces(MediaType.APPLICATION_JSON)
	public static String getAllIBMStrings() throws ClassNotFoundException, Exception {
		String value = IBMDB2SqlQueryStrings.zamestQueryValues;
		String returnValue = MDXController.runIBMDD2(value);
		return returnValue;
	}

}
