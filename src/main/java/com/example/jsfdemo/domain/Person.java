package com.example.jsfdemo.domain;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.*;

public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2961185267432537284L;
	private String firstname;
	private String Surname;
	private String pin;
	private String zipCode="";
	private Date dob = new Date();
	private double weight;
	private boolean married;
	private int numOfChildren;
	
	@Pattern(regexp="[0-9]{2}-[0-9]{3}")
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	@Past
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	@Min(0)
	public int getNumOfChildren() {
		return numOfChildren;
	}
	public void setNumOfChildren(int numOfChildren) {
		this.numOfChildren = numOfChildren;
	}
	
	@Size(min=2, max=20,
			message="imię powinno mieć od 2 do 20 znaków")
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	@Size(min=2, max=20,
			message="imię powinno mieć od 2 do 20 znaków")
	
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	
	
}
