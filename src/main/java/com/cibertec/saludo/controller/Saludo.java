package com.cibertec.saludo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//metodo
@Controller
public class Saludo {
	
	@ResponseBody
	@RequestMapping("/")
	public String hola() {
		return "Hola mundo";
	}
	
	@RequestMapping("/hola")
	public String holaMundo() {
		return "saludo";
	}
}
