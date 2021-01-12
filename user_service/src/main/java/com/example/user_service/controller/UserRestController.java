package com.example.user_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.user_service.entity.User;
import com.example.user_service.service.UserService;

@RestController
public class UserRestController {

	@Autowired
	private UserService userServ;
	
	@GetMapping(value = "/")
	public ResponseEntity<List<User>> getAllUser(){
		return userServ.getAllUser();
	}
	
	@GetMapping(value = "/{userId}")
	public ResponseEntity<User> getUser(@PathVariable Long userId){
		return userServ.getUser(userId);
	}
	
	
}
