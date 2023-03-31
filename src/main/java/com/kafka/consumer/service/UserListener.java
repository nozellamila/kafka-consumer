package com.kafka.consumer.service;

import com.kafka.consumer.domain.Dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserListener {

    @Autowired
    private UserService userService;

    @KafkaListener(topics = "${users.topic}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(ConsumerRecord<String, UserDto> payload){
        userService.createUser(payload);
    }
}
