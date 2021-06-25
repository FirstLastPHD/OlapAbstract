package com.zps.models;

public interface PayablesListDBMDXStrings {
	public static String payables_10 = 
			"	WITH\n" + 
			"	MEMBER [Vendor].[Vendor].[BBB] AS\n" + 
			"	SUM   (TOPCOUNT (\n" + 
			"			[Vendor].[Vendor].[Vendor].Members,\n" + 
			"			10,\n" + 
			"			[Measures].[Avg Payables]\n" + 
			"			), [Measures].[Avg Payables]\n" + 
			"	)\n" + 
			"\n" + 
			"	MEMBER [Vendor].[Vendor].[SUM ALL] AS\n" + 
			"	SUM(\n" + 
			"			[Vendor].[Vendor].[Vendor].Members,\n" + 
			"			([Measures].[Avg Payables])\n" + 
			"	)\n" + 
			"	SELECT NON EMPTY {\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[ -90]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[ -60]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[ -30]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[   0]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[  30]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[  60]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[  90]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 120]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 150]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 180]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 365]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 730]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[1000]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[0]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis]} * {[Measures].[Avg Payables]})\n" + 
			"	}\n" + 
			"	ON 0,   \n" + 
			"		NON EMPTY \n" + 
			"		{[Vendor].[Vendor].[SUM ALL]} + TOPCOUNT([Vendor].[Vendor].[Vendor].Members, 10,[Measures].[Avg Payables])\n" + 
			"	ON 1   \n" + 
			"	FROM [PAYABLES]\n" + 
			"	WHERE {\n" + 
			"		{{[Vendor Posting Group].[Vendor Posting Group].&[TUZ]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}},  \n" + 
			"		{{[Vendor Posting Group].[Vendor Posting Group].&[ZAH]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}} \n" + 
			"	}\n" + 
			"";
	
