package com.zps.models;

public interface ReceivablesListAdminDBMDXStrings {
	public static String receivable_10 = 
			"WITH\n" + 
			"	MEMBER [SalesPerson-Purchaser].[SalesPerson-Purchaser].[BBB] AS\n" + 
			"	SUM   (TOPCOUNT (\n" + 
			"			NonEmpty([SalesPerson-Purchaser].[SalesPerson-Purchaser].Members),\n" + 
			"			10,\n" + 
			"			[Measures].[Avg Receivables]\n" + 
			"			), [Measures].[Avg Receivables]\n" + 
			"	)\n" + 
			"	\n" + 
			"	MEMBER [SalesPerson-Purchaser].[SalesPerson-Purchaser].[SUM ALL] AS\n" + 
			"	SUM(\n" + 
			"			NonEmpty([SalesPerson-Purchaser].[SalesPerson-Purchaser].[SalesPerson-Purchaser].Members),\n" + 
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
		/*	"		{[SalesPerson-Purchaser].[SalesPerson-Purchaser].[SUM ALL]} + \n" + */ 
			"		TOPCOUNT([SalesPerson-Purchaser].[SalesPerson-Purchaser].Members, \n" + 
			"		10,\n" + 
			"		[Measures].[Avg Receivables])\n" + 
			"	ON 1   \n" + 
			"	FROM [RECEIVABLES]\n" + 
			"	WHERE {\n" + 
			"		{{[Customer Posting Group].[Customer Posting Group].&[TUZ]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}},  \n" + 
			"		{{[Customer Posting Group].[Customer Posting Group].&[ZAH]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}} \n" + 
			"	}\n";  
	
	public static String receivable_50 = 
			"WITH\n" + 
			"	MEMBER [SalesPerson-Purchaser].[SalesPerson-Purchaser].[BBB] AS\n" + 
			"	SUM   (TOPCOUNT (\n" + 
			"			NonEmpty([SalesPerson-Purchaser].[SalesPerson-Purchaser].Members),\n" + 
			"			50,\n" + 
			"			[Measures].[Avg Receivables]\n" + 
			"			), [Measures].[Avg Receivables]\n" + 
			"	)\n" + 
			"	\n" + 
			"	MEMBER [SalesPerson-Purchaser].[SalesPerson-Purchaser].[SUM ALL] AS\n" + 
			"	SUM(\n" + 
			"			NonEmpty([SalesPerson-Purchaser].[SalesPerson-Purchaser].[SalesPerson-Purchaser].Members),\n" + 
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
		/*	"		{[SalesPerson-Purchaser].[SalesPerson-Purchaser].[SUM ALL]} + \n" + */ 
			"		TOPCOUNT([SalesPerson-Purchaser].[SalesPerson-Purchaser].Members, \n" + 
			"		50,\n" + 
			"		[Measures].[Avg Receivables])\n" + 
			"	ON 1   \n" + 
			"	FROM [RECEIVABLES]\n" + 
			"	WHERE {\n" + 
			"		{{[Customer Posting Group].[Customer Posting Group].&[TUZ]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}},  \n" + 
			"		{{[Customer Posting Group].[Customer Posting Group].&[ZAH]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}} \n" + 
			"	}\n";  
	

	public static String receivable_100 = 
			"WITH\n" + 
			"	MEMBER [SalesPerson-Purchaser].[SalesPerson-Purchaser].[BBB] AS\n" + 
			"	SUM   (TOPCOUNT (\n" + 
			"			NonEmpty([SalesPerson-Purchaser].[SalesPerson-Purchaser].Members),\n" + 
			"			100,\n" + 
			"			[Measures].[Avg Receivables]\n" + 
			"			), [Measures].[Avg Receivables]\n" + 
			"	)\n" + 
			"	\n" + 
			"	MEMBER [SalesPerson-Purchaser].[SalesPerson-Purchaser].[SUM ALL] AS\n" + 
			"	SUM(\n" + 
			"			NonEmpty([SalesPerson-Purchaser].[SalesPerson-Purchaser].[SalesPerson-Purchaser].Members),\n" + 
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
		/*	"		{[SalesPerson-Purchaser].[SalesPerson-Purchaser].[SUM ALL]} + \n" + */ 
			"		TOPCOUNT([SalesPerson-Purchaser].[SalesPerson-Purchaser].Members, \n" + 
			"		100,\n" + 
			"		[Measures].[Avg Receivables])\n" + 
			"	ON 1   \n" + 
			"	FROM [RECEIVABLES]\n" + 
			"	WHERE {\n" + 
			"		{{[Customer Posting Group].[Customer Posting Group].&[TUZ]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}},  \n" + 
			"		{{[Customer Posting Group].[Customer Posting Group].&[ZAH]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}} \n" + 
			"	}\n";  
	
