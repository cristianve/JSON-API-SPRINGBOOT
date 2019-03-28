package com.example.JSONReader;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@SpringBootApplication
@EnableAutoConfiguration
public class JsonReaderApplication {
	

	public static Object m_Respuesta;


	public static void main(String[] args) {


		SpringApplication.run(JsonReaderApplication.class, args);
		 m_Respuesta=readJSON();
		
	}
	

	private static Object readJSON() {

		RestTemplate restTemplate = new RestTemplate();
		String resourceUrl = "http://7.110.106.23:8081/dps/api/bo/v1/domains/15?brand=VWG";

		HttpHeaders headers = new HttpHeaders();
		HttpEntity<String> entity = new HttpEntity<String>(headers);

		ResponseEntity<RequestObjectREST> response = restTemplate.exchange(resourceUrl, HttpMethod.GET, entity,
				RequestObjectREST.class);
		final RequestObjectREST object = response.getBody();

		object.changeValue("Id", "0010Y00001IPDMAQA5", "TXT_V_Postal_Code__c", "08028");
		System.out.println(object.toString());
		return object;
	}

}
