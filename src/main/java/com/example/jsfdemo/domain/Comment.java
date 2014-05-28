package com.example.jsfdemo.domain;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Comment {

	private User writtenBy = new User();
	private String comment ="";
	
	public User getWrittenBy() {
		return writtenBy;
	}
	public void setWrittenBy(User writtenBy) {
		this.writtenBy = writtenBy;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
