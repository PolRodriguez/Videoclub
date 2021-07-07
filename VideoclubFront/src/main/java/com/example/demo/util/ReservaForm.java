package com.example.demo.util;

public class ReservaForm {

	private String id_pelicula;
	private String nombreCliente;
	private String dni;
	private String telefono;
	private String email;
	private String fechaAlquiler;
	
	public ReservaForm() {
		super();
	}
	
	public ReservaForm(int id_pelicula) {
		super();
		this.id_pelicula = Integer.toString(id_pelicula);
	}

	public ReservaForm(String id_pelicula, String nombreCliente, String dni, String telefono, String email) {
		super();
		this.id_pelicula = id_pelicula;
		this.nombreCliente = nombreCliente;
		this.dni = dni;
		this.telefono = telefono;
		this.email = email;
	}

	public String getId_pelicula() {
		return id_pelicula;
	}


	public void setId_pelicula(String id_pelicula) {
		this.id_pelicula = id_pelicula;
	}


	public String getNombreCliente() {
		return nombreCliente;
	}


	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public String getFechaAlquiler() {
		return fechaAlquiler;
	}

	public void setFechaAlquiler(String fechaAlquiler) {
		this.fechaAlquiler = fechaAlquiler;
	}

	
}
