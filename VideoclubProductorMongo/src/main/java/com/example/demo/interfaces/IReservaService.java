package com.example.demo.interfaces;

import java.util.List;

import com.example.demo.dto.ReservaDTO;

public interface IReservaService {

	public void create(ReservaDTO reserva);
	public List<ReservaDTO> listAll();
	public ReservaDTO getReserva(int id_pelicula);
	public void deleteReserva(int id_pelicula);
	
}
