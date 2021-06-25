package com.zps.models.ibm.db2.query.strings;

public interface IBMDB2SqlQueryStrings {
	
	public static String zamestQueryValues = "SELECT OSCIS, PRIJMENI, JMENO, TITUL, ODD, NAZODD FROM UP_ZPST2.ZAMEST";
	
	public static String msSqlDBValue = "SELECT [timestamp],[Code],[Name],[Commission _],[Global Dimension 1 Code],[Global Dimension 2 Code],[E-Mail],[Phone No_],[Job Title],[Search E-Mail],[E-Mail 2],[Instant Messaging],[Mobile Phone No_] FROM [NAV2009].[dbo].[TAJMAC-ZPS, a_s_$Salesperson_Purchaser] ";;

}
