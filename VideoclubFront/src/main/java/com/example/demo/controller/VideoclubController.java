package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.Historico;
import com.example.demo.dto.Pelicula;
import com.example.demo.dto.Reserva;
import com.example.demo.services.VideoclubService;
import com.example.demo.util.ReservaForm;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@Controller
public class VideoclubController {

//	@Autowired
//	List<Pelicula> getPeliculas;
//	
//	@Autowired
//	List<Reserva> getReservas;
//	
//	@Autowired
//	List<Historico> getHistorico;
	
	@Autowired
	VideoclubService videoclubService;
	
	@RequestMapping("/")
	public String getIndex() {
		return "index";
	}
	
	@RequestMapping("/peliculas/disponibles")
	public String getPeliculasDisponibles(Model model) {
		model.addAttribute("peliculas", videoclubService.getPeliculas());
		return "peliculasDisponibles";
	}
	
	@RequestMapping("/peliculas/reservadas")
	public String getPeliculasReservadas(Model model) {
		model.addAttribute("reservadas", videoclubService.getReservas());
		return "peliculasReservadas";
	}
	
	@RequestMapping("/peliculas/historico")
	public String getHistorico(Model model) {
		model.addAttribute("historico", videoclubService.getHistorico());
		return "historico";
	}
	
	@RequestMapping("/peliculas/form/{id}")
	public String formPelicula(@PathVariable("id") int id, Model model) {
		model.addAttribute("reservaForm", new ReservaForm(id));
		return "formularioReserva";
	}
	
	@RequestMapping("/peliculas/reservar")
	public String reservarPelicula(@RequestBody ReservaForm reservaForm, Model model) {
		Reserva reserva = new Reserva(reservaForm);
		Pelicula peliculaReservar = videoclubService.getPelicula(reserva.getId_pelicula());
		peliculaReservar.setDisponible(false);
		videoclubService.updatePelicula(peliculaReservar);
		videoclubService.insertReserva(reserva);
		return this.getPeliculasDisponibles(model);
	}
	
	@RequestMapping("/peliculas/alta")
	public String altaPelicula(@RequestBody Pelicula pelicula, Model model) {
		//todo
		return this.getPeliculasDisponibles(model);
	}
	
	@RequestMapping("/peliculas/devolver/{id}")
	public String devolverPelicula(@PathVariable("id") int id, Model model) {
		Pelicula peliculaDevolver = videoclubService.getPelicula(id);
		peliculaDevolver.setDisponible(true);
		videoclubService.updatePelicula(peliculaDevolver);
		videoclubService.eliminarReserva(id);
		return this.getPeliculasReservadas(model);
	}
	
	@RequestMapping("/peliculas/borrar/{id}")
	public String borrarPelicula(@PathVariable("id") int id, Model model) {
		//todo
		return this.getPeliculasDisponibles(model);
	}
}
