package com.ida.tarea.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ida.tarea.model.Pizerria;
import com.ida.tarea.service.PizerriaService;



@Controller
@RequestMapping("/api/v1/pizerria")
public class PizerriaController {
	
	
	@Autowired
	private PizerriaService service;
	

	@GetMapping("/hola")
	public @ResponseBody String holamundo() {
		return "Hola mundo";
	}
	
	@GetMapping("/listar")
	public @ResponseBody List<Pizerria> listarPizerrias(){
		return service.listarPizerrias();
	}
	
	@GetMapping("/listar/{id}")
	public @ResponseBody Pizerria obtenerPizerria(@PathVariable Integer id){
		return null;
	}

	@PostMapping("/guardar")
	public @ResponseBody void guardarPizerria(@RequestBody Pizerria pizerria) {
		service.guardarPizerrias(pizerria);
	}
	
	@PutMapping("/actualizar")
	public void actualizarPizerria(@RequestBody Pizerria pizerria) {
		
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminarPizerria(@PathVariable Integer id) {
		
	}
	

}
