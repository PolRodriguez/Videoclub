package com.formacion.lucatic.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@GetMapping("/{id}")
	public ReservaDTO get(@PathVariable("id") Integer id) {
		return service.get(id);
	}
	
	@PostMapping("/alta")
	public ReservaDTO create(@ModelAttribute ReservaDTO reserva){
		return service.save(reserva);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void delete(@PathVariable("id") Integer id) {
		service.delete(id);
	}
	
}
