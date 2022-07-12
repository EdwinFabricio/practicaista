package com.m5a.ista.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.m5a.ista.dao.IPersonaDao;
import com.m5a.ista.model.persona;

@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	private IPersonaDao person;
	
	@Override
	@Transactional(readOnly = true)
	public List<persona> findAll() {
		// TODO Auto-generated method stub
		return (List<persona>) person.findAll();
	}

	@Override
	public persona findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public persona save(persona p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
}
