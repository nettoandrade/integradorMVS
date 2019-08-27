package com.mvs.integrador.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mvs.integrador.entidades.Email;

@RestController
@RequestMapping(value="/envioEmail")
public class EnvioEmail {

	@RequestMapping(method=RequestMethod.GET)
	public List<Email> enviar() {
		
		Email email = new Email("1","antonio_netu@hotmail.com","antoniomunizdeandrade@gmail.com");
		
		List<Email> emails = new ArrayList<>();
		emails.add(email);
		
		return emails;
	}
	
}
