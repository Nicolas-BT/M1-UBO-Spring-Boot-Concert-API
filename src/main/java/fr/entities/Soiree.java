package fr.entities;

import javax.persistence.*;

import lombok.Data;

@Entity

public class Soiree {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "soi_id")
    private Integer soi_id;
    @Column(name = "soi_nom")
    private String nom;
    @ManyToOne
    @JoinColumn(name = "T_SALLECONCERT_sac_id")
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
