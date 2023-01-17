package com.funbi.springbootkafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.funbi.springbootkafka.kafka.JsonProducer;
import com.funbi.springbootkafka.models.Product;

@RestController
@RequestMapping("/api/v1/kafka-json")
public class JsonMessageController {


    private JsonProducer kafkaProducer;
    @Autowired
    public JsonMessageController(JsonProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }
    
    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody Product product){

        kafkaProducer.sendMessage(product);
        return ResponseEntity.ok("Json message sent to Kafka topic");
    }
    
}
