package fr.dtos;
import lombok.Data;


public class GroupeDto {
    private Integer grpid;      // Id du groupe
    private String grp_nom;   // Nom de/s l'artiste/s (séparés par des ',')
    private String prenom;// Prenom de/s l'artiste/s (séparés par des ',')
    private String pseudo;// Nom du groupe
    private String ville; // Ville d'origine du groupe
    private String age;   // Age de/s l'artiste/s (séparés par des ',')
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
