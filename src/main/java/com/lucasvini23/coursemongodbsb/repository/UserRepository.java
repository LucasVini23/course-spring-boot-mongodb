package com.lucasvini23.coursemongodbsb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lucasvini23.coursemongodbsb.domain.User;

public interface UserRepository extends MongoRepository<User, String>{

}
