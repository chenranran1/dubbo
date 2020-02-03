package com.trs.dubbo.service;

public interface MessageService {

	/**
	 * 发送短信服务
	 */
	void sendMessage(String content,String... phones);
}
