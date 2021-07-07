package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Historico;
import com.example.demo.dto.Pelicula;
import com.example.demo.dto.Reserva;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api")
public class VideoclubRestController {

	@GetMapping("/peliculas/disponibles")
	public List<Pelicula> getPeliculasDisponibles(){
		return null;
	}
	
	@GetMapping("/peliculas/reservadas")
	public List<Reserva> getReservas(){
		return null;
	}
	
	@GetMapping("/peliculas/historico")
	public List<Historico> getHistorico(){
		return null;
	}
	
	@PostMapping("/peliculas/alta")
	public void altaPelicula(@RequestBody Pelicula pelicula) {
		
	}
	
	@PutMapping("/peliculas/reservar")
	public void reservarPelicula(@RequestBody Reserva reserva) {
		
	}
	
	@PutMapping("/peliculas/devolver/{id}")
	public void devolverPelicula(@PathVariable("id") int id) {
		
	}
	
	@DeleteMapping("/peliculas/borrar/{id}")
	public void borrarPelicula(@PathVariable("id") int id) {
		
	}
}