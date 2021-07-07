package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.PeliculaDTO;
import com.example.demo.repository.IPeliculaRepository;
import com.example.demo.service.PeliculaService;



@RestController
@RequestMapping("/api")
public class MiControlador {

	
	@Autowired
	PeliculaService peliculaService;
	
	
	
	@GetMapping("/peliculas/disponibles")
	public List<PeliculaDTO> getPeliculas(){
		return peliculaService.peliculas();
	}

	
	@GetMapping("/peliculas/{id_pelicula}")
	public PeliculaDTO peliculaById(@PathVariable("id_pelicula") int idPelicula) {
		return peliculaService.peliculaById(idPelicula);
	}
	
	
	@PostMapping("/peliculas/alta")
	public void altaCita( PeliculaDTO pelicula) {
		peliculaService.alta(pelicula);
	}
	
	
	
	@DeleteMapping("peliculas/eliminar/{id_pelicula}")
	public void deleteTramite(@PathVariable("id_pelicula") int idPelicula) {
		peliculaService.eliminar(idPelicula);
	}
	
	
	@PutMapping("peliculas/reservar")
	public void actualiarTramite(PeliculaDTO pelicula) {
		peliculaService.reservar(pelicula);
	}
	
	
	
	
}
