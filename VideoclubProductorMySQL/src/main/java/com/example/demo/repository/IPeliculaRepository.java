package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Pelicula;

public interface IPeliculaRepository extends CrudRepository<Pelicula, Integer>{
	
	List<Pelicula> findByDisponible(boolean disponible);
}
