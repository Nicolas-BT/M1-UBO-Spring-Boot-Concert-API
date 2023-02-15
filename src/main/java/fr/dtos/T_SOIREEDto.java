package fr.dtos;

import fr.entities.T_SALLECONCERT;
import lombok.Data;

@Data
public class T_SOIREEDto {
    private long soi_id;
    private String soi_nom;
    private T_SALLECONCERT sac_id;
}
