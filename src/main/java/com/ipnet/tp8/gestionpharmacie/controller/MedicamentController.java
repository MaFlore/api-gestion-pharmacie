package com.ipnet.tp8.gestionpharmacie.controller;

import com.ipnet.tp8.gestionpharmacie.model.Medicament;
import com.ipnet.tp8.gestionpharmacie.repository.MedicamentRepository;
import com.ipnet.tp8.gestionpharmacie.service.MedicamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class MedicamentController {

    @Autowired
    public MedicamentService medicamentService;
    @Autowired
    private MedicamentRepository medicamentRepository;

    @RequestMapping(value = "/medicaments", method = RequestMethod.GET)
    public List<Medicament> getAllMedicaments() {

        List<Medicament> medicaments = new ArrayList<>();

        try {
            medicaments = this.medicamentService.getAll();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Erreur " + e.getMessage());
        }

        return medicaments;

    }

    @RequestMapping(value = "/medicament/{id}", method = RequestMethod.GET)
    public Medicament getOneMedicament(@PathVariable int id) {

        Medicament medicament = new Medicament();

        try {
            medicament = this.medicamentService.findById(id);
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }

        return medicament;
    }

    @RequestMapping(value = "medoc/{libelle}", method = RequestMethod.GET)
    public Medicament findByLibelle(@PathVariable String libelle) {

        Medicament medicament = new Medicament();
        try {
            medicament = this.medicamentService.findByLibelle(libelle);
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }
        return medicament;
    }

    @RequestMapping(value = "medic/{libelle}/{categorie}", method = RequestMethod.GET)
    public Medicament findByLibelleAndCategorie(@PathVariable String libelle, @PathVariable String categorie) {

        Medicament medicament = new Medicament();

        try {
            medicament = this.medicamentService.findByLibelleAndCategorie(libelle, categorie);
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }

        return medicament;
    }

    @RequestMapping(value = "/medicament/ajouter", method = RequestMethod.POST, headers = "accept=Application/json")
    public Medicament saveMedicament(@RequestBody Medicament medicament) {

        try {
            medicament = this.medicamentService.save(medicament);
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }

        return medicament;
    }

    @RequestMapping(value = "/medicament/modifier/{id}", method = RequestMethod.PUT, headers = "accept=Application/json")
    public Medicament updateArticle(@RequestBody Medicament medicament, @PathVariable  int id) {

        try {
            medicament = this.medicamentService.update(medicament);
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }

        return medicament;

    }

    @RequestMapping(value = "/medicament/supprimer/{id}", method = RequestMethod.DELETE, headers = "accept=Application/json")
    public void deleteMedicamentById(@PathVariable Integer id) {
        this.medicamentService.deleteById(id);
    }

    @RequestMapping(value = "/medicament/supprimer", method = RequestMethod.POST, headers = "accept=Application/json")
    public void deleteMedicament(@RequestBody Medicament medicament) {
        this.medicamentService.deleteMedicament(medicament);
    }

    @RequestMapping(value = "/medicament/count", method = RequestMethod.GET)
    public int countMedicament() {
        int nombres = (int) this.medicamentService.count();
        return nombres;
    }

}