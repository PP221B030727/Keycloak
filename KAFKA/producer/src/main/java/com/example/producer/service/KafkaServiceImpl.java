package com.example.producer.service;


import com.example.producer.dto.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaServiceImpl implements KafkaService{
    private final KafkaTemplate<String, String> kafkaTemplate;
    private final KafkaTemplate<String , Object> kafkaTemplateJson;
    @Override
    public void sendMessage(String topic, String message) {
        kafkaTemplate.send(topic, message);
    }

    @Override
    public void sendMessage(String topic, Message message) {
        kafkaTemplateJson.send(topic, message);
    }
}

