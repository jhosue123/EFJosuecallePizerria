package com.ida.tarea.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Pizerrias")
public class Pizerria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPizerria;
	private String direccion;
	private String sede;

	
}
