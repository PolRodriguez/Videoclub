package com.example.demo.dto;

public class Pelicula {
	
	private int id_pelicula;
	private String categoria;
	private String titulo;
	private String director;
	private int duracion;
	private boolean disponible;
	
	public Pelicula() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pelicula(int id_pelicula) {
		super();
		this.id_pelicula = id_pelicula;
	}

	public Pelicula(int id_pelicula, String categoria, String titulo, String director, int duracion,
			boolean disponible) {
		super();
		this.id_pelicula = id_pelicula;
		this.categoria = categoria;
		this.titulo = titulo;
		this.director = director;
		this.duracion = duracion;
		this.disponible = disponible;
	}

	public int getId_pelicula() {
		return id_pelicula;
	}

	public void setId_pelicula(int id_pelicula) {
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

	public void setDirector(String director) {
		this.director = director;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	@Override
	public String toString() {
		return "Pelicula [id_pelicula=" + id_pelicula + ", categoria=" + categoria + ", titulo=" + titulo
				+ ", director=" + director + ", duracion=" + duracion + ", disponible=" + disponible + "]";
	}
	
}
