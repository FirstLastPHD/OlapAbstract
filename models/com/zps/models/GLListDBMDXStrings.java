package com.zps.models;

public interface GLListDBMDXStrings {
	//GENERAL LEDGER ALL
		public static String gl_dim0 =
				"SELECT \n" + 
				"NON EMPTY \n" + 
				"{[Measures].[Opening Balance],[Measures].[Debit],[Measures].[Credit],[Measures].[Balance],[Measures].[Net Change]} \n" + 
				"ON 0, \n" + 
				"NON EMPTY \n" + 
				"[Dimension2].[Dimension2].Members \n" + 
				"ON 1 \n" + 
				"FROM \n" + 
				"[General Ledger]  \n" + 
				"";

		
		
		public static String gl_dim1 =

				//GENERAL LEDGER SELECT
				"SELECT \n" + 
				"NON EMPTY \n" + 
				"{[Measures].[Opening Balance],[Measures].[Debit],[Measures].[Credit],[Measures].[Balance],[Measures].[Net Change]} \n" + 
				"ON 0, \n" + 
				"NON EMPTY \n" + 
				"[Dimension1].[Dimension1].[Dimension1]*[GL Account].[GL Account by Levels]  \n" + 
				"ON 1 \n" + 
				"FROM \n" + 
				"[General Ledger]  \n" + 
				"WHERE ";
				//"[Dimension2].[Dimension2].&[1000]";
				
		
		
		public static String gl_dim2 =
				
				"SELECT \n" + 
				"NON EMPTY \n" + 
				"{[Measures].[Opening Balance],[Measures].[Debit],[Measures].[Credit],[Measures].[Balance],[Measures].[Net Change]} \n" + 
				"ON 0,  \n" + 
				"NON EMPTY \n" + 
				"[GL Account].[GL Account by Levels].[GL Account level 1]  \n" + 
				"ON 1 \n" + 
				"FROM \n" + 
				"[General Ledger] \n" + 
				"WHERE "; 
				//"[Dimension1].[Dimension1].&[1190] "; 
		
		public static String gl_costs_dim0 =
				
				"SELECT  \n" + 
				"NON EMPTY \n" + 
				"{[Measures].[Opening Balance],[Measures].[Debit],[Measures].[Credit],[Measures].[Balance],[Measures].[Net Change]}  \n" + 
				"ON 0,  \n" + 
				"NON EMPTY  \n" + 
				"[Dimension2].[Dimension2].Members  \n" + 
				"ON 1  \n" + 
				"FROM  \n" + 
				"[General Ledger]  \n" + 
				"WHERE  \n" + 
				"[GL Account].[GL Account by Levels].[GL Account level 1].&[500000]\n";
		
		public static String gl_costs_dim1 =
				
				"SELECT \n" + 
				"NON EMPTY \n" + 
				"{[Measures].[Opening Balance],[Measures].[Debit],[Measures].[Credit],[Measures].[Balance],[Measures].[Net Change]} \n" + 
				"ON 0, \n" + 
				"NON EMPTY \n" + 
				"[Dimension1].[Dimension1].[Dimension1] * [GL Account].[GL Account by Levels].[GL Account level 1].&[500000]\n" + 
				"ON 1 \n" + 
				"FROM \n" + 
				"[General Ledger] \n" + 
				"WHERE \n" + 
				//"[Dimension2].[Dimension2].&[1000]		\n" + 
				"";
				
				
		public static String gl_costs_all =
				
				"SELECT \n" + 
				"NON EMPTY \n" + 
				"{[Measures].[Opening Balance],[Measures].[Debit],[Measures].[Credit],[Measures].[Balance],[Measures].[Net Change]} \n" + 
				"ON 0, \n" + 
				"NON EMPTY \n" + 
				"[Dimension1].[Dimension1].[Dimension1] * [GL Account].[GL Account by Levels].[GL Account level 1].&[500000]\n" + 
				"ON 1 \n" + 
				"FROM \n" + 
				"[General Ledger] \n" + 
				"";
				
		

