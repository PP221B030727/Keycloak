package com.example.consumer.controller;

import com.example.consumer.dto.Message;
import com.example.consumer.service.KafkaMessageConsumer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/consumer")
@RequiredArgsConstructor
public class ConsumerController {
    private final KafkaMessageConsumer kafkaMessageConsumer;
    @GetMapping("/check")
    public ResponseEntity<String> check(){
        return ResponseEntity.ok("Hello kafka");
    }

    @GetMapping("/getObjects")
    public ResponseEntity<List<String>> getObjects(){
        return ResponseEntity.ok(kafkaMessageConsumer.getMessages());
    }


}
