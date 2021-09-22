package com.bottest.bot.models;

import java.util.List;

public abstract class AbstractBOTMessageMapperStrategy implements BOTMessageMapperStrategy{

	protected abstract BOTMessageType messageType();
	protected abstract List<String> buildMessageSpecificData();
	
	protected List<String> dataList;
	protected List<String> summaryDataList;
	
	private int id;
	private String type;
	

	public int getId() {
		return this.id;
	}
	
	public String getType() {
		return type;
	}

	 
	@Override
	public String toString() {
		return "AbstractCATMessageMapperStrategy [ id=" + id + ", type=" + type + ", dataList=\" + dataList + \"]";
	}
	public void buildData(List<String> dataList) {
		this.id = Integer.parseInt(dataList.get(0));
		this.type = dataList.get(3);
		this.dataList = dataList;
		this.summaryDataList = this.buildMessageSpecificData();
	}
	
 
	public List<String> getData() {
		return dataList;
	}

	public List<String> getSummaryData() {
		return summaryDataList;
	}
	
	public String getMessageType() {
		return dataList.get(3);
	}
}
