package com.example.demo.interfaces;

import java.util.List;

import com.example.demo.dto.HistoricoDTO;

public interface IHistoricoService {
	
	public void create(HistoricoDTO historico);
	public List<HistoricoDTO> listAll();

}
