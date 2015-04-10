package com.mkyong.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.mkyong.hello.HelloWorld;
import com.mkyong.hello.HelloWorldImpl;

@Configuration
@Import({ CustomerConfig.class, SchedulerConfig.class })
public class AppConfig {

	@Bean(name = "helloBean")
	public HelloWorld helloWorld() {
		return new HelloWorldImpl();
	}

}