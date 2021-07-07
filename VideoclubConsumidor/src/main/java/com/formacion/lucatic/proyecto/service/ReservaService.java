package com.formacion.lucatic.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.formacion.lucatic.proyecto.dto.ReservaDTO;

@Service
public class ReservaService {

	@Autowired
	public RestTemplate restTemplate;

	private final String NOMBRE_MICRO = "http://VideoclubProductorMongo/";
	private final String BASE = NOMBRE_MICRO + "api/reservas/";
	private String save = BASE + "alta";
	private String get = BASE + "{id_pelicula}";
	private String getAll = BASE;
	private String delete = BASE + "eliminar/{id_pelicula}";

	public List<ReservaDTO> getAll() {
		return (List<ReservaDTO>) restTemplate.getForObject(getAll, List.class);
	}

	public ReservaDTO get(Integer id) {
		return restTemplate.getForObject(get, ReservaDTO.class);
	}

	public ReservaDTO save(ReservaDTO cita) {
		return restTemplate.postForObject(save, cita, ReservaDTO.class);
	}

	public void delete(Integer id) {
		restTemplate.delete(delete, id);
	}

}
