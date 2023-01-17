package com.funbi.springbootkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Value("${spring.kafka.topic.name}")
    private String topicName;

    @Value("${spring.kafka.topic-json.name}")
    private String topicJsonName;

    @Bean
    public NewTopic funbiNewTopic(){
        return TopicBuilder.name("funbiKafkaTopic").build();
    }
    @Bean
    public NewTopic funbiNewJsonTopic(){
        return TopicBuilder.name("funbiKafkaTopic_json").build();
    }


}

// bin/kafka-console-producer.sh --topic quickstart-events --bootstrap-server localhost:9092

// bin/kafka-console-producer.sh --topic funbiKafkaTopic --from-beginning --bootstrap-server localhost:9092
J