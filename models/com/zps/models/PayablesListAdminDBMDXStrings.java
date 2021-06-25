package com.zps.models;

public interface PayablesListAdminDBMDXStrings {
	
	public static String payables_10 =
			"WITH\n" + 
			"	MEMBER [SalesPerson-Purchaser].[SalesPerson-Purchaser].[BBB] AS\n" + 
			"	SUM   (TOPCOUNT (\n" + 
			"			NONEMPTY([SalesPerson-Purchaser].[SalesPerson-Purchaser].Members),\n" + 
			"			10,\n" + 
			"			[Measures].[Avg Payables]\n" + 
			"			), [Measures].[Avg Payables]\n" + 
			"	)\n" + 
			"	\n" + 
			"	MEMBER [SalesPerson-Purchaser].[SalesPerson-Purchaser].[SUM ALL] AS\n" + 
			"	SUM(\n" + 
			"			NonEmpty([SalesPerson-Purchaser].[SalesPerson-Purchaser].Members),\n" + 
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
		/*	"		{[SalesPerson-Purchaser].[SalesPerson-Purchaser].[SUM ALL]} + " + */
			"       TOPCOUNT([SalesPerson-Purchaser].[SalesPerson-Purchaser].Members," +
			"       10," +
			"       [Measures].[Avg Payables])\n" + 
			"	ON 1   \n" + 
			"	FROM [PAYABLES]\n" + 
			"	WHERE {\n" + 
			"		{{[Vendor Posting Group].[Vendor Posting Group].&[TUZ]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}},  \n" + 
			"		{{[Vendor Posting Group].[Vendor Posting Group].&[ZAH]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}} \n" + 
			"	}\n" + 
			" ";
	
	
	public static String payables_50 = 
			"WITH\n" + 
			"	MEMBER [SalesPerson-Purchaser].[SalesPerson-Purchaser].[BBB] AS\n" + 
			"	SUM   (TOPCOUNT (\n" + 
			"			NonEmpty([SalesPerson-Purchaser].[SalesPerson-Purchaser].Members),\n" + 
			"			50,\n" + 
			"			[Measures].[Avg Payables]\n" + 
			"			), [Measures].[Avg Payables]\n" + 
			"	)\n" + 
			"	\n" + 
			"	MEMBER [SalesPerson-Purchaser].[SalesPerson-Purchaser].[SUM ALL] AS\n" + 
			"	SUM(\n" + 
			"			NonEmpty([SalesPerson-Purchaser].[SalesPerson-Purchaser].Members),\n" + 
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
		/*	"		{[SalesPerson-Purchaser].[SalesPerson-Purchaser].[SUM ALL]} + " + */
			"       TOPCOUNT([SalesPerson-Purchaser].[SalesPerson-Purchaser].Members," +
			"       50," +
			"       [Measures].[Avg Payables])\n" + 
			"	ON 1   \n" + 
			"	FROM [PAYABLES]\n" + 
			"	WHERE {\n" + 
			"		{{[Vendor Posting Group].[Vendor Posting Group].&[TUZ]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}},  \n" + 
			"		{{[Vendor Posting Group].[Vendor Posting Group].&[ZAH]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}} \n" + 
			"	}\n" + 
			" ";
	
	
	
