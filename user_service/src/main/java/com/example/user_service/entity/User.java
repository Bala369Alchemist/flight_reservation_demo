package com.example.user_service.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Id
	@Column(name = "")
	private long userId;
	
	@Column(name = "")
	private String firstName;
	
	@Column(name = "")
	private String lastName;
	
	@Column(name = "")
	private String email;
	
	@Column(name = "")
	private String mobile;
	
	
}
