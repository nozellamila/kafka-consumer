package com.kafka.consumer.repository;

import com.kafka.consumer.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {

    @Query("{ $and: [ { 'age': { $gt: ?0 } }, { 'age': { $lte: ?1 } } ] }")
    public List<User> getByRangeAge(Integer from, Integer to);
}
