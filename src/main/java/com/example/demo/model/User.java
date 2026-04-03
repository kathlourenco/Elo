package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Document(collection = "usuarios")
@Data

public class User {
    @Id
    private String id;
    private String username;
    private String email;
    private String password;
}
