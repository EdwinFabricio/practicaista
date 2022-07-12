package com.m5a.ista.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.m5a.ista.model.persona;
import com.m5a.ista.service.PersonaService;

@RestController
@RequestMapping("/api")
public class personaController {
	@Autowired
	private PersonaService personaService;
	
	
	 @GetMapping("/personas")
	public List<persona> indext(){
		
		return personaService.findAll();
	}
	
	
}
