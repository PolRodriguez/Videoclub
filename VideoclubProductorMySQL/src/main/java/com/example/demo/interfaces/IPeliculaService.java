package com.example.demo.interfaces;

import java.util.List;

import com.example.demo.dto.PeliculaDTO;
import com.example.demo.model.Pelicula;

public interface IPeliculaService {
		
	public List<PeliculaDTO> peliculas();
	public PeliculaDTO peliculaById(int id);
	public void alta(PeliculaDTO peliculaDTO);
	public void eliminar(int id);
	public void reservar(PeliculaDTO peliculaDTO);
	
	

}
