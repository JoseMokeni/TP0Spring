package com.example.tp0.models;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class EnseignementId {
	
	@ManyToOne
	@JoinColumn(name = "idE")
	private Etudiant et;
	
	@ManyToOne
	@JoinColumn(name = "idP")
	private Prof pr;

}
