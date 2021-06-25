package com.zps.models;

public interface FAListDBMDXStrings {
	
	//Dhm fixni 
		public static String fa_dim_0 =
				"SELECT \n" + 
				"NON EMPTY \n" + 
				"{[Measures].[Acquisition Cost], [Measures].[Depreciation], [Measures].[FA Value]} \n"+		
				"ON 0,  \n" + 
				"NON EMPTY \n" + 
				"[Dimension1].[Dimension1].[Dimension1]\n" + 
				"ON 1\n" + 
				"FROM \n" + 
				"[Fixed Assets] \n"; 
		
		
		public static String fa_dim_1 =
				"SELECT  \n" + 
				"NON EMPTY  \n" + 
				"{[Measures].[Acquisition Cost], [Measures].[Depreciation], [Measures].[FA Value]}\n" + 
				"ON 0,   \n" + 
				"NON EMPTY  \n" + 
				"[Fixed Asset].[Fixed Asset].[Fixed Asset]\n" + 
				"ON 1 \n" + 
				"FROM  \n" + 
				"[Fixed Assets]\n" + 
				"WHERE\n" + 
				//"[Dimension1].[Dimension1].&[1190]\n" + 
				"";
		
		
		
		public static String fa_loca_dim_0=
				"SELECT  \n" + 
				"	NON EMPTY  \n" + 
				"	{[Measures].[Acquisition Cost], [Measures].[Depreciation], [Measures].[FA Value]}\n" + 
				"ON 0,\n" + 
				"	NON EMPTY  \n" + 
				"	[Fixed Asset].[Fixed Asset by Location].[FA Location]\n" + 
				"ON 1 \n" + 
				"	FROM  \n" + 
				"	[Fixed Assets]\n"; 
		
		//WHERE

		public static String fa_loca_dim_1=
				"	SELECT  \n" + 
				"	NON EMPTY  \n" + 
				"	{[Measures].[Acquisition Cost], [Measures].[Depreciation], [Measures].[FA Value]}\n" + 
				"	ON 0,\n" + 
				"	NON EMPTY  \n" + 
				"	[Fixed Asset].[Fixed Asset by Posting Group].[Fixed Asset]\n" + 
				"	ON 1 \n" + 
				"	FROM  \n" + 
				"	[Fixed Assets]\n" + 
				"	WHERE\n" + 
				//"	[Fixed Asset].[Fixed Asset by Location].[FA Location].&[1190-02]\n" + 
				"";



				
		
		//Inkrementy, dekrementy
		public static String fa_gl_0 =
				"SELECT \n" + 
				"NON EMPTY\n" + 
				"{[Measures].[Credit],[Measures].[Debit],[Measures].[Balance],[Measures].[Net Change]}\n" + 
				"ON 0,  \n" + 
				"NON EMPTY\n" + 
				"[Fixed Asset].[Fixed Asset by Location].[FA Location]\n" + 
				"ON 1\n" + 
				"FROM \n" + 
				"[General Ledger] \n";  
		
		
		
		public static String fa_gl_1 =
				
				"SELECT \n" + 
				"	NON EMPTY\n" + 
				"	{[Measures].[Credit],[Measures].[Debit],[Measures].[Balance],[Measures].[Net Change]}\n" + 
				"ON 0,  \n" + 
				"	NON EMPTY \n" + 
				"	[Fixed Asset].[Fixed Asset by Posting Group].[Fixed Asset] \n" + 
				"ON 1 \n" + 
				"	FROM \n" + 
				"[General Ledger] \n" + 
				"	WHERE\n" + 
				//"			[Fixed Asset].[Fixed Asset by Location].[FA Location].&[1190-03] "+
				"";

}
