package com.example.JSONReader;






import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class RestControllerPage {


		
		@RequestMapping(value = "/respuesta", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE) 
	    public Object getAnswer() {
			return JsonReaderApplication.m_Respuesta;
	    	
	    }
	
	
}
