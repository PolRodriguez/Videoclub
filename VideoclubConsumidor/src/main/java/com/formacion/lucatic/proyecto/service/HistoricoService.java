package com.formacion.lucatic.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.formacion.lucatic.proyecto.dto.HistoricoDTO;

@Service
public class HistoricoService {

	@Autowired
	public RestTemplate restTemplate;

	private final String NOMBRE_MICRO = "http://VideoclubProductorMongo/";
	private final String BASE = NOMBRE_MICRO + "api/historico/";
	private String save = BASE + "alta";
	private String getAll = BASE;


	public List<HistoricoDTO> getAll() {
		return (List<HistoricoDTO>) restTemplate.getForObject(getAll, List.class);
	}

	public HistoricoDTO save(HistoricoDTO historico) {
		return restTemplate.postForObject(save, historico, HistoricoDTO.class);
	}

}
