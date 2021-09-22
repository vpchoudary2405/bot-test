package com.bottest.bot.models;

import java.util.List;

public class BOTMessageMapperFactory {

	public BOTMessageMapperStrategy getMapperStratgey(List<String> dataList) {
		String messageType = dataList.get(3);
		if(BOTMessageType.BFPO.toString().equals(messageType)) {
			return new BFPO(dataList);
		} else if(BOTMessageType.BDOC.toString().equals(messageType)) {
			return new BDOC(dataList);
		}
		
		return new BDOS(dataList);
	}
}
