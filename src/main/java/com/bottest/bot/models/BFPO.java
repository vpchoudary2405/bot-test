package com.bottest.bot.models;

import java.util.ArrayList;
import java.util.List;

public class BFPO extends AbstractBOTMessageMapperStrategy {
	
	
	private String b;
	
	public  BFPO(List<String> dataList) {
		this.buildData(dataList);
	}
	
	@Override
	protected BOTMessageType messageType() {
		return BOTMessageType.BFPO;
	}
 
	private String getB() {
		return b;
	}
	private void setB(String b) {
		this.b = b;
	}
	
	@Override
	public  List<String> buildMessageSpecificData() {
		
		this.setB(dataList.get(2));
		this.summaryDataList = buildSummaryData(dataList);
		return summaryDataList;
	}
	 
	public List<String> buildSummaryData(List<String> dataList){
		List<String> sumData = new ArrayList<>();
		sumData.add(dataList.get(0));
		sumData.add(dataList.get(3));
		sumData.add(dataList.get(4));
		return sumData;
	}

}
