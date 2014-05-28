package com.example.jsfdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;

import com.example.jsfdemo.domain.Book;
import com.example.jsfdemo.domain.Comment;
import com.example.jsfdemo.domain.User;

@ManagedBean
@ApplicationScoped
public class BookAndUserManager {
	
	List<Book> bookList = new ArrayList<Book>();
	List<User> userList = new ArrayList<User>();
	
	public String DeleteFavorite(User user,Book book)
	{
		user.favorites.remove(book);
		return "favorites?faces-redirect=true";
	}
	public List<Book> GetFavorites(User user)
	{
		for(User u : userList)
		{
			if(u.getUsername().equals(user.getUsername()))
			{
				return u.favorites;
			}
		}
		return null;
	}
	public void AddFavorite(User user,Book book)
	{
		user.favorites.add(book);
	}
	public List<Comment> GetBookComments(Book book)
	{
		//
		return book.comments;
	}
	public String AddComment(Book book , Comment comment , User user)
	{
		comment.setWrittenBy(user);
		book.comments.add(comment);
		return "list?faces-redirect=true";
	}
	public String AddBook(Book book ,User user)
	{
		book.setAddedBy(user.getUsername());
		bookList.add(book);
		
		return "home?faces-redirect=true";
	}
	public String AddUser(User user)
	{
		userList.add(user);
		user = new User();
		return "home?faces-redirect=true";
	}
	public String LogIn(User user)
	{
		for(User u: userList)
		{
			if(user.getUsername().equals(u.getUsername()) && user.getPassword().equals(u.getPassword()))
			{
				user.setLogedIn(true);
			}
		}
		return "home?faces-redirect=true";

	}
	public String LogOut(User user)
	{
		user.setLogedIn(false);
		return "home?faces-redirect=true";
	}
	public List<Book> getBookList() {
		return bookList;
	}
	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	public List<User> getUserList() {
		return userList;
	}
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	
}
