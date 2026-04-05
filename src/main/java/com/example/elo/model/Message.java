package com.example.elo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Data
@Document(collection = "messages")

public class Message {
    @Id
    private String id;
    private String sender;
    private String content;
    private LocalDateTime timestamp;

    public Message(){
        this.timestamp = LocalDateTime.now();
    }
}
