package com.example.elo.repository;

import com.example.elo.model.Message;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface MessageRepository extends MongoRepository<Message, String>{

}