		public static String gl_naklady =
		"WITH \n" + 
		"\n" + 
		"MEMBER [Measures].[Date1] as  ([Measures].[Balance], [Date].[Date YMD].[Day].&[DATE0000])\n" + 
		"MEMBER [Measures].[Date2] as  ([Measures].[Balance], [Date].[Date YMD].[Day].&[DATE0001])\n" + 
		"//--------------------------------------------------------------------------------\n" + 
		"\n" + 
		"MEMBER [Measures].[NAKLADY] AS   \n" + 
		"       [Measures].[Date2] - [Measures].[Date1] " +		
		"\n" + 
		"//--------------------------------------------------------------------------------\n" + 
		"\n" + 
		"MEMBER [GL Account].[GL Account by Levels].[501 - Spotreba materialu] AS \n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[501000] \n" + 
		"\n" + 
		"MEMBER [GL Account].[GL Account by Levels].[502 - Spotreba energie] AS \n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[502000] \n" + 
		" \n" + 
		"MEMBER [GL Account].[GL Account by Levels].[50] AS \n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[501000]+\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[502000]\n" + 
		"//--------------------------------------------------------------------------------\n" + 
		"MEMBER [GL Account].[GL Account by Levels].[511 - Opravy a udrzba] AS \n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[511000] \n" + 
		" \n" + 
		"MEMBER [GL Account].[GL Account by Levels].[512 - Cestovne] AS \n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[512000] \n" + 
		" \n" + 
		"MEMBER [GL Account].[GL Account by Levels].[513 - Naklady na reprezentaci] AS \n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[513000] \n" + 
		" \n" + 
		" MEMBER [GL Account].[GL Account by Levels].[518 - Ostatni sluzby] AS \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[518000] \n" + 
		"  \n" + 
		" MEMBER [GL Account].[GL Account by Levels].[51] AS \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[512000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[513000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[518000] \n" + 
		"//--------------------------------------------------------------------------------\n" + 
		"\n" + 
		" MEMBER [GL Account].[GL Account by Levels].[521 - Mzdove naklady] AS \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[521000] \n" + 
		"\n" + 
		" MEMBER [GL Account].[GL Account by Levels].[523 - Odmeny organum spolecnosti] AS \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[523000] \n" + 
		"\n" + 
		" MEMBER [GL Account].[GL Account by Levels].[524 - Zakonne socialni pojisteni] AS \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[524000] \n" + 
		"  \n" + 
		" MEMBER [GL Account].[GL Account by Levels].[527 - Zakonne socialni naklady] AS \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[527000] \n" + 
		"  \n" + 
		" MEMBER [GL Account].[GL Account by Levels].[528 - Ostatni socialni naklady] AS \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[528000] \n" + 
		"  \n" + 
		" MEMBER [GL Account].[GL Account by Levels].[52] AS \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[521000]+\n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[523000]+\n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[524000]+\n" + 
		"     [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[527000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[528000] \n" + 
		"//--------------------------------------------------------------------------------\n" + 
		" \n" + 
		" MEMBER [GL Account].[GL Account by Levels].[531 - Dan silnicni] AS \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[531000] \n" + 
		"\n" + 
		" MEMBER [GL Account].[GL Account by Levels].[532 - Dan z nemovistosti] AS \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[532000] \n" + 
		"\n" + 
		" MEMBER [GL Account].[GL Account by Levels].[538 - Ostatni dane a poplatky] AS \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[538000] \n" + 
		"  \n" + 
		" MEMBER [GL Account].[GL Account by Levels].[53] AS \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[531000]+\n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[532000]+\n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[538000] \n" + 
		"//--------------------------------------------------------------------------------\n" + 
		"\n" + 
		" MEMBER [GL Account].[GL Account by Levels].[541 - Zustat. cena prodaneho DM] AS \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[541000] \n" + 
		"\n" + 
		" MEMBER [GL Account].[GL Account by Levels].[542 - Prodany material] AS \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[542000] \n" + 
		"\n" + 
		" MEMBER [GL Account].[GL Account by Levels].[543 - Dary] AS \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[543000] \n" + 
		"\n" + 
		" MEMBER [GL Account].[GL Account by Levels].[544 - Smluvni pokuty a penale] AS \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[544000] \n" + 
		"\n" + 
		" MEMBER [GL Account].[GL Account by Levels].[545 - Ostatni pokuty a penale] AS \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[545000] \n" + 
		"\n" + 
		" MEMBER [GL Account].[GL Account by Levels].[546 - Odpis pohledavky] AS \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[546000] \n" + 
		"  \n" + 
		" MEMBER [GL Account].[GL Account by Levels].[548 - Ostatni provozni naklady] AS \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[548000] \n" + 
		"  \n" + 
		" MEMBER [GL Account].[GL Account by Levels].[549 - Manka a skody] AS \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[549000] \n" + 
		"  \n" + 
		" MEMBER [GL Account].[GL Account by Levels].[54] AS \n" + 
		"  	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[541000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[542000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[543000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[544000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[545000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[546000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[548000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[549000] \n" + 
		"//--------------------------------------------------------------------------------\n" + 
		"\n" + 
		" MEMBER [GL Account].[GL Account by Levels].[551 - Odpisy DNM a DHM] AS \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[551000] \n" + 
		"\n" + 
		" MEMBER [GL Account].[GL Account by Levels].[554 - Tvorba a zuctovani ostatnich rezerv] AS \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[554000] \n" + 
		"\n" + 
		" MEMBER [GL Account].[GL Account by Levels].[558 - Tvorba a zuctovani zakon. OP] AS \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[558000] \n" + 
		"\n" + 
		" MEMBER [GL Account].[GL Account by Levels].[559 - Tvorba a zuctovani OP] AS \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[559000] \n" + 
		"\n" + 
		"MEMBER [GL Account].[GL Account by Levels].[55] AS \n" + 
		"  	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[551000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[554000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[558000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[559000] \n" + 
		"//--------------------------------------------------------------------------------\n" + 
		" \n" + 
		" MEMBER [GL Account].[GL Account by Levels].[561 - Prodane CP] AS \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[561000] \n" + 
		" \n" + 
		" MEMBER [GL Account].[GL Account by Levels].[562 - Uroky] AS \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[562000] \n" + 
		"  \n" + 
		" MEMBER [GL Account].[GL Account by Levels].[563 - Kurzove ztraty] AS \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[563000] \n" + 
		" \n" + 
		" MEMBER [GL Account].[GL Account by Levels].[567 - Naklady z derivatovych operaci] AS \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[567000] \n" + 
		" \n" + 
		" MEMBER [GL Account].[GL Account by Levels].[568 - Ostatni financni naklady] AS \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[568000] \n" + 
		"  \n" + 
		" MEMBER [GL Account].[GL Account by Levels].[56] AS \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[561000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[562000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[563000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[567000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[568000] \n" +
		"//--------------------------------------------------------------------------------\n" +
		/* doplneno dne 2016-11-14
		 * 581000..581999            Změna stavu NV
		 * 583000..583999            Změna stavu výrobků
		 * 585000..585999            Aktivace materiálu a zboží
		 * 586000..586999            Aktivace vnitropodnikových služeb
		 * 588000..588999            Aktivace DHM
		 */
		" \n" + 
		" MEMBER [GL Account].[GL Account by Levels].[581 - Změna stavu NV] AS \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[581000] \n" + 
		" \n" + 
		" MEMBER [GL Account].[GL Account by Levels].[583 - Změna stavu výrobků] AS \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[583000] \n" + 
		"  \n" + 
		" MEMBER [GL Account].[GL Account by Levels].[585 - Aktivace materiálu a zboží] AS \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[585000] \n" + 
		" \n" + 
		" MEMBER [GL Account].[GL Account by Levels].[586 - Aktivace vnitropodnikových služeb] AS \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[586000] \n" + 
		" \n" + 
		" MEMBER [GL Account].[GL Account by Levels].[588 - Aktivace DHM] AS \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[588000] \n" + 
		"  \n" + 
		" MEMBER [GL Account].[GL Account by Levels].[58] AS \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[581000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[583000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[585000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[586000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[588000] \n" + 
		
