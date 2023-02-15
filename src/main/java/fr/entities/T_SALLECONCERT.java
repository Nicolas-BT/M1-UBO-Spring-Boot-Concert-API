package fr.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class T_SALLECONCERT {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long sac_id;
    private String sac_nom;
    private String sac_adresse;
    private long sac_capacite;
    private String sac_ges_nom;
    private String sac_ges_association;
}
