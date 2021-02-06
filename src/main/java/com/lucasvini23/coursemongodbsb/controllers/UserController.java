package com.lucasvini23.coursemongodbsb.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucasvini23.coursemongodbsb.dto.UserDTO;
import com.lucasvini23.coursemongodbsb.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping()
	public ResponseEntity<List<UserDTO>> findAll(){
		return ResponseEntity.ok().body(service.findAll().stream().map(x -> new UserDTO(x)).collect(Collectors.toList()));
	}
}