	public static String payables_100 = 
			"WITH\n" + 
			"	MEMBER [SalesPerson-Purchaser].[SalesPerson-Purchaser].[BBB] AS\n" + 
			"	SUM   (TOPCOUNT (\n" + 
			"			NonEmpty([SalesPerson-Purchaser].[SalesPerson-Purchaser].Members),\n" + 
			"			100,\n" + 
			"			[Measures].[Avg Payables]\n" + 
			"			), [Measures].[Avg Payables]\n" + 
			"	)\n" + 
			"	\n" + 
			"	MEMBER [SalesPerson-Purchaser].[SalesPerson-Purchaser].[SUM ALL] AS\n" + 
			"	SUM(\n" + 
			"			NonEmpty([SalesPerson-Purchaser].[SalesPerson-Purchaser].Members),\n" + 
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
		/*	"		{[SalesPerson-Purchaser].[SalesPerson-Purchaser].[SUM ALL]} + " + */
			"       TOPCOUNT([SalesPerson-Purchaser].[SalesPerson-Purchaser].Members," +
			"       100," +
			"       [Measures].[Avg Payables])\n" + 
			"	ON 1   \n" + 
			"	FROM [PAYABLES]\n" + 
			"	WHERE {\n" + 
			"		{{[Vendor Posting Group].[Vendor Posting Group].&[TUZ]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}},  \n" + 
			"		{{[Vendor Posting Group].[Vendor Posting Group].&[ZAH]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}} \n" + 
			"	}\n" + 
			" ";
	
	
	/**
  	 */
	public static String payables_all =
			"WITH\n" + 
			"	MEMBER [SalesPerson-Purchaser].[SalesPerson-Purchaser].[BBB] AS\n" + 
			"	SUM   (TOPCOUNT (\n" + 
			"			NonEmpty([SalesPerson-Purchaser].[SalesPerson-Purchaser].Members),\n" + 
			"			10,\n" + 
			"			[Measures].[Avg Payables]\n" + 
			"			), [Measures].[Avg Payables]\n" + 
			"	)\n" + 
			"	\n" + 
			"	MEMBER [SalesPerson-Purchaser].[SalesPerson-Purchaser].[SUM ALL] AS\n" + 
			"	SUM(\n" + 
			"			NonEmpty([SalesPerson-Purchaser].[SalesPerson-Purchaser].[SalesPerson-Purchaser].Members),\n" + 
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
		/*	"		{[SalesPerson-Purchaser].[SalesPerson-Purchaser].[SUM ALL]} + " + */
			"       ORDER([SalesPerson-Purchaser].[SalesPerson-Purchaser].Members," +
			"       [Measures].[Avg Payables], DESC)\n" + 
			"	ON 1   \n" + 
			"	FROM [PAYABLES]\n" + 
			"	WHERE {\n" + 
			"		{{[Vendor Posting Group].[Vendor Posting Group].&[TUZ]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}},  \n" + 
			"		{{[Vendor Posting Group].[Vendor Posting Group].&[ZAH]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}} \n" + 
			"	}\n" + 
			" ";
	
	
	/**
  	 */
	public static String payables_all0 =
			"WITH\n" + 
			"	MEMBER [SalesPerson-Purchaser].[SalesPerson-Purchaser].[BBB] AS\n" + 
			"	SUM   (TOPCOUNT (\n" + 
			"			NonEmpty([SalesPerson-Purchaser].[SalesPerson-Purchaser].Members),\n" + 
			"			10,\n" + 
			"			[Measures].[Avg Payables]\n" + 
			"			), [Measures].[Avg Payables]\n" + 
			"	)\n" + 
			"	\n" + 
			"	MEMBER [SalesPerson-Purchaser].[SalesPerson-Purchaser].[SUM ALL] AS\n" + 
			"	SUM(\n" + 
			"			NonEmpty([SalesPerson-Purchaser].[SalesPerson-Purchaser].[SalesPerson-Purchaser].Members),\n" + 
			"			([Measures].[Avg Payables])\n" + 
			"	)\n" + 
			"	SELECT NON EMPTY {\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[ -90]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[ -60]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[ -30]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[0].&[   0]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[0]} * {[Measures].[Avg Payables]}) \n" + 
			"	}\n" + 
			"	ON 0,   \n" + 
			"		NON EMPTY \n" + 
		/*	"		{[SalesPerson-Purchaser].[SalesPerson-Purchaser].[SUM ALL]} + " + */
			"       ORDER([SalesPerson-Purchaser].[SalesPerson-Purchaser].Members," +
			"       [Measures].[Avg Payables], DESC)\n" + 
			"	ON 1   \n" + 
			"	FROM [PAYABLES]\n" + 
			"	WHERE {\n" + 
			"		{{[Vendor Posting Group].[Vendor Posting Group].&[TUZ]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}},  \n" + 
			"		{{[Vendor Posting Group].[Vendor Posting Group].&[ZAH]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}} \n" + 
			"	}\n" + 
			" ";
	
	
	
