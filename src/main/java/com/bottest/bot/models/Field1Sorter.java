package com.bottest.bot.models;

import java.util.Comparator;

public class  Field1Sorter  implements Comparator<SummaryData> 
{
    public int compare(SummaryData o1, SummaryData o2) 
    {
        return o1.getField1().compareTo(o2.getField1());
    }
}
	 
 
