package fr.entities;

import javax.persistence.*;

import lombok.Data;

import java.sql.Date;
import java.sql.Time;

@Entity
@Data
public class T_CONCERT {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long con_id;
    private String con_nom;
    private Date con_date;
    private Time con_heure;
    private Time con_duree;
    @ManyToOne
    private T_GROUPE grp_id;
    @ManyToOne
    private T_SOIREE soi_id;
}
