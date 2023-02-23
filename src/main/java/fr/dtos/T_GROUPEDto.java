package fr.dtos;
import lombok.Data;

@Data
public class T_GROUPEDto {
    private Integer grp_id;      // Id du groupe
    private String grp_nom;   // Nom de/s l'artiste/s (séparés par des ',')
    private String prenom;// Prenom de/s l'artiste/s (séparés par des ',')
    private String pseudo;// Nom du groupe
    private String ville; // Ville d'origine du groupe
    private String age;   // Age de/s l'artiste/s (séparés par des ',')
    private String nb;    // Nombre d'artistes dans le groupe
}
