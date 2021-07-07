package com.example.demo.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

import com.example.demo.dto.HistoricoDTO;

public class Historico {

	@Id
	private String id;
	private int id_pelicula;
	private String nombreCliente;
	private String DNI;
	private String telefono;
	private String email;
	private Date fechaAlquiler;
	private Date fechaDevolucion;

	public Historico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Historico(int id_pelicula, String nombreCliente, String DNI, String telefono, String email,
			Date fechaAlquiler, Date fechaDevolucion) {
		super();
		this.id_pelicula = id_pelicula;
		this.nombreCliente = nombreCliente;
		this.DNI = DNI;
		this.telefono = telefono;
		this.email = email;
		this.fechaAlquiler = fechaAlquiler;
		this.fechaDevolucion = fechaDevolucion;
	}

	public Historico(HistoricoDTO h) {
		super();
		this.id_pelicula = h.getId_pelicula();
		this.nombreCliente = h.getNombreCliente();
		this.DNI = h.getDNI();
		this.telefono = h.getTelefono();
		this.email = h.getEmail();
		this.fechaAlquiler = new Date(h.getFechaAlquiler().getTime());
		this.fechaDevolucion = new Date(h.getFechaDevolucion().getTime());
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

	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

}
