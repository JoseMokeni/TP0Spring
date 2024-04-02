package com.example.tp0.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tp0.models.Etudiant;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, UUID> {
	List<Etudiant> findByNom(String nom);
	List<Etudiant> findByNoteLessThan(double note);
	List<Etudiant> findByNomContainingAndNoteGreaterThan(String nom, double note);
	
}