	public static String payables_50 = 
			"	WITH\n" + 
			"	MEMBER [Vendor].[Vendor].[BBB] AS\n" + 
			"	SUM   (TOPCOUNT (\n" + 
			"			[Vendor].[Vendor].[Vendor].Members,\n" + 
			"			50,\n" + 
			"			[Measures].[Avg Payables]\n" + 
			"			), [Measures].[Avg Payables]\n" + 
			"	)\n" + 
			"\n" + 
			"	MEMBER [Vendor].[Vendor].[SUM ALL] AS\n" + 
			"	SUM(\n" + 
			"			[Vendor].[Vendor].[Vendor].Members,\n" + 
			"			([Measures].[Avg Payables])\n" + 
			"	)\n" + 
			"	SELECT NON EMPTY {\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[ -90]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[ -60]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[ -30]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[   0]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[  30]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[  60]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[  90]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 120]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 150]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 180]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 365]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 730]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[1000]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[0]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis]} * {[Measures].[Avg Payables]})\n" + 
			"	}\n" + 
			"	ON 0,   \n" + 
			"		NON EMPTY \n" + 
			"		{[Vendor].[Vendor].[SUM ALL]} + TOPCOUNT([Vendor].[Vendor].[Vendor].Members, 50,[Measures].[Avg Payables])\n" + 
			"	ON 1   \n" + 
			"	FROM [PAYABLES]\n" + 
			"	WHERE {\n" + 
			"		{{[Vendor Posting Group].[Vendor Posting Group].&[TUZ]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}},  \n" + 
			"		{{[Vendor Posting Group].[Vendor Posting Group].&[ZAH]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}} \n" + 
			"	}\n" + 
			"";

	
	public static String payables_100 = 
			"	WITH\n" + 
			"	MEMBER [Vendor].[Vendor].[BBB] AS\n" + 
			"	SUM   (TOPCOUNT (\n" + 
			"			[Vendor].[Vendor].[Vendor].Members,\n" + 
			"			100,\n" + 
			"			[Measures].[Avg Payables]\n" + 
			"			), [Measures].[Avg Payables]\n" + 
			"	)\n" + 
			"\n" + 
			"	MEMBER [Vendor].[Vendor].[SUM ALL] AS\n" + 
			"	SUM(\n" + 
			"			[Vendor].[Vendor].[Vendor].Members,\n" + 
			"			([Measures].[Avg Payables])\n" + 
			"	)\n" + 
			"	SELECT NON EMPTY {\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[ -90]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[ -60]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[ -30]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[   0]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[  30]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[  60]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[  90]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 120]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 150]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 180]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 365]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 730]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[1000]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[0]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis]} * {[Measures].[Avg Payables]})\n" + 
			"	}\n" + 
			"	ON 0,   \n" + 
			"		NON EMPTY \n" + 
			"		{[Vendor].[Vendor].[SUM ALL]} + TOPCOUNT([Vendor].[Vendor].[Vendor].Members, 100,[Measures].[Avg Payables])\n" + 
			"	ON 1   \n" + 
			"	FROM [PAYABLES]\n" + 
			"	WHERE {\n" + 
			"		{{[Vendor Posting Group].[Vendor Posting Group].&[TUZ]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}},  \n" + 
			"		{{[Vendor Posting Group].[Vendor Posting Group].&[ZAH]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}} \n" + 
			"	}\n" + 
			"";

	
	/**
  	 */
	public static String payables_all =
			"	WITH \n" + 
			"	MEMBER [Vendor].[Vendor].[BBB] AS\n" + 
			"	SUM   (TOPCOUNT (\n" + 
			"				[Vendor].[Vendor].[Vendor].Members,\n" + 
			"				5,\n" + 
			"				[Measures].[Avg Payables]\n" + 
			"				), [Measures].[Avg Payables]\n" + 
			"		)\n" + 
			"\n" + 
			"	MEMBER [Vendor].[Vendor].[SUM ALL] AS\n" + 
			"	SUM(\n" + 
			"				[Vendor].[Vendor].[Vendor].Members,\n" + 
			"				([Measures].[Avg Payables])\n" + 
			"	)\n" + 
			"\n" + 
			"	SELECT  \n" + 
			"			NON EMPTY\n" + 
			"				{\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[ -90]} * {[Measures].[Avg Payables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[ -60]} * {[Measures].[Avg Payables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[ -30]} * {[Measures].[Avg Payables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[   0]} * {[Measures].[Avg Payables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[  30]} * {[Measures].[Avg Payables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[  60]} * {[Measures].[Avg Payables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[  90]} * {[Measures].[Avg Payables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 120]} * {[Measures].[Avg Payables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 150]} * {[Measures].[Avg Payables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 180]} * {[Measures].[Avg Payables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 365]} * {[Measures].[Avg Payables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 730]} * {[Measures].[Avg Payables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[1000]} * {[Measures].[Avg Payables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[0]} * {[Measures].[Avg Payables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[1]} * {[Measures].[Avg Payables]}),\n" + 
			"				({[Due Analysis].[Due Analysis]} * {[Measures].[Avg Payables]})\n" + 
			"				}\n" + 
			"			ON 0,   \n" + 
			"			NON EMPTY \n" + 
			"				{[Vendor].[Vendor].[SUM ALL]} + ORDER([Vendor].[Vendor].[Vendor].Members,	[Measures].[Avg Payables], DESC ) \n" + 
			"			ON 1   \n" + 
			"			FROM [PAYABLES]\n" + 
			"			WHERE\n" + 
			"			{\n" + 
			"			{{[Vendor Posting Group].[Vendor Posting Group].&[TUZ]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}},  \n" + 
			"			{{[Vendor Posting Group].[Vendor Posting Group].&[ZAH]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}} \n" + 
			"			}\n";
	
	
	
