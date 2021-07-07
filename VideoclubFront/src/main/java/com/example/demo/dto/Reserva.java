package com.example.demo.dto;

import java.sql.Date;

import com.example.demo.util.ReservaForm;

public class Reserva {

	private int id_pelicula;
	private String nombreCliente;
	private String dni;
	private String telefono;
	private String email;
	private Date fechaAlquiler;
	
	public Reserva() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reserva(int id_pelicula) {
		super();
		this.id_pelicula = id_pelicula;
	}

	public Reserva(int id_pelicula, String nombreCliente, String dni, String telefono, String email,
			Date fechaAlquiler) {
		super();
		this.id_pelicula = id_pelicula;
		this.nombreCliente = nombreCliente;
		this.dni = dni;
		this.telefono = telefono;
		this.email = email;
		this.fechaAlquiler = fechaAlquiler;
	}
	
	public Reserva(ReservaForm r) {
		super();
		this.id_pelicula = Integer.parseInt(r.getId_pelicula());
		this.nombreCliente = r.getNombreCliente();
		this.dni = r.getDni();
		this.telefono = r.getTelefono();
		this.email = r.getEmail();
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

	@Override
	public String toString() {
		return "Reserva [id_pelicula=" + id_pelicula + ", nombreCliente=" + nombreCliente + ", dni=" + dni
				+ ", telefono=" + telefono + ", email=" + email + ", fechaAlquiler=" + fechaAlquiler + "]";
	}
	
}
