package com.example.user_service.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.user_service.entity.User;

public interface UserService {

	ResponseEntity<List<User>> getAllUser();

	ResponseEntity<User> getUser(Long userId);

}
