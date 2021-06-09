package com.kakfa.demo.kafkademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
	
	@Value(value = "${kafka.topicName}")
	private String topicName;

	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	String msg = "Hello Kafka" ;
	
	//User user1 = new User("Sonia", 21) ;

	public void sendMessage(String msg) {
	    kafkaTemplate.send(topicName, msg);
	}

}
