package fr.entities;

import lombok.Data;

import javax.persistence.*;


import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity

public class Concert {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "con_id")
    private Integer conId;
    @Column(name = "con_nom")
    private String nom;
    @Column(name = "con_date")
    private LocalDate date;
    @Column(name = "con_heure")
    private LocalTime heure;
    @Column(name = "con_duree")
    private LocalTime duree;
    @ManyToOne
    @JoinColumn(name = "T_GROUPE_grp_id")
    private Groupe groupe;
    @ManyToOne
    @JoinColumn(name = "T_SOIREE_soi_id")
    private Soiree soiree;

    public Integer getConId() {
        return conId;
    }

    public void setConId(Integer conId) {
        this.conId = conId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getHeure() {
        return heure;
    }

    public void setHeure(LocalTime heure) {
        this.heure = heure;
    }

    public LocalTime getDuree() {
        return duree;
    }

    public void setDuree(LocalTime duree) {
        this.duree = duree;
    }

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }

    public Soiree getSoiree() {
        return soiree;
    }

    public void setSoiree(Soiree soiree) {
        this.soiree = soiree;
    }
}
