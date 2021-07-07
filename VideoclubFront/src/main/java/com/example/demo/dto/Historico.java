package com.example.demo.dto;

import java.sql.Date;

public class Historico{

	private String id;
	private int id_pelicula;
	private String nombreCliente;
	private String dni;
	private String telefono;
	private String email;
	private Date fechaAlquiler;
	private Date fechaDevolucion;
	
	public Historico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Historico(String id, int id_pelicula, String nombreCliente, String dni, String telefono, String email,
			Date fechaAlquiler, Date fechaDevolucion) {
		super();
		this.id = id;
		this.id_pelicula = id_pelicula;
		this.nombreCliente = nombreCliente;
		this.dni = dni;
		this.telefono = telefono;
		this.email = email;
		this.fechaAlquiler = fechaAlquiler;
		this.fechaDevolucion = fechaDevolucion;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getId_pelicula() {
		return id_pelicula;
	}

	public void setId_pelicula(int id_pelicula) {
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

	public Date getFechaAlquiler() {
		return fechaAlquiler;
	}

	public void setFechaAlquiler(Date fechaAlquiler) {
		this.fechaAlquiler = fechaAlquiler;
	}

	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	@Override
	public String toString() {
		return "Historico [id=" + id + ", id_pelicula=" + id_pelicula + ", nombreCliente=" + nombreCliente + ", dni="
				+ dni + ", telefono=" + telefono + ", email=" + email + ", fechaAlquiler=" + fechaAlquiler
				+ ", fechaDevolucion=" + fechaDevolucion + "]";
	}

}
