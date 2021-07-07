package com.formacion.lucatic.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formacion.lucatic.proyecto.dto.PeliculaDTO;
import com.formacion.lucatic.proyecto.service.PeliculaService;

@RestController
@RequestMapping("/api/peliculas")
public class PeliculaController {

	@Autowired
	PeliculaService serviceP;

	@GetMapping("/disponibles")
	public List<PeliculaDTO> getDisponibles() {
		return serviceP.getAllDisponibles();
	}

	@GetMapping("/{id_pelicula}")
	public PeliculaDTO get(@PathVariable("id_pelicula") Integer id) {
		return serviceP.get(id);
	}

	@PostMapping("/alta")
	public PeliculaDTO create(@RequestBody PeliculaDTO pelicula) {
		return serviceP.save(pelicula);
	}

	@PutMapping("/reservar")
	public void order(@RequestBody PeliculaDTO pelicula) {
		serviceP.order(pelicula);
	}

	@DeleteMapping("eliminar/{id_pelicula}")
	public void delete(@PathVariable("id_pelicula") Integer id) {
		serviceP.delete(id);
	}

}
