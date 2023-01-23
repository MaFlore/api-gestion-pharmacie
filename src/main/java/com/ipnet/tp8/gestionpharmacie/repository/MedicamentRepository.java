package com.ipnet.tp8.gestionpharmacie.repository;

import com.ipnet.tp8.gestionpharmacie.model.Medicament;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicamentRepository extends JpaRepository<Medicament, Integer> {

    public Medicament findByLibelle(String libelle);
    public Medicament findByCategorie(String categorie);
    public Medicament findByLibelleAndCategorie(String libelle, String categorie);
}