package com.example.demo.dto;

import java.sql.Date;

import org.springframework.data.annotation.Id;

import com.example.demo.model.Reserva;

public class ReservaDTO {

	@Id
	private int id_pelicula;
	private String nombreCliente;
	private String DNI;
	private String telefono;
	private String email;
	private Date fechaAlquiler;

	public ReservaDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReservaDTO(int id_pelicula, String nombreCliente, String DNI, String telefono, String email,
			Date fechaAlquiler) {
		super();
		this.id_pelicula = id_pelicula;
		this.nombreCliente = nombreCliente;
		this.DNI = DNI;
		this.telefono = telefono;
		this.email = email;
		this.fechaAlquiler = fechaAlquiler;
	}
	
	public ReservaDTO(Reserva r) {
		super();
		this.id_pelicula = r.getId_pelicula();
		this.nombreCliente = r.getNombreCliente();
		this.DNI = r.getDNI();
		this.telefono = r.getTelefono();
		this.email = r.getEmail();
		this.fechaAlquiler = new Date(r.getFechaAlquiler().getTime());
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

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String DNI) {
		this.DNI = DNI;
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

}
