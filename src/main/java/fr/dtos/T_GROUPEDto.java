package fr.dtos;
import lombok.Data;

@Data
public class T_GROUPEDto {
    private long grp_id;      // Id du groupe
    private String grp_nom;   // Nom de/s l'artiste/s (séparés par des ',')
    private String grp_prenom;// Prenom de/s l'artiste/s (séparés par des ',')
    private String grp_pseudo;// Nom du groupe
    private String grp_ville; // Ville d'origine du groupe
    private String grp_age;   // Age de/s l'artiste/s (séparés par des ',')
    private String grp_nb;    // Nombre d'artistes dans le groupe
}
