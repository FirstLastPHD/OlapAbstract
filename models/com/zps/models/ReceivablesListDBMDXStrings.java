package com.zps.models;

public interface ReceivablesListDBMDXStrings {
	public static String receivable_10 = 
			"	WITH\n" + 
			"	MEMBER [Customer].[Customer].[BBB] AS\n" + 
			"	SUM   (TOPCOUNT (\n" + 
			"			[Customer].[Customer].[Customer].Members,\n" + 
			"			10,\n" + 
			"			[Measures].[Avg Receivables]\n" + 
			"			), [Measures].[Avg Receivables]\n" + 
			"	)\n" + 
			"\n" + 
			"	MEMBER [Customer].[Customer].[SUM ALL] AS\n" + 
			"	SUM(\n" + 
			"			[Customer].[Customer].[Customer].Members,\n" + 
			"			([Measures].[Avg Receivables])\n" + 
			"	)\n" + 
			"	SELECT NON EMPTY {\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[ -90]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[ -60]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[ -30]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[   0]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[  30]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[  60]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[  90]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 120]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 150]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 180]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 365]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 730]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[1000]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[0]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis]} * {[Measures].[Avg Receivables]})\n" + 
			"	}\n" + 
			"	ON 0,   \n" + 
			"		NON EMPTY \n" + 
			"		{[Customer].[Customer].[SUM ALL]} + TOPCOUNT([Customer].[Customer].[Customer].Members, 10,[Measures].[Avg Receivables])\n" + 
			"	ON 1   \n" + 
			"	FROM [RECEIVABLES]\n" + 
			"	WHERE {\n" + 
			"		{{[Customer Posting Group].[Customer Posting Group].&[TUZ]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}},  \n" + 
			"		{{[Customer Posting Group].[Customer Posting Group].&[ZAH]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}} \n" + 
			"	}\n" + 
			"";
	
	public static String receivable_50 = 
			"	WITH\n" + 
			"	MEMBER [Customer].[Customer].[BBB] AS\n" + 
			"	SUM   (TOPCOUNT (\n" + 
			"			[Customer].[Customer].[Customer].Members,\n" + 
			"			50,\n" + 
			"			[Measures].[Avg Receivables]\n" + 
			"			), [Measures].[Avg Receivables]\n" + 
			"	)\n" + 
			"\n" + 
			"	MEMBER [Customer].[Customer].[SUM ALL] AS\n" + 
			"	SUM(\n" + 
			"			[Customer].[Customer].[Customer].Members,\n" + 
			"			([Measures].[Avg Receivables])\n" + 
			"	)\n" + 
			"	SELECT NON EMPTY {\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[ -90]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[ -60]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[ -30]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[   0]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[  30]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[  60]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[  90]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 120]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 150]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 180]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 365]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 730]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[1000]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[0]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis]} * {[Measures].[Avg Receivables]})\n" + 
			"	}\n" + 
			"	ON 0,   \n" + 
			"		NON EMPTY \n" + 
			"		{[Customer].[Customer].[SUM ALL]} + TOPCOUNT([Customer].[Customer].[Customer].Members, 50,[Measures].[Avg Receivables])\n" + 
			"	ON 1   \n" + 
			"	FROM [RECEIVABLES]\n" + 
			"	WHERE {\n" + 
			"		{{[Customer Posting Group].[Customer Posting Group].&[TUZ]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}},  \n" + 
			"		{{[Customer Posting Group].[Customer Posting Group].&[ZAH]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}} \n" + 
			"	}\n" + 
			"";
	
