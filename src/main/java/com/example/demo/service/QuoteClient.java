package com.example.demo.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.response.QuoteApiResponse;
@Service
public class QuoteClient {
//public void invokeRandomApi() {
//	RestTemplate tr = new RestTemplate();
//	String apiurl = "http://localhost:8080/api/random";
//	ResponseEntity<String> responseEntity =tr.getForEntity(apiurl,String.class);
//	int statusCode = responseEntity.getStatusCodeValue();
//	if(statusCode == 200) {
//		String body1 = responseEntity.getBody();
//		
//	}


public String invokeQuoteApi() {
	String apiUrl ="http://localhost:8080/api/random";
	RestTemplate rt = new RestTemplate();
	ResponseEntity<QuoteApiResponse> responseEntity= rt.getForEntity(apiUrl, QuoteApiResponse.class);
	
	int statusCode = responseEntity.getStatusCodeValue();
	if(statusCode == 200) {
		QuoteApiResponse body = responseEntity.getBody();
//		
	return body.getValue().getQuote().toUpperCase();
}
return null;
}
}