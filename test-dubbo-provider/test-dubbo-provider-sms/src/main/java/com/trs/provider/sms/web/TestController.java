package com.trs.provider.sms.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trs.dubbo.service.MessageService;

@RestController
@RequestMapping("/testdubbo")
public class TestController {

	@Autowired
	private MessageService messageService;
	
	@RequestMapping("/sendMessage/{content}/{phones}")
	public String sendMessage(@PathVariable String content,@PathVariable String phones) {
		
		try {
			messageService.sendMessage(content, phones.split(","));
		} catch (Exception e) {
			e.printStackTrace();
			return "调用失败";
		}
		return "调用成功";
	}
}
