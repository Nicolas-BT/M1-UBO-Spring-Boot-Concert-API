package fr.dtos;
import lombok.Data;

@Data
public class T_SALLECONCERTDto {
    private long sac_id;
    private String sac_nom;
    private String sac_adresse;
    private long sac_capacite;
    private String sac_ges_nom;
    private String sac_ges_association;
}
