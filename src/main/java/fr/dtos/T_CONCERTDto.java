package fr.dtos;
import fr.entities.T_GROUPE;
import fr.entities.T_SOIREE;
import lombok.Data;

import java.sql.Date;
import java.sql.Time;

@Data
public class T_CONCERTDto {
    private long con_id;
    private String con_nom;
    private Date con_date;
    private Time con_heure;
    private Time con_duree;
    private T_GROUPE grp_id;
    private T_SOIREE soi_id;
}
