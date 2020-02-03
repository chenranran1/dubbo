package com.trs.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
@EnableDubbo
public class Application {

	public static void main(String[] args) {
		
		log.info("启动dubbo消费者程序");
		SpringApplication.run(Application.class, args);
		
	}
}
