package com.ida.tarea.service;

import java.util.List;

import com.ida.tarea.model.Pizerria;



public interface PizerriaService {
	public List<Pizerria> listarPizerrias();
	public Pizerria obtenerPizerrias();
	public void guardarPizerrias(Pizerria pizerria);
	public void actualizarPizerrias(Pizerria pizerria);
	public void eliminarPizerrias();

}
