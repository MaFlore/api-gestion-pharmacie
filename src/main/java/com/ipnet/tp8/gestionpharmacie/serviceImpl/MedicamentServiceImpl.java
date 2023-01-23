package com.ipnet.tp8.gestionpharmacie.serviceImpl;

import com.ipnet.tp8.gestionpharmacie.model.Medicament;
import com.ipnet.tp8.gestionpharmacie.repository.MedicamentRepository;
import com.ipnet.tp8.gestionpharmacie.service.MedicamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicamentServiceImpl implements MedicamentService {

    @Autowired
    public MedicamentRepository medicamentRepository;

    @Override
    public Medicament save(Medicament medicament){
        return this.medicamentRepository.save(medicament);
    }

    @Override
    public  Medicament update(Medicament medicament){
        return this.medicamentRepository.save(medicament);
    }

    @Override
    public void deleteById(Integer id){
        this.medicamentRepository.deleteById(id);
    }

    @Override
    public void deleteMedicament(Medicament medicament){
        this.medicamentRepository.deleteById(medicament.getId());
    }

    @Override
    public List<Medicament> getAll(){
        return this.medicamentRepository.findAll();
    }

    @Override
    public Medicament findById(Integer id){
        return this.medicamentRepository.findById(id).orElse(null);
    }

    @Override
    public Medicament findByLibelle(String libelle){
        return this.medicamentRepository.findByLibelle(libelle);
    }

    @Override
    public Medicament findByLibelleAndCategorie(String libelle, String categorie){
        return this.medicamentRepository.findByLibelleAndCategorie(libelle, categorie);
    }

    @Override
    public long count(){
        return this.medicamentRepository.count();
    }
}

