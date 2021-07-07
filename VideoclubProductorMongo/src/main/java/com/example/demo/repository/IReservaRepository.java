package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Reserva;

public interface IReservaRepository extends CrudRepository<Reserva, Integer> {

}
