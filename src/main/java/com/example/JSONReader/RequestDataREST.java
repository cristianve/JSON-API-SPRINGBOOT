package com.example.JSONReader;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestDataREST {


	@JsonProperty("values")
	private List<RequestDataValuesREST> attributeList;





	public List<RequestDataValuesREST> getAttributeList() {
		return attributeList;
	}





	public void setAttributeList(List<RequestDataValuesREST> attributeList) {
		this.attributeList = attributeList;
	}





	@Override
	public String toString() {
		return " [values=" + attributeList + "]";
	}


	
}
