package com.eventosapp.repositore;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eventosapp.models.Eventos;



@Repository
public interface EventoRepositore extends CrudRepository<Eventos,Integer> {

}
