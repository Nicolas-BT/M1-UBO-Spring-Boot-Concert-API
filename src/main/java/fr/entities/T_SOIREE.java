package fr.entities;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
public class T_SOIREE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "soi_id")
    private Integer id;
    @Column(name = "soi_nom")
    private String nom;
    @ManyToOne
    @JoinColumn(name = "T_SALLECONCERT_sac_id")
    private T_SALLECONCERT salleconcert;


}
