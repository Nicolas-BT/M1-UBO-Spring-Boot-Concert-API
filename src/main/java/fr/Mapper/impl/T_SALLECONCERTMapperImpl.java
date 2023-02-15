package fr.Mapper.impl;

import fr.dtos.T_SALLECONCERTDto;
import fr.entities.T_SALLECONCERT;

public class T_SALLECONCERTMapperImpl {

    private T_SALLECONCERTDto toDo (T_SALLECONCERT salleconcert){
        T_SALLECONCERTDto tSalleconcertDto = new T_SALLECONCERTDto();
        tSalleconcertDto.setId(salleconcert.getId());
        tSalleconcertDto.setNom(salleconcert.getNom());
        tSalleconcertDto.setAdresse(salleconcert.getAdresse());
        tSalleconcertDto.setCapacite(salleconcert.getCapacite());
        tSalleconcertDto.setGes_nom(salleconcert.getGes_nom());
        tSalleconcertDto.setGes_association(salleconcert.getGes_association());
        return  tSalleconcertDto;

    }
    private T_SALLECONCERT toEntity(T_SALLECONCERTDto salleconcertDto){
        T_SALLECONCERT tSalleconcert = new T_SALLECONCERT();
        tSalleconcert.setId(salleconcertDto.getId());
        tSalleconcert.setNom(salleconcertDto.getNom());
        tSalleconcert.setAdresse(salleconcertDto.getAdresse());
        tSalleconcert.setCapacite(salleconcertDto.getCapacite());
        tSalleconcert.setGes_nom(salleconcertDto.getGes_nom());
        tSalleconcert.setGes_association(salleconcertDto.getGes_association());
        return tSalleconcert;
    }
}