	/**
  	 */
	public static String receivable_all =
			"WITH\n" + 
			"	MEMBER [SalesPerson-Purchaser].[SalesPerson-Purchaser].[BBB] AS\n" + 
			"	SUM   (TOPCOUNT (\n" + 
			"			NonEmpty([SalesPerson-Purchaser].[SalesPerson-Purchaser].Members),\n" + 
			"			10,\n" + 
			"			[Measures].[Avg Receivables]\n" + 
			"			), [Measures].[Avg Receivables]\n" + 
			"	)\n" + 
			"	\n" + 
			"	MEMBER [SalesPerson-Purchaser].[SalesPerson-Purchaser].[SUM ALL] AS\n" + 
			"	SUM(\n" + 
			"			NonEmpty([SalesPerson-Purchaser].[SalesPerson-Purchaser].[SalesPerson-Purchaser].Members),\n" + 
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
		/*	"		{[SalesPerson-Purchaser].[SalesPerson-Purchaser].[SUM ALL]} + \n" + */ 
			"		ORDER([SalesPerson-Purchaser].[SalesPerson-Purchaser].Members, \n" + 
			"		[Measures].[Avg Receivables], DESC)\n" + 
			"	ON 1   \n" + 
			"	FROM [RECEIVABLES]\n" + 
			"	WHERE {\n" + 
			"		{{[Customer Posting Group].[Customer Posting Group].&[TUZ]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}},  \n" + 
			"		{{[Customer Posting Group].[Customer Posting Group].&[ZAH]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}} \n" + 
			"	}\n";
	
	
	/**
  	 */
	public static String receivable_all0 =
			"WITH\n" + 
			"	MEMBER [SalesPerson-Purchaser].[SalesPerson-Purchaser].[BBB] AS\n" + 
			"	SUM   (TOPCOUNT (\n" + 
			"			NonEmpty([SalesPerson-Purchaser].[SalesPerson-Purchaser].Members),\n" + 
			"			10,\n" + 
			"			[Measures].[Avg Receivables]\n" + 
			"			), [Measures].[Avg Receivables]\n" + 
			"	)\n" + 
			"	\n" + 
			"	MEMBER [SalesPerson-Purchaser].[SalesPerson-Purchaser].[SUM ALL] AS\n" + 
			"	SUM(\n" + 
			"			NonEmpty([SalesPerson-Purchaser].[SalesPerson-Purchaser].[SalesPerson-Purchaser].Members),\n" + 
			"			([Measures].[Avg Receivables])\n" + 
			"	)\n" + 
			"	SELECT NON EMPTY {\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[ -90]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[ -60]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[ -30]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[   0]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[0]} * {[Measures].[Avg Receivables]}) \n" + 
			"	}\n" + 
			"	ON 0,   \n" + 
			"		NON EMPTY \n" + 
		/*	"		{[SalesPerson-Purchaser].[SalesPerson-Purchaser].[SUM ALL]} + \n" + */ 
			"		ORDER([SalesPerson-Purchaser].[SalesPerson-Purchaser].Members, \n" + 
			"		[Measures].[Avg Receivables], DESC)\n" + 
			"	ON 1   \n" + 
			"	FROM [RECEIVABLES]\n" + 
			"	WHERE {\n" + 
			"		{{[Customer Posting Group].[Customer Posting Group].&[TUZ]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}},  \n" + 
			"		{{[Customer Posting Group].[Customer Posting Group].&[ZAH]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}} \n" + 
			"	}\n";  
	

	
	/**
  	 */
	public static String receivable_all90=
			"WITH\n" + 
			"	MEMBER [SalesPerson-Purchaser].[SalesPerson-Purchaser].[BBB] AS\n" + 
			"	SUM   (TOPCOUNT (\n" + 
			"			NonEmpty([SalesPerson-Purchaser].[SalesPerson-Purchaser].Members),\n" + 
			"			10,\n" + 
			"			[Measures].[Avg Receivables]\n" + 
			"			), [Measures].[Avg Receivables]\n" + 
			"	)\n" + 
			"	\n" + 
			"	MEMBER [SalesPerson-Purchaser].[SalesPerson-Purchaser].[SUM ALL] AS\n" + 
			"	SUM(\n" + 
			"			NonEmpty([SalesPerson-Purchaser].[SalesPerson-Purchaser].[SalesPerson-Purchaser].Members),\n" + 
			"			([Measures].[Avg Receivables])\n" + 
			"	)\n" + 
			"	SELECT NON EMPTY {\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[  30]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[  60]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[  90]} * {[Measures].[Avg Receivables]}) \n" + 
			"	}\n" + 
			"	ON 0,   \n" + 
			"		NON EMPTY \n" + 
		/*	"		{[SalesPerson-Purchaser].[SalesPerson-Purchaser].[SUM ALL]} + \n" + */ 
			"		ORDER([SalesPerson-Purchaser].[SalesPerson-Purchaser].Members, \n" + 
			"		[Measures].[Avg Receivables], DESC)\n" + 
			"	ON 1   \n" + 
			"	FROM [RECEIVABLES]\n" + 
			"	WHERE {\n" + 
			"		{{[Customer Posting Group].[Customer Posting Group].&[TUZ]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}},  \n" + 
			"		{{[Customer Posting Group].[Customer Posting Group].&[ZAH]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}} \n" + 
			"	}\n";
	

	
	/**
  	 */
	public static String receivable_allNaN =
			"WITH\n" + 
			"	MEMBER [SalesPerson-Purchaser].[SalesPerson-Purchaser].[BBB] AS\n" + 
			"	SUM   (TOPCOUNT (\n" + 
			"			NonEmpty([SalesPerson-Purchaser].[SalesPerson-Purchaser].Members),\n" + 
			"			10,\n" + 
			"			[Measures].[Avg Receivables]\n" + 
			"			), [Measures].[Avg Receivables]\n" + 
			"	)\n" + 
			"	\n" + 
			"	MEMBER [SalesPerson-Purchaser].[SalesPerson-Purchaser].[SUM ALL] AS\n" + 
			"	SUM(\n" + 
			"			NonEmpty([SalesPerson-Purchaser].[SalesPerson-Purchaser].[SalesPerson-Purchaser].Members),\n" + 
			"			([Measures].[Avg Receivables])\n" + 
			"	)\n" + 
			"	SELECT NON EMPTY {\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 120]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 150]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 180]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 365]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 730]} * {[Measures].[Avg Receivables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[1000]} * {[Measures].[Avg Receivables]}) \n" + 
			"	}\n" + 
			"	ON 0,   \n" + 
			"		NON EMPTY \n" + 
		/*	"		{[SalesPerson-Purchaser].[SalesPerson-Purchaser].[SUM ALL]} + \n" + */ 
			"		ORDER([SalesPerson-Purchaser].[SalesPerson-Purchaser].Members, \n" + 
			"		[Measures].[Avg Receivables], DESC)\n" + 
			"	ON 1   \n" + 
			"	FROM [RECEIVABLES]\n" + 
			"	WHERE {\n" + 
			"		{{[Customer Posting Group].[Customer Posting Group].&[TUZ]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}},  \n" + 
			"		{{[Customer Posting Group].[Customer Posting Group].&[ZAH]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}} \n" + 
			"	}\n";
	
	
	
	public static String receivable_admin_parm =
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
			"	 ([customer].[customer].[customer]) * ([Document Receivables].[Dokument No].[Dokument No])\n" + 
			"	}\n" + 
			"ON 1\n" + 
			"	FROM [RECEIVABLES]\n" + 
			"WHERE\n"+
			"";


}
