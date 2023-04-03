package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.QuoteClient;
@RestController
public class QuoteRestController {
@Autowired
	private QuoteClient quoteClient;
	@GetMapping("/client")
	public String getQuote() {
		String quote = quoteClient.invokeQuoteApi();
		return quote;
	}
}
