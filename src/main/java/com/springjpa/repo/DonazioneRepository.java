package com.springjpa.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springjpa.model.Donazione;
import com.springjpa.model.Utente;

public interface DonazioneRepository extends CrudRepository<Donazione, Long>{

}
