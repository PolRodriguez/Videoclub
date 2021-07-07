package com.example.demo;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.Historico;
import com.example.demo.dto.Pelicula;
import com.example.demo.dto.Reserva;

@SpringBootApplication
public class VideoclubFrontApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideoclubFrontApplication.class, args);
	}
	
	@LoadBalanced
	@Bean
	RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public List<Pelicula> getPeliculas(){
		List<Pelicula> peliculas = new ArrayList<>();
		Pelicula p1 = new Pelicula(1, "Accion", "Titulo 1", "Director 1", 70, true);
		Pelicula p2 = new Pelicula(2, "Comedia", "Titulo 2", "Director 2", 120, true);
		Pelicula p3 = new Pelicula(3, "Terror", "Titulo 3", "Director 3", 80, true);
		peliculas.add(p1);
		peliculas.add(p2);
		peliculas.add(p3);
		return peliculas;
	}
	
	@Bean
	public List<Reserva> getReservas(){
		
		try {
			List<Reserva> reservas = new ArrayList<>();
			DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
			Reserva r1 = new Reserva( 4, "Persona 1", "DNI 1", "Telefono 1", "Email 1", new Date(df.parse("07-07-2021").getTime()));
			Reserva r2 = new Reserva( 5, "Persona 2", "DNI 2", "Telefono 2", "Email 2", new Date(df.parse("07-07-2021").getTime()));
			Reserva r3 = new Reserva( 6, "Persona 3", "DNI 3", "Telefono 3", "Email 3", new Date(df.parse("07-07-2021").getTime()));
			reservas.add(r1);
			reservas.add(r2);
			reservas.add(r3);
			return reservas;
			
		} catch(Exception e) {
			return null;
		}
		
	}
	
	@Bean
	public List<Historico> getHistorico(){
		
		try {
			List<Historico> historico = new ArrayList<>();
			DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
			Historico h1 = new Historico("1", 4, "Persona 1", "DNI 1", "Telefono 1", "Email 1", new Date(df.parse("07-07-2021").getTime()), new Date(df.parse("08-07-2021").getTime()));
			Historico h2 = new Historico("2", 5, "Persona 2", "DNI 2", "Telefono 2", "Email 2", new Date(df.parse("07-07-2021").getTime()), new Date(df.parse("09-07-2021").getTime()));
			historico.add(h1);
			historico.add(h2);
			return historico;
			
		} catch(Exception e) {
			return null;
		}
		
	}
}
