package com.example.tp0.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Prof {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	@Column(length = 40, nullable = false, unique = true)
	private String nom;
	
	/*@ManyToMany(mappedBy = "listeProf")
	List<Etudiant> listeEtud = new ArrayList<Etudiant>();*/
	@OneToMany(mappedBy = "eId.pr")
	private List<Enseignement> listeEnseignement = new ArrayList<Enseignement>();
}
