package com.mvs.integrador.entidades;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/envioEmail")
public class EnvioEmail {

	@RequestMapping(method=RequestMethod.GET)
	public String enviar() {
		return "Email Enviado com Sucesso!";
	}
	
}
