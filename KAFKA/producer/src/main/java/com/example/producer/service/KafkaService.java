package com.example.producer.service;

import com.example.producer.dto.Message;


public interface KafkaService {
    void sendMessage(String topic, String message);
    void sendMessage(String topic, Message message);

}
