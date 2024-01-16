package com.tunhub.services;

import com.tunhub.entities.Users;

public interface UsersService {

	String addUser(Users user);

	   boolean emailExists(String email);

	   boolean validateUser(String email, String password);

	   String getRole(String email);

	   Users getUser(String email);

	   void updateUser(Users user);
}
