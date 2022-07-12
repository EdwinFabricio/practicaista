package com.m5a.ista.service;

import java.util.List;


import com.m5a.ista.model.persona;

public interface PersonaService {

	public List<persona>findAll();
	public persona findById(Long id);	 
	public persona save(persona p);
	public void delete(Long id);
	 
	
	
	
}
