package com.kakfa.demo.kafkademo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
	
	@Value(value = "${kafka.topicName}")
	private String topicName;

	@Value(value = "${kafka.topicName}")
	private String groupId;

	
	@KafkaListener(topics ="demo-topic" , groupId = "demo")
	public void listenGroupFoo(String message) {
	    System.out.println("Received Message in group foo: " + message);
	}

}
