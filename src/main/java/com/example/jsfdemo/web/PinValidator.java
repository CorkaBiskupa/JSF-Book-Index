package com.example.jsfdemo.web;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("pinValidator")
public class PinValidator implements Validator{

	@Override
	public void validate(FacesContext ctx, 
			UIComponent component, 
			Object value)
			throws ValidatorException {
		
		String pin = (String) value;
		
		if(pin.length()<4)
		{
			FacesMessage messege = new FacesMessage();
			messege.setDetail("PIN musi mieć conajmniej 4 znaki");
			messege.setSummary("PIN musi mieć conajmniej 4 znaki");
			//messege.setSeverity(FacesMessage.SEVERITY_FATAL);
			throw new ValidatorException(messege);
		}
		
	}

}
