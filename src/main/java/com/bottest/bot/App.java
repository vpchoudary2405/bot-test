package com.bottest.bot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.bottest.bot.models.BOTMessageMapperFactory;
import com.bottest.bot.models.BOTMessageMapperStrategy;
import com.bottest.bot.models.Field1Sorter;
import com.bottest.bot.models.Field2Sorter;
import com.bottest.bot.models.SummaryData;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      
        
        //testSort();
        
        testFlow();
    }

	private static void testFlow() {
		System.out.println("testFlow  !");
		
		/* MENO - id, code, IMID, type, price, desc
		 * MEOC - id, code, IMID, type, orderid
		 * MOOS - id, code, IMID, type, symbol, desc 
		 * 
		 */
		
		List<String> bfpo = Arrays.asList("43", "30", "C", "BFPO", "4.4", "eee");
		List<String> bdoc = Arrays.asList("4", "31", "C", "BDOC","","");
		List<String> bdos = Arrays.asList("4", "31", "C", "BDOS","","test" );
		List<List<String>> dataList = Arrays.asList(bfpo, bdoc, bdos);
		BOTMessageMapperFactory botMessageMapperFactory = new BOTMessageMapperFactory();

		List<BOTMessageMapperStrategy> messageDataList = new ArrayList<BOTMessageMapperStrategy>();
		
		for (List<String> list : dataList) {
			BOTMessageMapperStrategy mapper = botMessageMapperFactory.getMapperStratgey(list);
			messageDataList.add(mapper);
			mapper.getMessageType();
		}
		Collections.sort(messageDataList, Comparator.comparing(BOTMessageMapperStrategy::getId)
	            .thenComparing(BOTMessageMapperStrategy::getType)
	            );
		
		for ( BOTMessageMapperStrategy  mapper : messageDataList) {
			
			System.out.println("**************************************");
			System.out.println("MesageType data is  " +mapper.getMessageType());
			System.out.println("mapper data is  " + mapper.getData());
			System.out.println("Summary data is    " + mapper.getSummaryData());
			System.out.println("**************************************");
		}
		
		System.out.println("bot testFlow " + dataList);

	}

	private static void testSort() {
		  System.out.println( "Hello World 3 !" );
	        
	        List<SummaryData> list = Arrays.asList(new SummaryData("4", "30", "C", "D","4.4", "C"), 
	                new SummaryData("4",  "34", "C", "D","4.4", "C"), 
	                new SummaryData("4",   "33", "C", "D","4.4", "C"), 
	                new SummaryData("5",  "31", "C", "D","4.4", "C"));
			/*
			 * //Compare by first name and then last name Comparator<SummaryData>
			 * compareByName = Comparator .comparing(SummaryData::getField4)
			 * .thenComparing(SummaryData::getField1);
			 * 
			 * List<SummaryData> sortedEmployees = list.stream() .sorted(compareByName)
			 * .collect(Collectors.toList());
			 */

	         Collections.sort(list, new Field1Sorter()
	                .thenComparing( new Field2Sorter()));
	        
	        System.out.println( "Sorted List is " + list );
		
	}
     
	/*
	 * Comparator<SummaryData> Field1Comparator = new Comparator<SummaryData>() {
	 * public int compare(SummaryData o1, SummaryData o2) { String field1 =
	 * o1.getField1()!="" ? o1.getField1() :""; String field2 = o2.getField1()!="" ?
	 * o2.getField1() :"";
	 * 
	 * return field1.compareTo(field2); } };
	 * 
	 * Comparator<SummaryData> Field4Comparator = new Comparator<SummaryData>() {
	 * public int compare(SummaryData o1, SummaryData o2) { String field1 =
	 * o1.getField4()!="" ? o1.getField4() :""; String field2 = o2.getField4()!="" ?
	 * o2.getField4() :"";
	 * 
	 * return field1.compareTo(field2); } };
	 */
}
