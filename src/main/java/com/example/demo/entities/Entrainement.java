package com.example.demo.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("EV")
public class Entrainement extends Event {
	
	private String equipe;

	public Entrainement() {
		super();
	}

	public Entrainement(Long id, String nom, String description, Double prix, Date date_debut, Date date_fin,
			String equipe) {
		super(id, nom, description, prix, date_debut, date_fin);
		this.equipe = equipe;
	}

	public String getEquipe() {
		return equipe;
	}

	public void setEquipe(String equipe) {
		this.equipe = equipe;
	}
	
	

}