	public static String receivable_100 =
			"	WITH\n" + 
			"	MEMBER [Customer].[Customer].[BBB] AS\n" + 
			"	SUM   (TOPCOUNT (\n" + 
			"			[Customer].[Customer].[Customer].Members,\n" + 
			"			100,\n" + 
			"			[Measures].[Avg Receivables]\n" + 
			"			), [Measures].[Avg Receivables]\n" + 
			"	)\n" + 
			"\n" + 
			"	MEMBER [Customer].[Customer].[SUM ALL] AS\n" + 
			"	SUM(\n" + 
			"			[Customer].[Customer].[Customer].Members,\n" + 
			"			([Measures].[Avg Receivables])\n" + 
			"	)\n" + 
			"	SELECT NON EMPTY {\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[ -90]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[ -60]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[ -30]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[   0]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[  30]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[  60]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[  90]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 120]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 150]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 180]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 365]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 730]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[1000]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[0]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis]} * {[Measures].[Avg Receivables]})\n" + 
			"	}\n" + 
			"	ON 0,   \n" + 
			"		NON EMPTY \n" + 
			"		{[Customer].[Customer].[SUM ALL]} + TOPCOUNT([Customer].[Customer].[Customer].Members, 100,[Measures].[Avg Receivables])\n" + 
			"	ON 1   \n" + 
			"	FROM [RECEIVABLES]\n" + 
			"	WHERE {\n" + 
			"		{{[Customer Posting Group].[Customer Posting Group].&[TUZ]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}},  \n" + 
			"		{{[Customer Posting Group].[Customer Posting Group].&[ZAH]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}} \n" + 
			"	}\n" + 
			"";

	/**
  	 */
	public static String receivable_all =
			"	WITH \n" + 
			"	MEMBER [Customer].[Customer].[BBB] AS\n" + 
			"	SUM   (TOPCOUNT (\n" + 
			"				[Customer].[Customer].[Customer].Members,\n" + 
			"				5,\n" + 
			"				[Measures].[Avg Receivables]\n" + 
			"				), [Measures].[Avg Receivables]\n" + 
			"		)\n" + 
			"\n" + 
			"	MEMBER [Customer].[Customer].[SUM ALL] AS\n" + 
			"	SUM(\n" + 
			"				[Customer].[Customer].[Customer].Members,\n" + 
			"				([Measures].[Avg Receivables])\n" + 
			"	)\n" + 
			"\n" + 
			"	SELECT  \n" + 
			"			NON EMPTY\n" + 
			"				{\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[ -90]} * {[Measures].[Avg Receivables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[ -60]} * {[Measures].[Avg Receivables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[ -30]} * {[Measures].[Avg Receivables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[   0]} * {[Measures].[Avg Receivables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[  30]} * {[Measures].[Avg Receivables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[  60]} * {[Measures].[Avg Receivables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[  90]} * {[Measures].[Avg Receivables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 120]} * {[Measures].[Avg Receivables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 150]} * {[Measures].[Avg Receivables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 180]} * {[Measures].[Avg Receivables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 365]} * {[Measures].[Avg Receivables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 730]} * {[Measures].[Avg Receivables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[1000]} * {[Measures].[Avg Receivables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[0]} * {[Measures].[Avg Receivables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[1]} * {[Measures].[Avg Receivables]}),\n" + 
			"				({[Due Analysis].[Due Analysis]} * {[Measures].[Avg Receivables]})\n" + 
			"				}\n" + 
			"			ON 0,   \n" + 
			"			NON EMPTY \n" + 
			"				{[Customer].[Customer].[SUM ALL]} + ORDER([Customer].[Customer].[Customer].Members,	[Measures].[Avg Receivables], DESC ) \n" + 
			"			ON 1   \n" + 
			"			FROM [RECEIVABLES]\n" + 
			"			WHERE\n" + 
			"			{\n" + 
			"			{{[Customer Posting Group].[Customer Posting Group].&[TUZ]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}},  \n" + 
			"			{{[Customer Posting Group].[Customer Posting Group].&[ZAH]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}} \n" + 
			"			}\n";
	
	
	
