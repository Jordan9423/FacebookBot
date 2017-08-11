package com.facebook.bot.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FacebookBot {

	private static final Logger logger = LoggerFactory.getLogger(FacebookBot.class);
	
	
	public static void main(String[] args) {
		SpringApplication.run(FacebookBot.class, args);
	}

}
