package com.pepcus.heartbeat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pepcus.heartbeat.service.HeartBeatService;

@RestController
public class HeartBeatController {
   @Autowired
	private HeartBeatService heartBeatService;

	@GetMapping("/health")
	public String getHealth() {

		return heartBeatService.healthCheck();
	}

}
