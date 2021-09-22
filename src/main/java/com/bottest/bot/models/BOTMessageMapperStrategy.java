package com.bottest.bot.models;

import java.util.List;

public interface BOTMessageMapperStrategy {
	String getMessageType();
	int getId();
	String getType();
	List<String> getData();
	List<String> getSummaryData();

}
