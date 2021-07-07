package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ReservaDTO;
import com.example.demo.interfaces.IReservaService;
import com.example.demo.model.Reserva;
import com.example.demo.repository.IReservaRepository;
import com.example.demo.util.Convertidor;

@Service
public class ReservaService implements IReservaService {
	
	@Autowired
	IReservaRepository reservaRepo;

	@Override
	public void create(ReservaDTO reserva) {
		Reserva r = Convertidor.convertirReservaDTO(reserva);
		reservaRepo.save(r);
	}

	@Override
	public List<ReservaDTO> listAll() {
		return Convertidor.convertirListaReservas((List<Reserva>) reservaRepo.findAll());
	}

	@Override
	public ReservaDTO getReserva(int id_pelicula) {
		return Convertidor.convertirReserva(reservaRepo.findById(id_pelicula).orElse(null));
	}

	@Override
	public void deleteReserva(int id_pelicula) {
		reservaRepo.deleteById(id_pelicula);
	}

}
