package com.example.JSONReader;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestDataValuesREST {


	@JsonProperty("attributes")
	private List<RequestAttributesREST> attributeList;



	public List<RequestAttributesREST> getAttributeList() {
		return attributeList;
	}

	public void setAttributeList(List<RequestAttributesREST> attributeList) {
		this.attributeList = attributeList;
	}

	@Override
	public String toString() {
		return " [attributes=" + attributeList + "]";
	}


	
}
