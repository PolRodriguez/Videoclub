package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.HistoricoDTO;
import com.example.demo.interfaces.IHistoricoService;
import com.example.demo.model.Historico;
import com.example.demo.repository.IHistoricoRepository;
import com.example.demo.util.Convertidor;

@Service
public class HistoricoService implements IHistoricoService {

	@Autowired
	IHistoricoRepository historicoRepo;
	
	@Override
	public void create(HistoricoDTO historico) {
		Historico h = Convertidor.convertirHistoricoDTO(historico);
		historicoRepo.save(h);
	}

	@Override
	public List<HistoricoDTO> listAll() {
		return Convertidor.convertirListaHistorico((List<Historico>) historicoRepo.findAll());
	}

}
