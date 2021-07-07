package com.formacion.lucatic.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formacion.lucatic.proyecto.dto.HistoricoDTO;
import com.formacion.lucatic.proyecto.service.HistoricoService;

@RestController
@RequestMapping("/api/historico")
public class HistoricoController {

	@Autowired
	HistoricoService service;

	@GetMapping("")
	public List<HistoricoDTO> getAll() {
		return service.getAll();
	}

	@PostMapping("/alta")
	public HistoricoDTO create(@ModelAttribute HistoricoDTO historico) {
		return service.save(historico);
	}
}
