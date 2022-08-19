package com.ida.tarea.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ida.tarea.model.Pizerria;

@Repository
public interface  PizerriaRepository extends JpaRepository<Pizerria, Integer> {

}
