package com.example.jsfdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.example.jsfdemo.domain.Person;

@ApplicationScoped
public class PersonManager {

	private List<Person> db = new ArrayList<Person>();
	
	
	public void addPerson(Person person)
	{
		db.add(person);
	}
	
	public List<Person> getAllPersons()
	{
		return this.db;
	}
	
	public void delete(Person person)
	{
		db.remove(person);
	}
}
