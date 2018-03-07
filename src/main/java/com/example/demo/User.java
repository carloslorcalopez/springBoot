package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pablo")
public class User {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
     
 String name = null;
 String login = null;
 String password = null;
 String email = null;
  Integer veces = null;
public int get_Id(){
     return id;
}
public void set_Id(int id){
this.id = id;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Integer getVeces() {
	return veces;
}
public void setVeces(Integer veces) {
	this.veces = veces;
}
     
}
