package fr.dtos;
import fr.entities.T_GROUPE;
import fr.entities.T_SOIREE;
import lombok.Data;

import java.sql.Date;
import java.sql.Time;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class T_CONCERTDto {
    private Integer con_id;
    private String nom;
    private LocalDate date;
    private LocalTime heure;
    private Duration duree;
    private T_GROUPE groupe;
    private T_SOIREE soiree;
}