	/**
  	 */
	public static String payables_all90 =
			"WITH\n" + 
			"	MEMBER [SalesPerson-Purchaser].[SalesPerson-Purchaser].[BBB] AS\n" + 
			"	SUM   (TOPCOUNT (\n" + 
			"			NonEmpty([SalesPerson-Purchaser].[SalesPerson-Purchaser].Members),\n" + 
			"			10,\n" + 
			"			[Measures].[Avg Payables]\n" + 
			"			), [Measures].[Avg Payables]\n" + 
			"	)\n" + 
			"	\n" + 
			"	MEMBER [SalesPerson-Purchaser].[SalesPerson-Purchaser].[SUM ALL] AS\n" + 
			"	SUM(\n" + 
			"			NonEmpty([SalesPerson-Purchaser].[SalesPerson-Purchaser].[SalesPerson-Purchaser].Members),\n" + 
			"			([Measures].[Avg Payables])\n" + 
			"	)\n" + 
			"	SELECT NON EMPTY {\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[  30]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[  60]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[  90]} * {[Measures].[Avg Payables]}) \n" + 
			"	}\n" + 
			"	ON 0,   \n" + 
			"		NON EMPTY \n" + 
		/*	"		{[SalesPerson-Purchaser].[SalesPerson-Purchaser].[SUM ALL]} + " + */
			"       ORDER([SalesPerson-Purchaser].[SalesPerson-Purchaser].Members," +
			"       [Measures].[Avg Payables], DESC)\n" + 
			"	ON 1   \n" + 
			"	FROM [PAYABLES]\n" + 
			"	WHERE {\n" + 
			"		{{[Vendor Posting Group].[Vendor Posting Group].&[TUZ]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}},  \n" + 
			"		{{[Vendor Posting Group].[Vendor Posting Group].&[ZAH]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}} \n" + 
			"	}\n" + 
			" ";
	
	
	/**
  	 */
	public static String payables_allNaN =
			"WITH\n" + 
			"	MEMBER [SalesPerson-Purchaser].[SalesPerson-Purchaser].[BBB] AS\n" + 
			"	SUM   (TOPCOUNT (\n" + 
			"			NonEmpty([SalesPerson-Purchaser].[SalesPerson-Purchaser].Members),\n" + 
			"			10,\n" + 
			"			[Measures].[Avg Payables]\n" + 
			"			), [Measures].[Avg Payables]\n" + 
			"	)\n" + 
			"	\n" + 
			"	MEMBER [SalesPerson-Purchaser].[SalesPerson-Purchaser].[SUM ALL] AS\n" + 
			"	SUM(\n" + 
			"			NonEmpty([SalesPerson-Purchaser].[SalesPerson-Purchaser].[SalesPerson-Purchaser].Members),\n" + 
			"			([Measures].[Avg Payables])\n" + 
			"	)\n" + 
			"	SELECT NON EMPTY {\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 120]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 150]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 180]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 365]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[ 730]} * {[Measures].[Avg Payables]}),\n" + 
			"			({[Due Analysis].[Due Analysis].[Due Overdue].&[1].&[1000]} * {[Measures].[Avg Payables]}) \n" + 
			"	}\n" + 
			"	ON 0,   \n" + 
			"		NON EMPTY \n" + 
		/*	"		{[SalesPerson-Purchaser].[SalesPerson-Purchaser].[SUM ALL]} + " + */
			"       ORDER([SalesPerson-Purchaser].[SalesPerson-Purchaser].Members," +
			"       [Measures].[Avg Payables], DESC)\n" + 
			"	ON 1   \n" + 
			"	FROM [PAYABLES]\n" + 
			"	WHERE {\n" + 
			"		{{[Vendor Posting Group].[Vendor Posting Group].&[TUZ]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}},  \n" + 
			"		{{[Vendor Posting Group].[Vendor Posting Group].&[ZAH]} * {[Company].[Company].&[TAJMAC-ZPS, a_s_]}} \n" + 
			"	}\n" + 
			" ";
	


	

	
	public static String payables_admin_parm =
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
			"	 ([Vendor].[Vendor].[Vendor]) * ([Document Payables].[Document No].[Document No])\n" + 
			"	}\n" + 
			"ON 1\n" + 
			"	FROM [Payables]\n" +
			"WHERE\n"+
			"";
	

}
