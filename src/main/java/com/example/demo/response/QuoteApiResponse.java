package com.example.demo.response;

public class QuoteApiResponse {
private String type;
private Value value;
@Override
public String toString() {
	return "QuoteApiResponse [type=" + type + ", value=" + value + "]";
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public Value getValue() {
	return value;
}
public void setValue(Value value) {
	this.value = value;
}
}
