package com.example.tp0.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Enseignement {
	
	@Id
	private EnseignementId eId = new EnseignementId();
	
	private int annee;

}
