package fr.dtos;
import lombok.Data;


public class SalleConcertDto {
    private Integer sac_id;
    private String nom;
    private String adresse;
    private Integer capacite;
    private String ges_nom;
    private String ges_association;

    public Integer getSac_id() {
        return sac_id;
    }

    public void setSac_id(Integer sac_id) {
        this.sac_id = sac_id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Integer getCapacite() {
        return capacite;
    }

    public void setCapacite(Integer capacite) {
        this.capacite = capacite;
    }

    public String getGes_nom() {
        return ges_nom;
    }

    public void setGes_nom(String ges_nom) {
        this.ges_nom = ges_nom;
    }

    public String getGes_association() {
        return ges_association;
    }

    public void setGes_association(String ges_association) {
        this.ges_association = ges_association;
    }
}
