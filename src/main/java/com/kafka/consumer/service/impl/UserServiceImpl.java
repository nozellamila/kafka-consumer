package com.kafka.consumer.service.impl;

import com.kafka.consumer.domain.Dto.UserDto;
import com.kafka.consumer.domain.User;
import com.kafka.consumer.repository.UserRepository;
import com.kafka.consumer.service.UserService;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User getById(String id) {
        return userRepository
                .findById(id)
                .orElseThrow(()->new IllegalArgumentException("Usuário não existe"));
    }

    @Override
    public User createUser(ConsumerRecord<String, UserDto> payload) {

        User
        if(user.getRelative() != null){
            User relative;
            relative = userRepository
                    .findById(user.getRelative().getId())
                    .orElseThrow(()-> new IllegalArgumentException("Responsável não encontrato"));

            user.setRelative(relative);
        }

        return userRepository.save(user);
    }
}
