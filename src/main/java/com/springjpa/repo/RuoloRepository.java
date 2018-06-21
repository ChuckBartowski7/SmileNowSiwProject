package com.springjpa.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springjpa.model.Ruolo;
import com.springjpa.model.Utente;

public interface RuoloRepository extends CrudRepository<Ruolo, Long>{

}
