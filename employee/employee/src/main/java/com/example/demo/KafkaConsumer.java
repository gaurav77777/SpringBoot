package com.example.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
	
	
	/*

	@KafkaListener(topics = "first_topic", groupId = "group-id_1")
    public void consumeMessage(String message) {
        System.out.println("Received message: " + message);
    }
	
    */
}
