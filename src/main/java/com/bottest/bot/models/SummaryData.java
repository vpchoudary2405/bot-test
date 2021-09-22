package com.bottest.bot.models;

import java.util.List;

public class SummaryData {

	private String field1;
	private String field2;
	private String field3;
	private String field4;
	private String field5;
	private String field6;
	

	public SummaryData(){}
	public SummaryData(List<String> dataList){
		this.setField1(dataList.get(0));
		this.setField2(dataList.get(1));
		this.setField3(dataList.get(2));
		this.setField4(dataList.get(3));
		this.setField5(dataList.get(4));
		this.setField6(dataList.get(5));
	}
	
	public SummaryData(String field1, String field2, String field3, String field4, String field5, String field6 ){
		this.setField1(field1);
		this.setField2(field2);
		this.setField3(field3);
		this.setField4(field4);
		this.setField5(field5);
		this.setField6(field6);
	}
	
	public String getField1() {
		return field1;
	}
	public void setField1(String field1) {
		this.field1 = field1;
	}
	public String getField2() {
		return field2;
	}
	public void setField2(String field2) {
		this.field2 = field2;
	}
	public String getField3() {
		return field3;
	}
	public void setField3(String field3) {
		this.field3 = field3;
	}
	public String getField4() {
		return field4;
	}
	public void setField4(String field4) {
		this.field4 = field4;
	}
	public String getField5() {
		return field5;
	}
	private void setField5(String field5) {
		this.field5 = field5;
	}
	public String getField6() {
		return field6;
	}
	public void setField6(String field6) {
		this.field6 = field6;
	}

	@Override
	public String toString() {
		return "SummaryData [field1=" + field1 + ", field2=" + field2 + ", field3=" + field3 + ", field4=" + field4
				+ ", field5=" + field5 + ", field6=" + field6 + "]";
	}
	
}
