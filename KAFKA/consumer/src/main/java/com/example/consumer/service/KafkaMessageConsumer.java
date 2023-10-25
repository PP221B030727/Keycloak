package com.example.consumer.service;

import com.example.consumer.dto.Message;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class KafkaMessageConsumer {
    ArrayList<String> arrayList = new ArrayList<>();
//    @KafkaListener(topics = "baeldung_linux", groupId = "your-consumer-group")
//    public void listen(ConsumerRecord<String, String> record) {
//        String key = record.key();
//        String value = record.value();
//        System.out.println("Received message - Key: " + key + ", Value: " + value);
//    }
    @KafkaListener(topics = "baeldung_linux" , groupId = "your-consumer-group")
    public void listen(ConsumerRecord<String , String> record){
        String message = record.value();
        arrayList.add(message);
    }

    public ArrayList<String> getMessages(){
        return arrayList;
    }
}
