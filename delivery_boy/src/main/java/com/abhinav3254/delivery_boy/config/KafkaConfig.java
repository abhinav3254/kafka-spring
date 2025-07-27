package com.abhinav3254.delivery_boy.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import com.abhinav3254.delivery_boy.constants.AppConstants;

@Configuration
public class KafkaConfig {
	
	/**
	 * Creating a new topic 
	 * NewTopic is kafka object
	 * @return the topic object
	 */
	@Bean
	public NewTopic topic() {
		return TopicBuilder
				.name(AppConstants.LOCATION_TOPIC)
//				.partitions(0)
//				.replicas(0)
				.build();
	}

}