	/**
  	 */
	public static String payables_all0 =
			"	WITH \n" + 
			"	MEMBER [Vendor].[Vendor].[BBB] AS\n" + 
			"	SUM   (TOPCOUNT (\n" + 
			"				[Vendor].[Vendor].[Vendor].Members,\n" + 
			"				5,\n" + 
			"				[Measures].[Avg Payables]\n" + 
			"				), [Measures].[Avg Payables]\n" + 
			"		)\n" + 
			"	MEMBER [Vendor].[Vendor].[SUM ALL] AS\n" + 
			"	SUM(\n" + 
			"				[Vendor].[Vendor].[Vendor].Members,\n" + 
			"				([Measures].[Avg Payables])\n" + 
			"	)\n" + 
			"	SELECT  \n" + 
			"			NON EMPTY\n" + 
			"				{\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[ -90]} * {[Measures].[Avg Payables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[ -60]} * {[Measures].[Avg Payables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[ -30]} * {[Measures].[Avg Payables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[   0]} * {[Measures].[Avg Payables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[0]} * {[Measures].[Avg Payables]}) \n" + 
			"				}\n" + 
			"			ON 0,   \n" + 
			"			NON EMPTY \n" + 
			"				{[Vendor].[Vendor].[SUM ALL]} + ORDER([Vendor].[Vendor].[Vendor].Members,	[Measures].[Avg Payables], DESC ) \n" + 
			"			ON 1   \n" + 
			"			FROM [PAYABLES]\n" + 
			"			WHERE\n" + 
			"			{\n" + 
			"			{{[Vendor Posting Group].[Vendor Posting Group].&[TUZ]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}},  \n" + 
			"			{{[Vendor Posting Group].[Vendor Posting Group].&[ZAH]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}} \n" + 
			"			}\n"; 

	
	
	
	
	/**
  	 */
	public static String payables_all90 =
			"	WITH \n" + 
			"	MEMBER [Vendor].[Vendor].[BBB] AS\n" + 
			"	SUM   (TOPCOUNT (\n" + 
			"				[Vendor].[Vendor].[Vendor].Members,\n" + 
			"				5,\n" + 
			"				[Measures].[Avg Payables]\n" + 
			"				), [Measures].[Avg Payables]\n" + 
			"		)\n" + 
			"	MEMBER [Vendor].[Vendor].[SUM ALL] AS\n" + 
			"	SUM(\n" + 
			"				[Vendor].[Vendor].[Vendor].Members,\n" + 
			"				([Measures].[Avg Payables])\n" + 
			"	)\n" + 
			"	SELECT  \n" + 
			"			NON EMPTY\n" + 
			"				{\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[  30]} * {[Measures].[Avg Payables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[  60]} * {[Measures].[Avg Payables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[  90]} * {[Measures].[Avg Payables]}) \n" + 
			"				}\n" + 
			"			ON 0,   \n" + 
			"			NON EMPTY \n" + 
			"				{[Vendor].[Vendor].[SUM ALL]} + ORDER([Vendor].[Vendor].[Vendor].Members,	[Measures].[Avg Payables], DESC ) \n" + 
			"			ON 1   \n" + 
			"			FROM [PAYABLES]\n" + 
			"			WHERE\n" + 
			"			{\n" + 
			"			{{[Vendor Posting Group].[Vendor Posting Group].&[TUZ]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}},  \n" + 
			"			{{[Vendor Posting Group].[Vendor Posting Group].&[ZAH]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}} \n" + 
			"			}\n";
	
	
	
