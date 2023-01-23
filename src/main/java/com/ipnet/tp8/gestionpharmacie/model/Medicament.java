package com.ipnet.tp8.gestionpharmacie.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "medicaments")
public class Medicament implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "libelle", nullable = false, unique = true)
    private String libelle;

    @Column(name = "prix_unitaire", nullable = false)
    private Integer prixUnitaire;

    @Column(name = "quantite", nullable = false)
    private Integer quantite;

    @Column(name = "categorie", nullable = false)
    private String categorie;

    @Temporal(TemporalType.DATE)
    @Column(name = "date_perempation")
    private Date datePeremption;

    public Medicament() {
    }

    public Medicament(String libelle, Integer prixUnitaire, Integer quantite, String categorie, Date datePeremption) {
        this.libelle = libelle;
        this.prixUnitaire = prixUnitaire;
        this.quantite = quantite;
        this.categorie = categorie;
        this.datePeremption = datePeremption;
    }

    public Integer getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Integer getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(Integer prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public Date getDatePeremption() {
        return datePeremption;
    }

    public void setDatePeremption(Date datePeremption) {
        this.datePeremption = datePeremption;
    }

    @Override
    public String toString() {
        return "Medicament{" +
                "libelle='" + libelle + '\'' +
                ", prixUnitaire=" + prixUnitaire +
                ", quantite=" + quantite +
                ", categorie='" + categorie + '\'' +
                ", datePeremption=" + datePeremption +
                '}';
    }
}
