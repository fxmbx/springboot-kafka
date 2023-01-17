package com.funbi.springbootkafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.funbi.springbootkafka.models.Product;

@Service
public class JsonProducer {
    

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonProducer.class);


    private KafkaTemplate<String, Product> kafkaTemplate;

    @Autowired
    public JsonProducer(KafkaTemplate<String, Product> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(Product data) {
        LOGGER.info(String.format("Message sent -> %s", data.toString()));

        Message<Product> message = MessageBuilder
        .withPayload(data)
        .setHeader(KafkaHeaders.TOPIC, "funbiKafkaTopic_json") 
        .build();
        
        
        kafkaTemplate.send(message);
        
        LOGGER.info(String.format("Message sent with header %s", message.getHeaders()));

    }
    

}
