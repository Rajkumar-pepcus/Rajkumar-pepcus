package com.pepcus.heartbeat.service;


import org.springframework.http.HttpMethod;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class HeartBeatService {
    
	@Scheduled(fixedRate=10000)
	public String healthCheck() {
		RestTemplate restTemplate = new RestTemplate();
		
		String result = (restTemplate
				.exchange("http://localhost:9190/actuator/health", HttpMethod.GET, null, String.class).getBody());
		System.out.println(result); 
          return result;
	}
}

