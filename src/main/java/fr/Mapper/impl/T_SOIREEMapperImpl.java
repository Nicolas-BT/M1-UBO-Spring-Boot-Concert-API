package fr.Mapper.impl;

import fr.dtos.T_SOIREEDto;
import fr.entities.T_SOIREE;

public class T_SOIREEMapperImpl {

    private T_SOIREEDto toDo(T_SOIREE soiree){
        T_SOIREEDto tSoireeDto = new T_SOIREEDto();
        tSoireeDto.setId(soiree.getId());
        tSoireeDto.setNom(soiree.getNom());
        tSoireeDto.setSalleConcertId(soiree.getSalleconcert());
        return  tSoireeDto;

    }
    private T_SOIREE toEntity(T_SOIREEDto soireeDto){
        T_SOIREE tSoiree = new T_SOIREE();
        tSoiree.setId(soireeDto.getId());
        tSoiree.setNom(soireeDto.getNom());
        tSoiree.setSalleconcert(soireeDto.getSalleConcertId());
        return tSoiree;

    }
}
