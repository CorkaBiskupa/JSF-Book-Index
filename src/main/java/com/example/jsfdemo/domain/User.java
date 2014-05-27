package com.example.jsfdemo.domain;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.SessionScoped;

@SessionScoped
public class User {

	private String username="";
	private String password="";
	private boolean logedIn=false;
	public List<Book> favorites = new ArrayList<Book>();
	
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isLogedIn() {
		return logedIn;
	}
	public void setLogedIn(boolean logedIn) {
		this.logedIn = logedIn;
	}
	
}
