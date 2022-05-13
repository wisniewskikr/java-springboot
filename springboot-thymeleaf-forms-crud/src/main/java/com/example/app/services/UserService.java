package com.example.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.example.app.entities.UserEntity;

@Component
public class UserService {
	
	public Long save(UserEntity user) {
		return null;
	}
	
	public Optional<UserEntity> findById(Long id) {
		return null;
	}
	
	public void deleteById(Long id) {
		
	}
	
	public List<UserEntity> findAll() {
		return null;
	}

}
