package com.formacion.lucatic.proyecto.dto;

import java.io.Serializable;

public class PeliculaDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id_pelicula;
	private String categoria;
	private String titulo;
	private String director;
	private Integer duracion;
	private Boolean disponible;

	public PeliculaDTO() {
	}

	public Integer getId_pelicula() {
		return id_pelicula;
	}

	public void setId_pelicula(Integer id_pelicula) {
		this.id_pelicula = id_pelicula;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String directo) {
		this.director = directo;
	}

	public Integer getDuracion() {
		return duracion;
	}

	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}

	public Boolean getDisponible() {
		return disponible;
	}

	public void setDisponible(Boolean disponible) {
		this.disponible = disponible;
	}

}