		"//--------------------------------------------------------------------------------\n" + 
		" \n" + 
		" MEMBER [GL Account].[GL Account by Levels].[591 - Dan z prijmu z bez.c. - splatna] AS \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[591000] \n" + 
		"  \n" + 
		" MEMBER [GL Account].[GL Account by Levels].[592 - Dan z prijmu z bez.c. - odlozena] AS \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[592000] \n" + 
		"  \n" + 
		" MEMBER [GL Account].[GL Account by Levels].[595 - Dodatecne odvody a dane z prijmu] AS \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[595000] \n" + 
		"  \n" + 
		" MEMBER [GL Account].[GL Account by Levels].[599 - Vnitropodnikove naklady] AS \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[599000] \n" + 
		"  \n" + 
		"\n" + 
		" MEMBER [GL Account].[GL Account by Levels].[59] AS \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[591000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[592000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[595000]+ \n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[599000] \n" + 
		"  \n" + 
		" MEMBER [GL Account].[GL Account by Levels].[] AS  0 \n" + 
		"  \n" + 
		" MEMBER [GL Account].[GL Account by Levels].[Naklady celkem - MD] AS \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[501000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[502000]+ \n" + 
		"//--------------------------------------------------------------------------------\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[511000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[512000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[513000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[518000]+ \n" + 
		"//--------------------------------------------------------------------------------\n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[521000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[523000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[524000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[527000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[528000]+ \n" + 
		"//--------------------------------------------------------------------------------\n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[531000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[532000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[538000]+ \n" + 
		"//--------------------------------------------------------------------------------\n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[541000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[542000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[543000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[544000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[545000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[546000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[548000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[549000]+ \n" + 
		"//--------------------------------------------------------------------------------\n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[551000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[554000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[558000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[559000]+ \n" + 
		"//--------------------------------------------------------------------------------\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[561000]+ \n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[562000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[563000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[567000]+ \n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[568000]+ \n" +
		"//--------------------------------------------------------------------------------\n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[581000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[583000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[585000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[586000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[588000]+ \n" + 
		"//--------------------------------------------------------------------------------\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[591000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[592000]+ \n" + 
		" 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[595000]+ \n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[599000] \n" + 
		"  \n" + 
		"  \n" + 
		" SELECT   \n" + 
		" NON EMPTY   \n" + 
		"      [Measures].[NAKLADY]   \n" + 
		" ON 0,   \n" + 
		"	//\"NON EMPTY  \n" + 
		" { \n" + 
		"      [GL Account].[GL Account by Levels].[501 - Spotreba materialu],  \n" + 
		"      [GL Account].[GL Account by Levels].[502 - Spotreba energie],  \n" + 
		"      [GL Account].[GL Account by Levels].[50],  \n" + 
		"//--------------------------------------------------------------------------------\n" + 
		"      [GL Account].[GL Account by Levels].[511 - Opravy a udrzba],  \n" + 
		"      [GL Account].[GL Account by Levels].[512 - Cestovne],  \n" + 
		"      [GL Account].[GL Account by Levels].[513 - Naklady na reprezentaci],  \n" + 
		"      [GL Account].[GL Account by Levels].[518 - Ostatni sluzby],  \n" + 
		"      [GL Account].[GL Account by Levels].[51],  \n" + 
		"//--------------------------------------------------------------------------------\n" + 
		"      [GL Account].[GL Account by Levels].[521 - Mzdove naklady],  \n" + 
		"      [GL Account].[GL Account by Levels].[523 - Odmeny organum spolecnosti],  \n" + 
		"      [GL Account].[GL Account by Levels].[524 - Zakonne socialni pojisteni],  \n" + 
		"      [GL Account].[GL Account by Levels].[527 - Zakonne socialni naklady],  \n" + 
		"      [GL Account].[GL Account by Levels].[528 - Ostatni socialni naklady],  \n" + 
		"      [GL Account].[GL Account by Levels].[52],  \n" + 
		"//--------------------------------------------------------------------------------\n" + 
		"      [GL Account].[GL Account by Levels].[531 - Dan silnicni],  \n" + 
		"      [GL Account].[GL Account by Levels].[532 - Dan z nemovistosti],  \n" + 
		"      [GL Account].[GL Account by Levels].[538 - Ostatni dane a poplatky],  \n" + 
		"      [GL Account].[GL Account by Levels].[53],  \n" + 
		"//--------------------------------------------------------------------------------\n" + 
		"      [GL Account].[GL Account by Levels].[541 - Zustat. cena prodaneho DM],  \n" + 
		"      [GL Account].[GL Account by Levels].[542 - Prodany material],  \n" + 
		"      [GL Account].[GL Account by Levels].[543 - Dary],  \n" + 
		"      [GL Account].[GL Account by Levels].[544 - Smluvni pokuty a penale],  \n" + 
		"      [GL Account].[GL Account by Levels].[545 - Ostatni pokuty a penale],  \n" + 
		"      [GL Account].[GL Account by Levels].[546 - Odpis pohledavky],  \n" + 
		"      [GL Account].[GL Account by Levels].[548 - Ostatni provozni naklady],  \n" + 
		"      [GL Account].[GL Account by Levels].[549 - Manka a skody]  ,\n" + 
		"      [GL Account].[GL Account by Levels].[54],  \n" + 
		"//--------------------------------------------------------------------------------\n" + 
		"      [GL Account].[GL Account by Levels].[551 - Odpisy DNM a DHM],  \n" + 
		"      [GL Account].[GL Account by Levels].[554 - Tvorba a zuctovani ostatnich rezerv],  \n" + 
		"      [GL Account].[GL Account by Levels].[558 - Tvorba a zuctovani zakon. OP],  \n" + 
		"      [GL Account].[GL Account by Levels].[559 - Tvorba a zuctovani OP],  \n" + 
		"      [GL Account].[GL Account by Levels].[55],  \n" + 
		"//--------------------------------------------------------------------------------\n" + 
		"      [GL Account].[GL Account by Levels].[561 - Prodane CP], \n"+
		"      [GL Account].[GL Account by Levels].[562 - Uroky],  \n" + 
		"      [GL Account].[GL Account by Levels].[563 - Kurzove ztraty],  \n" + 
		"      [GL Account].[GL Account by Levels].[],   \n" + 
		"      [GL Account].[GL Account by Levels].[567 - Naklady z derivatovych operaci],  \n" + 
		"      [GL Account].[GL Account by Levels].[568 - Ostatni financni naklady],  \n" + 
		"      [GL Account].[GL Account by Levels].[56],  \n" + 
		"//--------------------------------------------------------------------------------\n" + 
		"      [GL Account].[GL Account by Levels].[581 - Změna stavu NV], \n" + 
		"      [GL Account].[GL Account by Levels].[583 - Změna stavu výrobků], \n" + 
		"      [GL Account].[GL Account by Levels].[585 - Aktivace materiálu a zboží], \n" + 
		"      [GL Account].[GL Account by Levels].[586 - Aktivace vnitropodnikových služeb], \n" + 
		"      [GL Account].[GL Account by Levels].[588 - Aktivace DHM], \n" + 
		"      [GL Account].[GL Account by Levels].[58], \n" + 
		"//--------------------------------------------------------------------------------\n" + 
		"      [GL Account].[GL Account by Levels].[591 - Dan z prijmu z bez.c. - splatna],  \n" + 
		"      [GL Account].[GL Account by Levels].[592 - Dan z prijmu z bez.c. - odlozena],  \n" + 
		"      [GL Account].[GL Account by Levels].[595 - Dodatecne odvody a dane z prijmu],  \n" + 
		"      [GL Account].[GL Account by Levels].[599 - Vnitropodnikove naklady],  \n" + 
		"      [GL Account].[GL Account by Levels].[59],  \n" + 
		"      [GL Account].[GL Account by Levels].[],   \n" + 
		"      [GL Account].[GL Account by Levels].[Naklady celkem - MD]  \n" + 
		" } \n" + 
		" ON 1   \n" + 
		" FROM   \n" + 
		" [General Ledger]    \n" + 
		" WHERE  \n" + 
		"     [Company].[Company].&[TAJMAC-ZPS, a_s_] \n" + 
		"\n" + 
		"";		
		
