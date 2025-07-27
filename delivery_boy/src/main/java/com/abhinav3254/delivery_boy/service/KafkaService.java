package com.abhinav3254.delivery_boy.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.abhinav3254.delivery_boy.constants.AppConstants;

@Service
public class KafkaService {
	
//	we need kakfa template to send message so creating a kafka templte
	
	private Logger logger = LoggerFactory.getLogger(KafkaService.class);
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public boolean updateLocation(String location) {
		this.kafkaTemplate.send(AppConstants.LOCATION_TOPIC,location);
		this.logger.info("location produced - "+location);
		return true;
	}

}
