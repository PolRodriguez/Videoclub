package com.example.demo.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.HistoricoDTO;
import com.example.demo.dto.ReservaDTO;
import com.example.demo.interfaces.IHistoricoService;
import com.example.demo.interfaces.IReservaService;

@RestController
@RequestMapping("/api")
public class Controlador {

	@Autowired
	IHistoricoService historicoService;
	
	@Autowired
	IReservaService reservaService;
	
	/*************************************CREATE*************************************/
	@PostMapping("/reservas/alta")
	public void nuevaReserva(@RequestBody ReservaDTO reserva) {
		reservaService.create(reserva);
	}
	
	@PostMapping("/historico/alta")
	public void nuevoHistorico(@RequestBody HistoricoDTO historico) {
		historicoService.create(historico);
	}
	
	/**************************************READ**************************************/
	@GetMapping("/reservas")
	public List<ReservaDTO> listAll() {
		return reservaService.listAll();
	}
	
	@GetMapping("/reservas/{id_pelicula}")
	public ReservaDTO getReserva(@PathVariable("id_pelicula") int id_pelicula) {
		return reservaService.getReserva(id_pelicula);
	}
	
	@GetMapping("/historico")
	public List<HistoricoDTO> getHistorico() {
		return historicoService.listAll();
	}
	
	/*************************************DELETE*************************************/
	@DeleteMapping("/reservas/eliminar/{id_pelicula}")
	public void deleteReserva(@PathVariable("id_pelicula") int id_pelicula) {
		ReservaDTO r = reservaService.getReserva(id_pelicula);
		if (r != null) {
			reservaService.deleteReserva(id_pelicula);
			HistoricoDTO h = new HistoricoDTO(r);
			historicoService.create(h);
		} 
	}
	
	/*************************************CONFIG*************************************/
	@GetMapping("/config")
	public void config() {
		java.util.Date utilDate = new java.util.Date();
		
		ReservaDTO r1 = new ReservaDTO(1, "Juan Santos", "456789123", "123465789", "juan@email.com", new Date(utilDate.getTime()));
		ReservaDTO r2 = new ReservaDTO(2, "Ines Ruiz", "455589123", "789465789", "ines@email.com", new Date(utilDate.getTime()));
		reservaService.create(r1);
		reservaService.create(r2);
		
		HistoricoDTO h1 = new HistoricoDTO(r1.getId_pelicula(), r1.getNombreCliente(), r1.getDNI(), r1.getTelefono(), r1.getEmail(), r1.getFechaAlquiler(), new Date(utilDate.getTime()), null);
		HistoricoDTO h2 = new HistoricoDTO(r2.getId_pelicula(), r2.getNombreCliente(), r2.getDNI(), r2.getTelefono(), r2.getEmail(), r2.getFechaAlquiler(), new Date(utilDate.getTime()), null);
		historicoService.create(h1);
		historicoService.create(h2);
		
		
	}

}
