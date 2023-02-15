package fr.entities;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
public class T_SOIREE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long soi_id;
    private String soi_nom;
    @ManyToOne
    private T_SALLECONCERT sac_id;
}