	/**
  	 */
	public static String payables_allNaN =
			"	WITH \n" + 
			"	MEMBER [Vendor].[Vendor].[BBB] AS\n" + 
			"	SUM   (TOPCOUNT (\n" + 
			"				[Vendor].[Vendor].[Vendor].Members,\n" + 
			"				5,\n" + 
			"				[Measures].[Avg Payables]\n" + 
			"				), [Measures].[Avg Payables]\n" + 
			"		)\n" + 
			"\n" + 
			"	MEMBER [Vendor].[Vendor].[SUM ALL] AS\n" + 
			"	SUM(\n" + 
			"				[Vendor].[Vendor].[Vendor].Members,\n" + 
			"				([Measures].[Avg Payables])\n" + 
			"	)\n" + 
			"\n" + 
			"	SELECT  \n" + 
			"			NON EMPTY\n" + 
			"				{\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 120]} * {[Measures].[Avg Payables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 150]} * {[Measures].[Avg Payables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 180]} * {[Measures].[Avg Payables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 365]} * {[Measures].[Avg Payables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 730]} * {[Measures].[Avg Payables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[1000]} * {[Measures].[Avg Payables]}) \n" + 
			"				}\n" + 
			"			ON 0,   \n" + 
			"			NON EMPTY \n" + 
			"				{[Vendor].[Vendor].[SUM ALL]} + ORDER([Vendor].[Vendor].[Vendor].Members,	[Measures].[Avg Payables], DESC ) \n" + 
			"			ON 1   \n" + 
			"			FROM [PAYABLES]\n" + 
			"			WHERE\n" + 
			"			{\n" + 
			"			{{[Vendor Posting Group].[Vendor Posting Group].&[TUZ]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}},  \n" + 
			"			{{[Vendor Posting Group].[Vendor Posting Group].&[ZAH]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}} \n" + 
			"			}\n";
	
	
	
	
	public static String payables_customer_member =
			"SELECT NON EMPTY {\n" + 
			"	({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[ -90]} * {[Measures].[Avg Payables]}),\n" + 
			"	({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[ -60]} * {[Measures].[Avg Payables]}),\n" + 
			"	({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[ -30]} * {[Measures].[Avg Payables]}),\n" + 
			"	({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[   0]} * {[Measures].[Avg Payables]}),\n" + 
			"	({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[  30]} * {[Measures].[Avg Payables]}),\n" + 
			"	({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[  60]} * {[Measures].[Avg Payables]}),\n" + 
			"	({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[  90]} * {[Measures].[Avg Payables]}),\n" + 
			"	({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 120]} * {[Measures].[Avg Payables]}),\n" + 
			"	({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 150]} * {[Measures].[Avg Payables]}),\n" + 
			"	({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 180]} * {[Measures].[Avg Payables]}),\n" + 
			"	({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 365]} * {[Measures].[Avg Payables]}),\n" + 
			"	({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 730]} * {[Measures].[Avg Payables]}),\n" + 
			"	({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[1000]} * {[Measures].[Avg Payables]}),\n" + 
			"	({[Due Analysis].[Due Analysis].[Due Overdue].&[0]} * {[Measures].[Avg Payables]}),\n" + 
			"	({[Due Analysis].[Due Analysis].[Due Overdue].&[1]} * {[Measures].[Avg Payables]}),\n" + 
			"	({[Due Analysis].[Due Analysis]} * {[Measures].[Avg Payables]})\n" + 
			"	}\n" + 
			"ON 0,\n" + 
			"       NON EMPTY {\n" + 
			"	 ([SalesPerson-Purchaser].[SalesPerson-Purchaser].[SalesPerson-Purchaser]) * ([Document Payables].[Document No].Members)\n" + 
			"	}\n" + 
			"ON 1\n" + 
			"	FROM [PAYABLES]\n" + 
			"WHERE\n" + 
		/*	"[Customer].[Customer].&[00012653]\n" + */  
			"";
	
	
	public static String payables_sum =
			"SELECT NON EMPTY  \r\n" + 
			"	({[Due Analysis].[Due Analysis]} * {[Measures].[Avg Payables]})\r\n" + 
			"ON 0\r\n" + 
			"	FROM [PAYABLES] \r\n" + 
			"WHERE\r\n" + 
			"	{\r\n" + 
			"	{{[Vendor Posting Group].[Vendor Posting Group].&[TUZ]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}},   \r\n" + 
			"	{{[Vendor Posting Group].[Vendor Posting Group].&[ZAH]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}}\r\n" + 
			"	}\r\n" + 
			"";

	public static String payables_sum_members =
			"SELECT NON EMPTY  \r\n" + 
			"	({[Due Analysis].[Due Analysis].[Due Group].Members} * {[Measures].[Avg Payables]})\r\n" + 
			"ON 0\r\n" + 
			"	FROM [PAYABLES] \r\n" + 
			"WHERE\r\n" + 
			"	{\r\n" + 
			"	{{[Vendor Posting Group].[Vendor Posting Group].&[TUZ]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}},   \r\n" + 
			"	{{[Vendor Posting Group].[Vendor Posting Group].&[ZAH]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}}\r\n" + 
			"	}\r\n" + 
			"";


}
