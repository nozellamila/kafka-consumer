package com.kafka.consumer.service;

import com.kafka.consumer.domain.Dto.UserDto;
import com.kafka.consumer.domain.User;
import org.apache.kafka.clients.consumer.ConsumerRecord;

import java.util.List;

public interface UserService {

    public List<User> getAll();
    public User getById(String id);
    public User createUser(ConsumerRecord<String, UserDto> payload);
}
