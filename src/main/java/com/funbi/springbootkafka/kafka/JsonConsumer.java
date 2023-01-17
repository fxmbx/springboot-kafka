package com.funbi.springbootkafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.funbi.springbootkafka.models.Product;

@Service
public class JsonConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonConsumer.class);

    @KafkaListener(topics = "funbiKafkaTopic_json",groupId = "myGroup")
    public void consume(Product product){
        LOGGER.info(String.format("json message received -> %s", product.toString()));
    }
}