	/**
  	 */
	public static String receivable_all0 =
			"	WITH \n" + 
			"	MEMBER [Customer].[Customer].[BBB] AS\n" + 
			"	SUM   (TOPCOUNT (\n" + 
			"				[Customer].[Customer].[Customer].Members,\n" + 
			"				5,\n" + 
			"				[Measures].[Avg Receivables]\n" + 
			"				), [Measures].[Avg Receivables]\n" + 
			"		)\n" + 
			"\n" + 
			"	MEMBER [Customer].[Customer].[SUM ALL] AS\n" + 
			"	SUM(\n" + 
			"				[Customer].[Customer].[Customer].Members,\n" + 
			"				([Measures].[Avg Receivables])\n" + 
			"	)\n" + 
			"\n" + 
			"	SELECT  \n" + 
			"			NON EMPTY\n" + 
			"				{\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[ -90]} * {[Measures].[Avg Receivables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[ -60]} * {[Measures].[Avg Receivables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[ -30]} * {[Measures].[Avg Receivables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[   0]} * {[Measures].[Avg Receivables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[0]} * {[Measures].[Avg Receivables]}) \n" + 
			"				}\n" + 
			"			ON 0,   \n" + 
			"			NON EMPTY \n" + 
			"				{[Customer].[Customer].[SUM ALL]} + ORDER([Customer].[Customer].[Customer].Members,	[Measures].[Avg Receivables], DESC ) \n" + 
			"			ON 1   \n" + 
			"			FROM [RECEIVABLES]\n" + 
			"			WHERE\n" + 
			"			{\n" + 
			"			{{[Customer Posting Group].[Customer Posting Group].&[TUZ]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}},  \n" + 
			"			{{[Customer Posting Group].[Customer Posting Group].&[ZAH]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}} \n" + 
			"			}\n"; 

	
	public static String receivable_all90 =
			"	WITH \n" + 
			"	MEMBER [Customer].[Customer].[BBB] AS\n" + 
			"	SUM   (TOPCOUNT (\n" + 
			"				[Customer].[Customer].[Customer].Members,\n" + 
			"				5,\n" + 
			"				[Measures].[Avg Receivables]\n" + 
			"				), [Measures].[Avg Receivables]\n" + 
			"		)\n" + 
			"\n" + 
			"	MEMBER [Customer].[Customer].[SUM ALL] AS\n" + 
			"	SUM(\n" + 
			"				[Customer].[Customer].[Customer].Members,\n" + 
			"				([Measures].[Avg Receivables])\n" + 
			"	)\n" + 
			"\n" + 
			"	SELECT  \n" + 
			"			NON EMPTY\n" + 
			"				{\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[  30]} * {[Measures].[Avg Receivables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[  60]} * {[Measures].[Avg Receivables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[  90]} * {[Measures].[Avg Receivables]}) \n" + 
			"				}\n" + 
			"			ON 0,   \n" + 
			"			NON EMPTY \n" + 
			"				{[Customer].[Customer].[SUM ALL]} + ORDER([Customer].[Customer].[Customer].Members,	[Measures].[Avg Receivables], DESC ) \n" + 
			"			ON 1   \n" + 
			"			FROM [RECEIVABLES]\n" + 
			"			WHERE\n" + 
			"			{\n" + 
			"			{{[Customer Posting Group].[Customer Posting Group].&[TUZ]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}},  \n" + 
			"			{{[Customer Posting Group].[Customer Posting Group].&[ZAH]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}} \n" + 
			"			}\n";
	

