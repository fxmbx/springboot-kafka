package com.funbi.springbootkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    
    @Bean
    public NewTopic funbiNewTopic(){
        return TopicBuilder.name("funbiKafkaTopic").build();
    }


}

// bin/kafka-console-producer.sh --topic quickstart-events --bootstrap-server localhost:9092

// bin/kafka-console-producer.sh --topic funbiKafkaTopic --from-beginning --bootstrap-server localhost:9092
