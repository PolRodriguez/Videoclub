package com.example.demo.dto;

import java.sql.Date;

import com.example.demo.model.Historico;
import com.example.demo.util.Convertidor;

public class HistoricoDTO extends ReservaDTO {

	private String id;
	private Date fechaDevolucion;

	public HistoricoDTO() {	}

	public HistoricoDTO(int id_pelicula, String nombreCliente, String DNI, String telefono, String email,
			Date fechaAlquiler, Date fechaDevolucion, String id) {
		super(id_pelicula, nombreCliente, DNI, telefono, email, fechaAlquiler);
		this.fechaDevolucion = fechaDevolucion;
	}

	public HistoricoDTO(Historico h) {
		super(h.getId_pelicula(), h.getNombreCliente(), h.getDNI(), h.getTelefono(), h.getEmail(),
				Convertidor.convertFromJAVADateToSQLDate(h.getFechaAlquiler()));
		this.fechaDevolucion = Convertidor.convertFromJAVADateToSQLDate(h.getFechaDevolucion());
		this.id = h.getId();
	}

	public HistoricoDTO(ReservaDTO r) {
		super(r.getId_pelicula(), r.getNombreCliente(), r.getDNI(), r.getTelefono(), r.getEmail(),
				Convertidor.convertFromJAVADateToSQLDate(r.getFechaAlquiler()));
		this.fechaDevolucion = Convertidor.convertFromJAVADateToSQLDate(null);
	}

	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
