package com.example.jsfdemo.domain;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.RequestScoped;


@RequestScoped
public class Book {
//
	private String name ="";
	private String author ="";
	private String description ="";
	private String ISBN ="";
	private String picture ="";
	private String addedBy = "";
	public List<Comment> comments = new ArrayList<Comment>();
	
	
	public String getAddedBy() {
		return addedBy;
	}
	public void setAddedBy(String addedBy) {
		this.addedBy = addedBy;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
	
}
