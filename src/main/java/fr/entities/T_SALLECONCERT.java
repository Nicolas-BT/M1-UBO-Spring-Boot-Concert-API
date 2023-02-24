package fr.entities;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
public class T_SALLECONCERT {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sac_id")
    private Integer sac_id;
    @Column(name = "sac_nom")
    private String nom;
    @Column(name = "sac_adresse")
    private String adresse;
    @Column(name = "sac_capacite")
    private Integer capacite;
    @Column(name = "sac_ges_nom")
    private String ges_nom;
    @Column(name = "sac_ges_association")
    private String ges_association;
}
