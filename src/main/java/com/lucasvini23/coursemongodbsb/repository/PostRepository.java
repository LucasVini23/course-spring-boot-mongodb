package com.lucasvini23.coursemongodbsb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lucasvini23.coursemongodbsb.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

	List<Post> findByTitleContainingIgnoreCase(String text);
	
}
