package com.tunhub.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Users {

	 @Id
	   @GeneratedValue(
	      strategy = GenerationType.AUTO
	   )
	   int id;
	   String username;
	   String email;
	   String password;
	   String gender;
	   String role;
	   String address;
	   boolean isPremium;

	   public Users() {
	   }

	   public Users(int id, String username, String email, String password, String gender, String role, String address, boolean isPremium) {
	      this.id = id;
	      this.username = username;
	      this.email = email;
	      this.password = password;
	      this.gender = gender;
	      this.role = role;
	      this.address = address;
	      this.isPremium = isPremium;
	   }

	   public int getId() {
	      return this.id;
	   }

	   public void setId(int id) {
	      this.id = id;
	   }

	   public String getUsername() {
	      return this.username;
	   }

	   public void setUsername(String username) {
	      this.username = username;
	   }

	   public String getEmail() {
	      return this.email;
	   }

	   public void setEmail(String email) {
	      this.email = email;
	   }

	   public String getPassword() {
	      return this.password;
	   }

	   public void setPassword(String password) {
	      this.password = password;
	   }

	   public String getGender() {
	      return this.gender;
	   }

	   public void setGender(String gender) {
	      this.gender = gender;
	   }

	   public String getRole() {
	      return this.role;
	   }

	   public void setRole(String role) {
	      this.role = role;
	   }

	   public String getAddress() {
	      return this.address;
	   }

	   public void setAddress(String address) {
	      this.address = address;
	   }

	   public boolean isPremium() {
	      return this.isPremium;
	   }

	   public void setPremium(boolean isPremium) {
	      this.isPremium = isPremium;
	   }

	   public String toString() {
	      return "Users [id=" + this.id + ", username=" + this.username + ", email=" + this.email + ", password=" + this.password + ", gender=" + this.gender + ", role=" + this.role + ", address=" + this.address + ", isPremium=" + this.isPremium + "]";
	   }
	
	
}
