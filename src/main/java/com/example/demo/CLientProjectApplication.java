package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.service.QuoteClient;

@SpringBootApplication
public class CLientProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CLientProjectApplication.class, args);
QuoteClient bean = context.getBean(QuoteClient.class);
bean.invokeQuoteApi();
	
	
	}

}	