		public static String gl_vynosy =
		"WITH\n" +
		"\n" + 
		"MEMBER [Measures].[Date1] as  ([Measures].[Balance], [Date].[Date YMD].[Day].&[DATE0000])\n" + 
		"MEMBER [Measures].[Date2] as  ([Measures].[Balance], [Date].[Date YMD].[Day].&[DATE0001])\n" + 
		"//--------------------------------------------------------------------------------\n" + 
		"\n" + 
		"MEMBER [Measures].[VYNOSY] AS   \n" + 
		"      [Measures].[Date2] - [Measures].[Date1] " +		
		"\n" + 
		"//--------------------------------------------------------------------------------\n" + 
		"\n" + 
		"MEMBER [GL Account].[GL Account by Levels].[601 Trzby za vlastni vyrobky] AS\n" + 
		"     [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[601000]\n" + 
		"\n" + 
		"MEMBER [GL Account].[GL Account by Levels].[602 Trzby z prodeje sluzeb] AS\n" + 
		"     [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[602000]\n" + 
		"\n" + 
		"MEMBER [GL Account].[GL Account by Levels].[60] AS\n" + 
		"     [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[601000]+\n" + 
		"     [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[602000]\n" + 
		"//-----------------------------------------------------------------------------------------\n" + 
		"\n" + 
		"MEMBER [GL Account].[GL Account by Levels].[611 Zmena stavu nedokoncene vyroby] AS\n" + 
		"     [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[611000]\n" + 
		"\n" + 
		"MEMBER [GL Account].[GL Account by Levels].[613 Zmena stavu vyrobku] AS\n" + 
		"     [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[613000]\n" + 
		"\n" + 
		"MEMBER [GL Account].[GL Account by Levels].[61] AS\n" + 
		"     [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[611000]+\n" + 
		"     [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[613000]\n" + 
		"//-----------------------------------------------------------------------------------------\n" + 
		"\n" + 
		"MEMBER [GL Account].[GL Account by Levels].[621 Aktivace materialu a zbozi] AS\n" + 
		"     [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[621000]\n" + 
		"\n" + 
		"MEMBER [GL Account].[GL Account by Levels].[624 Aktivace DHM] AS\n" + 
		"     [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[624000]\n" + 
		"\n" + 
		"MEMBER [GL Account].[GL Account by Levels].[62] AS\n" + 
		"     [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[621000]+\n" + 
		"     [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[624000]\n" + 
		"//-----------------------------------------------------------------------------------------\n" + 
		"\n" + 
		"MEMBER [GL Account].[GL Account by Levels].[641 Trzby z prodeje DNM a DHM] AS\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[641000]\n" + 
		"\n" + 
		"MEMBER [GL Account].[GL Account by Levels].[642 Trzby z prodeje materialu] AS\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[642000]\n" + 
		"\n" + 
		"MEMBER [GL Account].[GL Account by Levels].[644 Smluvni pokuty a uroky] AS\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[644000]\n" + 
		"\n" + 
		"MEMBER [GL Account].[GL Account by Levels].[648 Ostatni provozni vynosy] AS\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[648000]\n" + 
		"\n" + 
		"MEMBER [GL Account].[GL Account by Levels].[64] AS\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[641000]+\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[642000]+\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[644000]+\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[648000]\n" + 
		"//-----------------------------------------------------------------------------------------\n" + 
		" \n" + 
		"MEMBER [GL Account].[GL Account by Levels].[661 Trzby z prodeje CP] AS\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[661000]\n" + 
		" \n" + 
		"MEMBER [GL Account].[GL Account by Levels].[662 Uroky] AS\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[662000]\n" + 
		"\n" + 
		"MEMBER [GL Account].[GL Account by Levels].[663 Kurzove zisky] AS\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[663000]\n" + 
		"\n" + 
		"MEMBER [GL Account].[GL Account by Levels].[665 Vynosy z DFM] AS\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[665000]\n" + 
		"\n" + 
		"MEMBER [GL Account].[GL Account by Levels].[667 Vynosy z derivatovych operaci] AS\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[667000]\n" + 
		"\n" + 
		"MEMBER [GL Account].[GL Account by Levels].[668 Ostat fin. vynosy] AS\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[668000]\n" + 
		"\n" + 
		"MEMBER [GL Account].[GL Account by Levels].[66] AS\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[661000]+\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[662000]+\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[663000]+\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[665000]+\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[667000]+\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[668000]\n" + 
		"//-----------------------------------------------------------------------------------------\n" + 
		"\n" + 
		"MEMBER [GL Account].[GL Account by Levels].[699 Vnitropodnikove vynosy] AS\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[699000]\n" + 
		"\n" + 
		"MEMBER [GL Account].[GL Account by Levels].[69] AS\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[699000]\n" + 
		"//-----------------------------------------------------------------------------------------\n" + 
		"\n" + 
		"MEMBER [GL Account].[GL Account by Levels].[] AS 0 \n" + 
		"\n" + 
		"MEMBER [GL Account].[GL Account by Levels].[Vynosy celkem - DAL] AS\n" + 
		"     [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[601000]+\n" + 
		"     [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[602000]+\n" + 
		"//-----------------------------------------------------------------------------------------\n" + 
		"     [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[611000]+\n" + 
		"     [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[613000]+\n" + 
		"//-----------------------------------------------------------------------------------------\n" + 
		"     [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[621000]+\n" + 
		"     [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[624000]+\n" + 
		"//-----------------------------------------------------------------------------------------\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[641000]+\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[642000]+\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[644000]+\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[648000]+\n" + 
		"//-----------------------------------------------------------------------------------------\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[661000]+\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[662000]+\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[663000]+\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[665000]+\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[667000]+\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[668000]+\n" + 
		"//-----------------------------------------------------------------------------------------\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[699000]\n" + 
		"\n" +
		"MEMBER [Measures].[VYNOSY-INV] AS [Measures].[VYNOSY] * (-1) \n"+
		"\n" + 
		"SELECT  \n" + 
		"NON EMPTY  \n" + 
		"{[Measures].[VYNOSY-INV]}\n" + 
		"ON 0,  \n" + 
		"//NON EMPTY  \n" + 
		"{\n" + 
		"[GL Account].[GL Account by Levels].[601 Trzby za vlastni vyrobky],\n" + 
		"[GL Account].[GL Account by Levels].[602 Trzby z prodeje sluzeb],\n" + 
		"[GL Account].[GL Account by Levels].[60],\n" + 
		"[GL Account].[GL Account by Levels].[611 Zmena stavu nedokoncene vyroby],\n" + 
		"[GL Account].[GL Account by Levels].[],\n" + 
		"[GL Account].[GL Account by Levels].[613 Zmena stavu vyrobku],\n" + 
		"[GL Account].[GL Account by Levels].[],\n" + 
		"[GL Account].[GL Account by Levels].[61],\n" + 
		"[GL Account].[GL Account by Levels].[621 Aktivace materialu a zbozi],\n" + 
		"[GL Account].[GL Account by Levels].[],\n" + 
		"[GL Account].[GL Account by Levels].[624 Aktivace DHM],\n" + 
		"[GL Account].[GL Account by Levels].[],\n" + 
		"[GL Account].[GL Account by Levels].[],\n" + 
		"[GL Account].[GL Account by Levels].[62],\n" + 
		"[GL Account].[GL Account by Levels].[],\n" + 
		"[GL Account].[GL Account by Levels].[],\n" + 
		"[GL Account].[GL Account by Levels].[],\n" + 
		"[GL Account].[GL Account by Levels].[],\n" + 
		"[GL Account].[GL Account by Levels].[641 Trzby z prodeje DNM a DHM],\n" + 
		"[GL Account].[GL Account by Levels].[642 Trzby z prodeje materialu],\n" + 
		"[GL Account].[GL Account by Levels].[],\n" + 
		"[GL Account].[GL Account by Levels].[644 Smluvni pokuty a uroky],\n" + 
		"[GL Account].[GL Account by Levels].[],\n" + 
		"[GL Account].[GL Account by Levels].[],\n" + 
		"[GL Account].[GL Account by Levels].[648 Ostatni provozni vynosy],\n" + 
		"[GL Account].[GL Account by Levels].[],\n" + 
		"[GL Account].[GL Account by Levels].[64],\n" + 
		"[GL Account].[GL Account by Levels].[],\n" + 
		"[GL Account].[GL Account by Levels].[],\n" + 
		"[GL Account].[GL Account by Levels].[],\n" + 
		"[GL Account].[GL Account by Levels].[],\n" + 
		"[GL Account].[GL Account by Levels].[],\n" + 
		"[GL Account].[GL Account by Levels].[661 Trzby z prodeje CP],\n" + 
		"[GL Account].[GL Account by Levels].[662 Uroky],\n" + 
		"[GL Account].[GL Account by Levels].[663 Kurzove zisky],\n" + 
		"[GL Account].[GL Account by Levels].[665 Vynosy z DFM],\n" + 
		"[GL Account].[GL Account by Levels].[667 Vynosy z derivatovych operaci],\n" + 
		"[GL Account].[GL Account by Levels].[668 Ostat fin. vynosy],\n" + 
		"[GL Account].[GL Account by Levels].[66],\n" + 
		"[GL Account].[GL Account by Levels].[],\n" + 
		"[GL Account].[GL Account by Levels].[],\n" + 
		"[GL Account].[GL Account by Levels].[],\n" + 
		"[GL Account].[GL Account by Levels].[],\n" + 
		"[GL Account].[GL Account by Levels].[],\n" + 
		"[GL Account].[GL Account by Levels].[],\n" + 
		"[GL Account].[GL Account by Levels].[],\n" + 
		"[GL Account].[GL Account by Levels].[],\n" + 
		"[GL Account].[GL Account by Levels].[],\n" + 
		"[GL Account].[GL Account by Levels].[699 Vnitropodnikove vynosy],\n" + 
		"[GL Account].[GL Account by Levels].[69],\n" + 
		"[GL Account].[GL Account by Levels].[],\n" + 
		"[GL Account].[GL Account by Levels].[Vynosy celkem - DAL]\n" + 
		"}\n" + 
		"ON 1  \n" + 
		"FROM  \n" + 
		"[General Ledger]   \n" + 
		"WHERE \n" + 
		" [Company].[Company].&[TAJMAC-ZPS, a_s_] \n" + 
		"";		
		
