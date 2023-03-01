package fr.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

import lombok.Data;

@Entity

public class Groupe {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "grp_id")
    private Integer grpid;      // Id du groupe
    @Column(name = "grp_nom")
    private String grp_nom;   // Nom de/s l'artiste/s (séparés par des ',')
    @Column(name = "grp_prenom")
    private String prenom;// Prenom de/s l'artiste/s (séparés par des ',')
    @Column(name = "grp_pseudo")
    private String pseudo;// Nom du groupe
    @Column(name = "grp_ville")
    private String ville; // Ville d'origine du groupe
    @Column(name = "grp_age")
    private String age;   // Age de/s l'artiste/s (séparés par des ',')
    @Column(name = "grp_nb")
    private String nb;    // Nombre d'artistes dans le groupe

    public Integer getGrpid() {
        return grpid;
    }

    public void setGrpid(Integer grpid) {
        this.grpid = grpid;
    }

    public String getGrp_nom() {
        return grp_nom;
    }

    public void setGrp_nom(String grp_nom) {
        this.grp_nom = grp_nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNb() {
        return nb;
    }

    public void setNb(String nb) {
        this.nb = nb;
    }
}
