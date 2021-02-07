package com.lucasvini23.coursemongodbsb.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucasvini23.coursemongodbsb.domain.Post;
import com.lucasvini23.coursemongodbsb.repository.PostRepository;
import com.lucasvini23.coursemongodbsb.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repository;
	
	public Post findById(String id) {
		Optional<Post> post = repository.findById(id);
		return post.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
}