		public static String gl_naklady_graf =
				
	    "WITH \n" + 
	    "\n" + 
		"MEMBER [Measures].[Date1] as  ([Measures].[Balance], [Date].[Date YMD].[Day].&[DATE0000])\n" + 
		"MEMBER [Measures].[Date2] as  ([Measures].[Balance], [Date].[Date YMD].[Day].&[DATE0001])\n" + 
	    "//--------------------------------------------------------------------------------\n" + 
	    "\n" + 
	    "MEMBER [Measures].[NAKLADY] AS   \n" + 
	    "       [Measures].[Date2] - [Measures].[Date1] \n" + 
	    "\n" + 
	    "\n" + 
	    " MEMBER [GL Account].[GL Account by Levels].[Naklady celkem - MD] AS \n" + 
	    " 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[501000]+ \n" + 
	    " 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[502000]+ \n" + 
	    "//--------------------------------------------------------------------------------\n" + 
	    "	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[511000]+ \n" + 
	    " 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[512000]+ \n" + 
	    " 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[513000]+ \n" + 
	    " 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[518000]+ \n" + 
	    "//--------------------------------------------------------------------------------\n" + 
	    " 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[521000]+ \n" + 
	    " 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[523000]+ \n" + 
	    " 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[524000]+ \n" + 
	    " 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[527000]+ \n" + 
	    " 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[528000]+ \n" + 
	    "//--------------------------------------------------------------------------------\n" + 
	    " 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[531000]+ \n" + 
	    " 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[532000]+ \n" + 
	    " 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[538000]+ \n" + 
	    "//--------------------------------------------------------------------------------\n" + 
	    " 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[541000]+ \n" + 
	    " 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[542000]+ \n" + 
	    " 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[543000]+ \n" + 
	    " 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[544000]+ \n" + 
	    " 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[545000]+ \n" + 
	    " 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[546000]+ \n" + 
	    " 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[548000]+ \n" + 
	    " 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[549000]+ \n" + 
	    "//--------------------------------------------------------------------------------\n" + 
	    " 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[551000]+ \n" + 
	    " 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[554000]+ \n" + 
	    " 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[558000]+ \n" + 
	    " 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[559000]+ \n" + 
	    "//--------------------------------------------------------------------------------\n" + 
	    "	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[561000]+ \n" + 
	    "	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[562000]+ \n" + 
	    " 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[563000]+ \n" + 
	    " 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[567000]+ \n" + 
	    "	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[568000]+ \n" + 
	    "//--------------------------------------------------------------------------------\n" + 
	    " 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[581000]+ \n" + 
	    " 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[583000]+ \n" + 
	    " 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[585000]+ \n" + 
	    " 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[586000]+ \n" + 
	    " 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[588000]+ \n" + 
	    "//--------------------------------------------------------------------------------\n" + 
	    "	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[591000]+ \n" + 
	    " 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[592000]+ \n" + 
	    " 	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[595000]+ \n" + 
	    "	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[550000].&[599000] \n" + 
	    "  \n" + 
	    " SELECT   \n" + 
	    " NON EMPTY   \n" + 
	    " {[GL Account].[GL Account by Levels].[Naklady celkem - MD]} * {[Measures].[NAKLADY]}    \n" + 
	    " ON 0   \n" + 
	    " FROM   \n" + 
	    " [General Ledger]    \n" + 
	    " WHERE  \n" + 
	    " [Company].[Company].&[TAJMAC-ZPS, a_s_] \n" + 
	    "\n" + 
		"";
		
