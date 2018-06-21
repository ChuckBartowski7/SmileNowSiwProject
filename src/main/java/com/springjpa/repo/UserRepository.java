package com.springjpa.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springjpa.model.Utente;

public interface UserRepository extends CrudRepository<Utente, Long>{

}
