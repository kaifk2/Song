package com.tunhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tunhub.entities.Users;

public interface UsersRepository  extends JpaRepository<Users, Integer>{
	Users findByEmail(String email);
	
}
