package fr.dtos;
import fr.entities.Groupe;
import fr.entities.Soiree;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

public class ConcertDto {
    private Integer conId;
    private String nom;
    private LocalDate date;
    private LocalTime heure;
    private LocalTime duree;
    private Groupe groupe;
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
