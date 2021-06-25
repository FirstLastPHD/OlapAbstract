package com.zps.routes.pohl.zavazky;

import com.zps.mdx.controllers.MDXController;
import com.zps.models.ReceivablesListDBMDXStrings;

public class pohl_zav_detail {
	
	public static void getAll() throws ClassNotFoundException, Exception {
	String value = ReceivablesListDBMDXStrings.receivable_all90;
	MDXController.runMDX(value);
	}

}
