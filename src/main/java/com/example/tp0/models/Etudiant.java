package com.example.tp0.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Etudiant {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	@Column(length = 40, nullable = false, unique = true)
	private String nom;
	private double note;
	
	@ManyToOne
	@JoinColumn(name = "idG")
	private Groupe gr;
	
	/*
	@ManyToMany()
	@JoinTable(name = "Etudiant_Prof", joinColumns = @JoinColumn(name = "idEtudiant"), inverseJoinColumns = @JoinColumn(name = "idProf"))
	private List<Prof> listeProf = new ArrayList<Prof>();
	*/
	
	@OneToMany(mappedBy = "eId.et")
	private List<Enseignement> listeEnseignement = new ArrayList<Enseignement>();
	
	
	

}
