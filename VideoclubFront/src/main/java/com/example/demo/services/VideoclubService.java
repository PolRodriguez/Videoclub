package com.example.demo.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.Historico;
import com.example.demo.dto.Pelicula;
import com.example.demo.dto.Reserva;

@Service
public class VideoclubService {

	@Autowired
	public RestTemplate restTemplate;
	public String url = "http://VideoclubConsumidor";
	
	public List<Pelicula> getPeliculas(){
		Pelicula[] peliculas = null;
		peliculas = restTemplate.getForObject(url+"/api/peliculas/disponibles", Pelicula[].class);
		return Arrays.asList(peliculas);
	}
	
	public Pelicula getPelicula(int id_pelicula) {
		return restTemplate.getForObject(url+"/api/peliculas/{id_pelicula}", Pelicula.class, id_pelicula);
	}
	
	public List<Reserva> getReservas(){
		Reserva[] reservas = null;
		reservas = restTemplate.getForObject(url+"/api/reservas", Reserva[].class);
		return Arrays.asList(reservas);
	}
	
	public List<Historico> getHistorico(){
		Historico[] historico = null;
		historico = restTemplate.getForObject(url+"/api/historico", Historico[].class);
		return Arrays.asList(historico);
	}
	
	public void updatePelicula(Pelicula pelicula) {
		
		restTemplate.put(url+"/api/peliculas/reservar", pelicula);
	}
	
	public void insertReserva(Reserva reserva) {
		restTemplate.postForObject(url+"/api/reservas/alta", reserva, Reserva.class);
	}
	
	public void eliminarReserva(int id_pelicula) {
		restTemplate.delete(url+"/api/reserva/{id_pelicula}", id_pelicula);
	}
}
