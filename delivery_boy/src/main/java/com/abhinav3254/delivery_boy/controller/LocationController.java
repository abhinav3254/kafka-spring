package com.abhinav3254.delivery_boy.controller;

import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.abhinav3254.delivery_boy.service.KafkaService;


@RestController
@RequestMapping("/location")
public class LocationController {
	
	@Autowired
	private KafkaService kafkaService;
	
	@PostMapping("/update")
    public ResponseEntity<?> updateLocation() {
		for (int i = 0;i<1000000;i++) {
			double latitude = -90 + new Random().nextDouble() * 180;
		    double longitude = -180 + new Random().nextDouble() * 360;
		
		    String location = latitude + "," + longitude;
		    kafkaService.updateLocation(location);
		}
       
        return ResponseEntity.ok(Map.of("message","Location sent"));
    }
	
}
