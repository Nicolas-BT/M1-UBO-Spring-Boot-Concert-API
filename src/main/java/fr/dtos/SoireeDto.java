package fr.dtos;

import fr.entities.SalleConcert;
import lombok.Data;


public class SoireeDto {
    private Integer soi_id;
    private String nom;
    private SalleConcert salleconcert;

    public Integer getSoi_id() {
        return soi_id;
    }

    public void setSoi_id(Integer soi_id) {
        this.soi_id = soi_id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public SalleConcert getSalleconcert() {
        return salleconcert;
    }

    public void setSalleconcert(SalleConcert salleconcert) {
        this.salleconcert = salleconcert;
    }
}
