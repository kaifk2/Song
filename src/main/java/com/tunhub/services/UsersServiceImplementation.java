package com.tunhub.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tunhub.entities.Users;
import com.tunhub.repository.UsersRepository;

@Service
public class UsersServiceImplementation  implements UsersService {

	@Autowired
    UsersRepository repo;
	
	 public UsersServiceImplementation() {
	   }

	@Override
	public String addUser(Users user) {
		this.repo.save(user);
	      return "user added succesfully";
	}

	@Override
	public boolean emailExists(String email) {
		return this.repo.findByEmail(email) != null;
	}

	@Override
	public boolean validateUser(String email, String password) {
		Users user = this.repo.findByEmail(email);
	      String db_pass = user.getPassword();
	      return password.equals(db_pass);
	}

	@Override
	public String getRole(String email) {
		 Users user = this.repo.findByEmail(email);
	      return user.getRole();
	}

	@Override
	public Users getUser(String email) {
		 return this.repo.findByEmail(email);
	}

	@Override
	public void updateUser(Users user) {
		this.repo.save(user);
		
	}
}

