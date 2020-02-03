package com.trs.provider.sms.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.trs.dubbo.service.MessageService;

@Service("messageService")
@com.alibaba.dubbo.config.annotation.Service
public class MessageServiceImpl implements MessageService{

	private static Logger logger = LoggerFactory.getLogger(MessageServiceImpl.class);
	@Override
	public void sendMessage(String content, String... phones) {
		
		logger.info("开始调用windows发送短信服务");
		logger.info("发送短信号码为{}，短信的内容为{}",phones,content);
		
	}

}
