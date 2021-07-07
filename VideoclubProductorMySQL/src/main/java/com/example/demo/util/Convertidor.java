package com.example.demo.util;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.PeliculaDTO;
import com.example.demo.model.Pelicula;

public class Convertidor {
	
	public static List<PeliculaDTO> convertirLista(List<Pelicula> p) {
		List<PeliculaDTO> cdto = new ArrayList<PeliculaDTO>();
		for (Pelicula pelicula : p) {
			PeliculaDTO aux=new PeliculaDTO(pelicula);
			cdto.add(aux);
		}
		return cdto;
	}
	
	public static PeliculaDTO convertirADTO (Pelicula pelicula) {
		PeliculaDTO p = new PeliculaDTO();
		p.setId_pelicula(pelicula.getId_pelicula());
		p.setCategoria(pelicula.getCategoria());
		p.setDirector(pelicula.getDirector());
		p.setTitulo(pelicula.getTitulo());
		p.setDuracion(pelicula.getDuracion());
		p.setDisponible(pelicula.isDisponible());
		return p;
	}
	
	public static Pelicula convertirAEntity (PeliculaDTO pelicula) {
		Pelicula p = new Pelicula();
		p.setId_pelicula(pelicula.getId_pelicula());
		p.setCategoria(pelicula.getCategoria());
		p.setDirector(pelicula.getDirector());
		p.setTitulo(pelicula.getTitulo());
		p.setDuracion(pelicula.getDuracion());
		p.setDisponible(pelicula.isDisponible());
		return p;
	}
	
	
	

}
