package com.ida.tarea.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ida.tarea.model.Pizerria;
import com.ida.tarea.repository.PizerriaRepository;


@Service
public class PizerriaServiceImpl implements PizerriaService {
	
	@Autowired
	private PizerriaRepository repository;

	@Override
	public List<Pizerria> listarPizerrias() {
		return repository.findAll();
	}
	

	@Override
	public Pizerria obtenerPizerrias() {
		// TODO Auto-generated method stub

		return null;
	}

	@Override
	public void guardarPizerrias(Pizerria pizerria) {
		repository.save(pizerria);
		
	}

	@Override
	public void actualizarPizerrias(Pizerria pizerria) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarPizerrias() {
		// TODO Auto-generated method stub
		
	}

}