		public static String gl_vynosy_graf =
	    "WITH \n" + 
	    "\n" + 
		"MEMBER [Measures].[Date1] as  ([Measures].[Balance], [Date].[Date YMD].[Day].&[DATE0000])\n" + 
		"MEMBER [Measures].[Date2] as  ([Measures].[Balance], [Date].[Date YMD].[Day].&[DATE0001])\n" + 
	    "//--------------------------------------------------------------------------------\n" + 
	    "\n" + 
	    "MEMBER [Measures].[VYNOSY] AS   \n" + 
	    "       [Measures].[Date2] - [Measures].[Date1] \n" + 
	    "\n" + 
	    "\n" + 
		"MEMBER [GL Account].[GL Account by Levels].[Vynosy - DAL] AS\n" +
		"     [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[601000]+\n" + 
		"     [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[602000]+\n" + 
		"//-----------------------------------------------------------------------------------------\n" + 
		"     [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[611000]+\n" + 
		"     [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[613000]+\n" + 
		"//-----------------------------------------------------------------------------------------\n" + 
		"     [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[621000]+\n" + 
		"     [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[624000]+\n" + 
		"//-----------------------------------------------------------------------------------------\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[641000]+\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[642000]+\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[644000]+\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[648000]+\n" + 
		"//-----------------------------------------------------------------------------------------\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[661000]+\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[662000]+\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[663000]+\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[665000]+\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[667000]+\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[668000]+\n" + 
		"//-----------------------------------------------------------------------------------------\n" + 
		"	 [GL Account].[GL Account by Levels].[GL Account level 1].&[500000].&[600000].&[699000]\n" + 
		"//-----------------------------------------------------------------------------------------\n" + 
		"// inverze hodnoty kvuli grafu - ve skutecnosti je vysledek na stane DAL tedy-zaporny      \n" + 
		"//-----------------------------------------------------------------------------------------\n" + 
		"MEMBER [Measures].[INV] AS [Measures].[VYNOSY] * (-1) \n"+
		"//-----------------------------------------------------------------------------------------\n" +
		
	    " SELECT   \n" + 
	    " NON EMPTY   \n" + 
	    " {[GL Account].[GL Account by Levels].[Vynosy - DAL]} * {[Measures].[INV]}    \n" + 
	    " ON 0   \n" + 
	    " FROM   \n" + 
	    " [General Ledger]    \n" + 
	    " WHERE  \n" + 
	    " [Company].[Company].&[TAJMAC-ZPS, a_s_] \n" + 
	    "\n" + 
		"";	


}
