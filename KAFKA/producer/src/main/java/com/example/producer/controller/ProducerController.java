package com.example.producer.controller;

import com.example.producer.dto.Message;
import com.example.producer.service.KafkaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producer")
@RequiredArgsConstructor
public class ProducerController {
    public final KafkaService kafkaService;
    @GetMapping("/send")
    public String sendMessageToKafka(@RequestParam String message) {
        kafkaService.sendMessage("baeldung_linux", message);
        return "Сообщение отправлено в Kafka: " + message;
    }
    @PostMapping("/send/json")
    public Message sendJsonMessageToKafka(@RequestBody Message message){
        kafkaService.sendMessage("baeldung_linux",message);
        return message;
    }
}
