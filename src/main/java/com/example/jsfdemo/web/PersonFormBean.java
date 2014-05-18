package com.example.jsfdemo.web;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.*;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import com.example.jsfdemo.domain.Person;
import com.example.jsfdemo.service.PersonManager;

@SessionScoped
@Named("personBean")
public class PersonFormBean implements Serializable
{

	private static final long serialVersionUID = 1L;

	private Person person = new Person();
	private ListDataModel<Person> persons = new ListDataModel<Person>();
	
	
	@Inject
	private PersonManager pm;
	
	public ListDataModel<Person> getAllPersons()
	{
		persons.setWrappedData(pm.getAllPersons());
		return persons;
	}
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	} 
	
	public String add()
	{
		pm.addPerson(person);
		person=new Person();
		return "showAllPersons";
	}
	
	public String delete(Person person)
	{
		pm.delete(person);
		return null;
	}
	
	public String delete2()
	{
		Person person = persons.getRowData();
		pm.delete(person);
		return null;
	}
	
	
	public void validateUniquePin(ComponentSystemEvent event)
	{
		UIForm form = (UIForm) event.getComponent();
		UIInput pinInput = (UIInput)form.findComponent("pin");
		
		String pin = (String)pinInput.getValue();
		
		boolean exist = false;
		
		for(Person p : pm.getAllPersons())
		{
			if(p.getPin().equalsIgnoreCase(pin))
			{
				exist=true;
				break;
			}
		}
		
		if(exist)
		{
			FacesContext ctx = FacesContext.getCurrentInstance();
			
			ctx.addMessage(form.getClientId(), new FacesMessage(
					"osoba o podanym peselu już istnieje w bazie."));
			ctx.renderResponse();
			
		}
		
		
	}
	
}
