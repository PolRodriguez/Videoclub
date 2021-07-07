package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Historico;

public interface IHistoricoRepository extends CrudRepository<Historico, String> {

}
