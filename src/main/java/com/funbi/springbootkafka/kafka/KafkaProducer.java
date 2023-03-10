package com.funbi.springbootkafka.kafka;

import static java.lang.String.format;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    @Value("${spring.kafka.topic.name}")
    private String topicName;


    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);
    
    private KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
        LOGGER.warn(topicName);

    }

    public void sendMessage(String message) {
        kafkaTemplate.send("funbiKafkaTopic", message);
        LOGGER.info(format("Message sent %s",message));


    }
    
}


