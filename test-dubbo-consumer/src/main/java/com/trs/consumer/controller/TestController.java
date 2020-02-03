package com.trs.consumer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.trs.dubbo.service.MessageService;

@RestController
@RequestMapping("/")
public class TestController {

	@Reference(check=false,loadbalance="roundrobin")
	private MessageService messageService;
	
	@RequestMapping("test")
	public Object test() {
		return "测试消费者控制器";
	}
	
	@RequestMapping("send")
	public Object send(String content,String phone) {
		try {
			messageService.sendMessage(content, phone);
			return "发送成功";
		} catch (Exception e) {
			e.printStackTrace();
			return "发送失败";
		}
		
		
	}
	
}
