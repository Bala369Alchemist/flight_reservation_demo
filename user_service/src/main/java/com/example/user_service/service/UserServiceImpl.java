package com.example.user_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.user_service.entity.User;
import com.example.user_service.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;

	@Override
	public ResponseEntity<List<User>> getAllUser() {
		 List<User> users = userRepo.findAll();
		 if(users.isEmpty()) {
			 return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);
		 }
		 return new ResponseEntity<List<User>>(users,HttpStatus.OK);
	}

	@Override
	public ResponseEntity<User> getUser(Long userId) {
		User user = userRepo.findByUserId(userId);
		if(user==null) {
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
}
