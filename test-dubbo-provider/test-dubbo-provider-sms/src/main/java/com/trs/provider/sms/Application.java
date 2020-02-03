package com.trs.provider.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
@EnableDubbo
public class Application {

	public static void main(String[] args) {
		log.info("发布短信服务");
		SpringApplication.run(Application.class, args);
	}
}
