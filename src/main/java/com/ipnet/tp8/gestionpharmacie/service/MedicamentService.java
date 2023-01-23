package com.ipnet.tp8.gestionpharmacie.service;

import com.ipnet.tp8.gestionpharmacie.model.Medicament;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MedicamentService {

    //Ajout d'une occurrence ;
    public Medicament save(Medicament medicament);
    //Modification d'une occurrence ;
    public Medicament update(Medicament medicament);
    //Suppression d'une occurrence par la clé primaire ;
    public void deleteById(Integer id);
    //Suppression d'une occurrence par l'objet entier ;
    public void deleteMedicament(Medicament medicament);
    //Affichage de toutes les occurrences ;
    public List<Medicament> getAll();
    //Recherche d'une occurrence par la clé primaire ;
    public Medicament findById(Integer id);

    //Recherche d'une occurrence au moins par un autre attribut de l'entité
    public Medicament findByLibelle(String libelle);
    public Medicament findByLibelleAndCategorie(String libelle, String categorie);

    //Affichage du nombre d'occurrences.
    public long count();

}
