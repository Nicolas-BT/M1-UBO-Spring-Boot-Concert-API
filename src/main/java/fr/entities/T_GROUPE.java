package fr.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class T_GROUPE {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long grp_id;      // Id du groupe
    private String grp_nom;   // Nom de/s l'artiste/s (séparés par des ',')
    private String grp_prenom;// Prenom de/s l'artiste/s (séparés par des ',')
    private String grp_pseudo;// Nom du groupe
    private String grp_ville; // Ville d'origine du groupe
    private String grp_age;   // Age de/s l'artiste/s (séparés par des ',')
    private String grp_nb;    // Nombre d'artistes dans le groupe
}
