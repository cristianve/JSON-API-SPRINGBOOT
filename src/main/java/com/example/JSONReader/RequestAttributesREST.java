package com.example.JSONReader;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestAttributesREST {
	

	@JsonProperty("name")
	private String nameRequest;
	@JsonProperty("value")
	private String valueRequest;
	
	
	
	
	public String getNameRequest() {
		return nameRequest;
	}
	public void setNameRequest(String nameRequest) {
		this.nameRequest = nameRequest;
	}
	public String getValueRequest() {
		return valueRequest;
	}
	public void setValuesRequest(String valuesRequest) {
		this.valueRequest = valuesRequest;
	}
	
	@Override
	public String toString() {
		return " [name=" + nameRequest + ", value=" + valueRequest + "]";
	}

}