	/**
  	 */
	public static String receivable_allNaN = 
			"	WITH \n" + 
			"	MEMBER [Customer].[Customer].[BBB] AS\n" + 
			"	SUM   (TOPCOUNT (\n" + 
			"				[Customer].[Customer].[Customer].Members,\n" + 
			"				5,\n" + 
			"				[Measures].[Avg Receivables]\n" + 
			"				), [Measures].[Avg Receivables]\n" + 
			"		)\n" + 
			"\n" + 
			"	MEMBER [Customer].[Customer].[SUM ALL] AS\n" + 
			"	SUM(\n" + 
			"				[Customer].[Customer].[Customer].Members,\n" + 
			"				([Measures].[Avg Receivables])\n" + 
			"	)\n" + 
			"\n" + 
			"	SELECT  \n" + 
			"			NON EMPTY\n" + 
			"				{\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 120]} * {[Measures].[Avg Receivables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 150]} * {[Measures].[Avg Receivables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 180]} * {[Measures].[Avg Receivables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 365]} * {[Measures].[Avg Receivables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 730]} * {[Measures].[Avg Receivables]}),\n" + 
			"				({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[1000]} * {[Measures].[Avg Receivables]}) \n" + 
			"				}\n" + 
			"			ON 0,   \n" + 
			"			NON EMPTY \n" + 
			"				{[Customer].[Customer].[SUM ALL]} + ORDER([Customer].[Customer].[Customer].Members,	[Measures].[Avg Receivables], DESC ) \n" + 
			"			ON 1   \n" + 
			"			FROM [RECEIVABLES]\n" + 
			"			WHERE\n" + 
			"			{\n" + 
			"			{{[Customer Posting Group].[Customer Posting Group].&[TUZ]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}},  \n" + 
			"			{{[Customer Posting Group].[Customer Posting Group].&[ZAH]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}} \n" + 
			"			}\n";
	
	
	
	
	public static String receivables_customer_member =
			"SELECT NON EMPTY {\n" + 
			"	({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[ -90]} * {[Measures].[Avg Receivables]}),\n" + 
			"	({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[ -60]} * {[Measures].[Avg Receivables]}),\n" + 
			"	({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[ -30]} * {[Measures].[Avg Receivables]}),\n" + 
			"	({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[   0]} * {[Measures].[Avg Receivables]}),\n" + 
			"	({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[  30]} * {[Measures].[Avg Receivables]}),\n" + 
			"	({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[  60]} * {[Measures].[Avg Receivables]}),\n" + 
			"	({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[  90]} * {[Measures].[Avg Receivables]}),\n" + 
			"	({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 120]} * {[Measures].[Avg Receivables]}),\n" + 
			"	({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 150]} * {[Measures].[Avg Receivables]}),\n" + 
			"	({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 180]} * {[Measures].[Avg Receivables]}),\n" + 
			"	({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 365]} * {[Measures].[Avg Receivables]}),\n" + 
			"	({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 730]} * {[Measures].[Avg Receivables]}),\n" + 
			"	({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[1000]} * {[Measures].[Avg Receivables]}),\n" + 
			"	({[Due Analysis].[Due Analysis].[Due Overdue].&[0]} * {[Measures].[Avg Receivables]}),\n" + 
			"	({[Due Analysis].[Due Analysis].[Due Overdue].&[1]} * {[Measures].[Avg Receivables]}),\n" + 
			"	({[Due Analysis].[Due Analysis]} * {[Measures].[Avg Receivables]})\n" + 
			"	}\n" + 
			"ON 0,\n" + 
			"       NON EMPTY {\n" + 
			"	 ([SalesPerson-Purchaser].[SalesPerson-Purchaser].[SalesPerson-Purchaser]) * ([Document Receivables].[Dokument No].[Dokument No])\n" + 
			"	}\n" + 
			"ON 1\n" + 
			"	FROM [RECEIVABLES]\n" + 
			"WHERE\n" + 
		/*	"[Customer].[Customer].&[00012653]\n" + */  
			"";

	
	public static String receivables_sum =
			"SELECT NON EMPTY  \r\n" + 
			"	({[Due Analysis].[Due Analysis]} * {[Measures].[Avg Receivables]})\r\n" + 
			"ON 0\r\n" + 
			"	FROM [RECEIVABLES] \r\n" + 
			"WHERE\r\n" + 
			"	{\r\n" + 
			"	{{[Customer Posting Group].[Customer Posting Group].&[TUZ]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}},   \r\n" + 
			"	{{[Customer Posting Group].[Customer Posting Group].&[ZAH]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}}\r\n" + 
			"	}\r\n" + 
			"";

	
	public static String receivables_sum_members =
			"SELECT NON EMPTY  \r\n" + 
			"	({[Due Analysis].[Due Analysis].[Due Group].Members} * {[Measures].[Avg Receivables]})\r\n" + 
			"ON 0\r\n" + 
			"	FROM [RECEIVABLES] \r\n" + 
			"WHERE\r\n" + 
			"	{\r\n" + 
			"	{{[Customer Posting Group].[Customer Posting Group].&[TUZ]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}},   \r\n" + 
			"	{{[Customer Posting Group].[Customer Posting Group].&[ZAH]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}}\r\n" + 
			"	}\r\n" + 
			"";


	

}
