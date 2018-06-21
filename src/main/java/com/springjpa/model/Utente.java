package com.springjpa.model;



import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "utente")
public class Utente {

	
	
	@Id
    @Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;
	
	
	@Column(name="enabled")
	private Boolean enabled;
	
	@OneToMany
	@JoinColumn(name="username")
	private Set<Ruolo> ruoli;

	protected Utente() {
	}

	public Utente(String username, String password,Boolean enabled) {
		this.username = username;
		this.password=password;
		this.enabled=enabled;
	}

	

	
}
