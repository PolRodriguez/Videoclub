package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.PeliculaDTO;
import com.example.demo.interfaces.IPeliculaService;
import com.example.demo.model.Pelicula;
import com.example.demo.repository.IPeliculaRepository;
import com.example.demo.util.Convertidor;

@Service
public class PeliculaService implements IPeliculaService {
	
	@Autowired
	IPeliculaRepository peliculaRepository;

	@Override
	public List<PeliculaDTO> peliculas() {
		// TODO Auto-generated method stub
		return Convertidor.convertirLista((List<Pelicula>) peliculaRepository.findAll());
	}

	@Override
	public PeliculaDTO peliculaById(int id) {
		// TODO Auto-generated method stub
		return Convertidor.convertirADTO(peliculaRepository.findById(id).orElse(null));
	}

	@Override
	public void alta(PeliculaDTO peliculaDTO) {
		// TODO Auto-generated method stub
		peliculaRepository.save(Convertidor.convertirAEntity(peliculaDTO));
		
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		peliculaRepository.deleteById(id);
		
	}

	@Override
	public void reservar(PeliculaDTO peliculaDTO) {
		// TODO Auto-generated method stub
		peliculaRepository.save(Convertidor.convertirAEntity(peliculaDTO));
	}
	
	

}
