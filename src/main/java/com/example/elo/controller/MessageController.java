package com.example.elo.controller;

import com.example.elo.model.Message;
import com.example.elo.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/messages")
@CrossOrigin(origins = "*")

public class MessageController {
    @Autowired
    private MessageRepository messageRepository;

    @PostMapping
    public Message sendMessage(@RequestBody Message message){
        return messageRepository.save(message);
    }
    @GetMapping
    public List<Message> getMessages(){
        return messageRepository.findAll();
    }
}
