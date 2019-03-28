package com.example.JSONReader;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestObjectREST implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("status")
	private String statusRequest;
	@JsonProperty("code")
	private int codeRequest;
	@JsonProperty("message")
	private String messageRequest;
	@JsonProperty("data")
	private RequestDataREST dataRequest;
	
	public void changeValue(String find, String change) {
		
		RequestDataValuesREST  auxAttributos =  dataRequest.getAttributeList().get(1);
		
		RequestDataREST dataRequestAux = this.dataRequest;
		
		
		for(int i=0;i<auxAttributos.getAttributeList().size();i++){
			
			List<RequestAttributesREST> aux = auxAttributos.getAttributeList();
			if(aux.get(i).getNameRequest().equals(find)) {
				System.out.println("CHANGING");
				//RequestAttributesREST replace = new RequestAttributesREST();
				//replace.setNameRequest(find);
				//replace.setValuesRequest(change);
				//dataRequest.getAttributeList().get(1).getAttributeList().set(i, replace);
				dataRequestAux.getAttributeList().get(1).getAttributeList().get(i).setValuesRequest(change);
				//dataRequest.getAttributeList().get(1).getAttributeList().get(i).setValuesRequest(change);
				//System.out.println(dataRequest.getAttributeList().get(1).getAttributeList().get(i).getValueRequest());
			}
		}
		this.dataRequest=dataRequestAux;
	}
	
	
	public String getStatusRequest() {
		return statusRequest;
	}
	public void setStatusRequest(String statusRequest) {
		this.statusRequest = statusRequest;
	}
	public int getCodeRequest() {
		return codeRequest;
	}
	public void setCodeRequest(int codeRequest) {
		this.codeRequest = codeRequest;
	}
	public String getMessageRequest() {
		return messageRequest;
	}
	
	public void setMessageRequest(String messageRequest) {
		this.messageRequest = messageRequest;
	}
	public RequestDataREST getDataRequest() {
		return dataRequest;
	}
	public void setDataRequest(RequestDataREST dataRequest) {
		this.dataRequest = dataRequest;
	}

	
	@Override
	public String toString() {
		return "RequestObjectREST [status=" + statusRequest + ", code=" + codeRequest
				+ ", message=" + messageRequest + ", data=" + dataRequest + "]";
	}


	public void changeValue(String id, String attribute, String value) {
		
	
			/*
			for(int i=0;i< dataRequest.getAttributeList().size();i++){
				
				if( dataRequest.getAttributeList().get(i).getAttributeList().get(0).getValueRequest().equals(id)){ //0 = "Id"
																	
					 dataRequest.getAttributeList().get(i).getAttributeList().get(5).setValuesRequest(value); // 5 = "TXT_V_Postal_Code__c"
				}
			}
			*/
		
		
		
		//SEARCH CAMPO name "Id"
		int posicionId= 0;
		for(int i=0;i< dataRequest.getAttributeList().size();i++){
		
			for(int j=0; j< dataRequest.getAttributeList().get(i).getAttributeList().size();j++) {
				
				if(dataRequest.getAttributeList().get(i).getAttributeList().get(j).getNameRequest().equals("Id")) {
					System.out.println(j);
					posicionId=j;
				}
			}
		}
			
		//SEARCH CAMPO name "TXT_V_Postal_Code__c"
		
		int posicionValue= 0;
		for(int i=0;i< dataRequest.getAttributeList().size();i++){
		
			for(int j=0; j< dataRequest.getAttributeList().get(i).getAttributeList().size();j++) {
				
				if(dataRequest.getAttributeList().get(i).getAttributeList().get(j).getNameRequest().equals("TXT_V_Postal_Code__c")) {
					System.out.println(j);
					posicionValue=j;
				}
			}
				
		}
		
		
		for(int i=0;i< dataRequest.getAttributeList().size();i++){
			
			if( dataRequest.getAttributeList().get(i).getAttributeList().get(posicionId).getValueRequest().equals(id)){ //0 = "Id"
																
				 dataRequest.getAttributeList().get(i).getAttributeList().get(posicionValue).setValuesRequest(value); // 5 = "TXT_V_Postal_Code__c"
				 System.out.println("Cambiado");
			}
		}
		
			
			
			
			
	}


	public void changeValue(String nameId, String id, String nameCampo, String value) {


			//SEARCH CAMPO name "Id"
				int posicionId= 0;
					for(int j=0; j< dataRequest.getAttributeList().get(0).getAttributeList().size();j++) {
						if(dataRequest.getAttributeList().get(0).getAttributeList().get(j).getNameRequest().equals(nameId)) {
							System.out.println(j);
							posicionId=j;
						}
					}
				
				//SEARCH CAMPO name "TXT_V_Postal_Code__c"
				
				int posicionValue= 0;
					for(int j=0; j< dataRequest.getAttributeList().get(0).getAttributeList().size();j++) {
						
						if(dataRequest.getAttributeList().get(0).getAttributeList().get(j).getNameRequest().equals(nameCampo)) {
							System.out.println(j);
							posicionValue=j;
						}
					}
					
				//REPLACE		
				for(int i=0;i< dataRequest.getAttributeList().size();i++){
					
					if( dataRequest.getAttributeList().get(i).getAttributeList().get(posicionId).getValueRequest().equals(id)){ //0 = "Id"
																		
						 dataRequest.getAttributeList().get(i).getAttributeList().get(posicionValue).setValuesRequest(value); // 5 = "TXT_V_Postal_Code__c"
						 System.out.println("Cambiado");
					}
				}
				
		
	}
	
	

}
