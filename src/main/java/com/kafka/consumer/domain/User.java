package com.kafka.consumer.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document("users")
public class User {

    @Id
    private String id;
    private Integer age;
    private String name;
    private Integer udprs_level;
    private String profile;
    private LocalDateTime dataCriacao;

    @DBRef
    private User relative;
}
