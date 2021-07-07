package com.formacion.lucatic.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.formacion.lucatic.proyecto.dto.PeliculaDTO;

@Service
public class PeliculaService {

	@Autowired
	public RestTemplate restTemplate;

	private final String NOMBRE_MICRO = "http://VideoclubProductorMySQL/";
	private final String BASE = NOMBRE_MICRO + "api/peliculas/";
	private String save = BASE + "alta";
	private String get = BASE + "{id_pelicula}";
	private String getAllDisponibles = BASE + "disponibles";
	private String reservar = BASE + "reservar";
	private String delete = BASE + "eliminar/{id_pelicula}";

	public List<PeliculaDTO> getAllDisponibles() {
		List<PeliculaDTO> citas = (List<PeliculaDTO>) restTemplate.getForObject(getAllDisponibles, List.class);
		return citas;
	}

	public PeliculaDTO get(Integer id) {
		return restTemplate.getForObject(get, PeliculaDTO.class, id);
	}

	public PeliculaDTO save(PeliculaDTO cita) {
		return restTemplate.postForObject(save, cita, PeliculaDTO.class);
	}

	public void order(PeliculaDTO cita) {
		restTemplate.put(reservar, cita);
	}

	public void delete(Integer id) {
		restTemplate.delete(delete, id);
	}

}
