package fr.dtos;

import fr.entities.T_SALLECONCERT;
import lombok.Data;

@Data
public class T_SOIREEDto {
    private Integer soi_id;
    private String nom;
    private T_SALLECONCERT salleconcert;
}
