package com.formacion.lucatic.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formacion.lucatic.proyecto.dto.ReservaDTO;
import com.formacion.lucatic.proyecto.service.ReservaService;

@RestController
@RequestMapping("/api/reservas")
public class ReservaController {

	@Autowired
	ReservaService service;	
	
	@GetMapping("")
	public List<ReservaDTO> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/{id_pelicula}")
	public ReservaDTO get(@PathVariable("id_pelicula") Integer id) {
		return service.get(id);
	}
	
	@PostMapping("/alta")
	public ReservaDTO create(@RequestBody ReservaDTO reserva){
		return service.save(reserva);
	}
	
	@DeleteMapping("/eliminar/{id_pelicula}")
	public void delete(@PathVariable("id_pelicula") Integer id) {
		service.delete(id);
	}
	
}
