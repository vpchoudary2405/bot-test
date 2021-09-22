package com.bottest.bot.models;

import java.util.ArrayList;
import java.util.List;

public class BDOC extends AbstractBOTMessageMapperStrategy {
	
	public  BDOC(List<String> dataList) {
		this.buildData(dataList);
	}
	
	@Override
	protected BOTMessageType messageType() {
		return BOTMessageType.BDOC;
	}
	
	@Override
	public  List<String> buildMessageSpecificData() {
		
		this.summaryDataList = buildSummaryData(dataList);
		return summaryDataList;
	}
	 
	public List<String> buildSummaryData(List<String> dataList){
		List<String> sumData = new ArrayList<>();
		sumData.add(dataList.get(0));
		sumData.add(dataList.get(3));
		return sumData;
	}

	

}
