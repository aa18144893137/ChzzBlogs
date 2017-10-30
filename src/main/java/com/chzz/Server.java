package com.chzz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan("com.chzz")
public class Server{
	final static Logger logger = LoggerFactory.getLogger(Server.class);
	
	public static void main(String[] args) throws Exception {
		 SpringApplication.run(Server.class, args);
	}

	
}
