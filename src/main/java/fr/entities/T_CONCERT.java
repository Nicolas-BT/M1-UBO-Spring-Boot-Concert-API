package fr.entities;

import javax.persistence.*;

import lombok.Data;


import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Data
public class T_CONCERT {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "con_id")
    private Integer con_id;
    @Column(name = "con_nom")
    private String nom;
    @Column(name = "con_date")
    private LocalDate date;
    @Column(name = "con_heure")
    private LocalTime heure;
    @Column(name = "con_duree")
    private Duration duree;
    @ManyToOne
    @JoinColumn(name = "T_GROUPE_grp_id")
    private T_GROUPE groupe;
    @ManyToOne
    @JoinColumn(name = "T_SOIREE_soi_id")
    private T_SOIREE soiree;
}
