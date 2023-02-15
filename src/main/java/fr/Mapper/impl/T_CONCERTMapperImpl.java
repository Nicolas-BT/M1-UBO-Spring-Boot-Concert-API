package fr.Mapper.impl;

import fr.dtos.T_CONCERTDto;
import fr.entities.T_CONCERT;

public class T_CONCERTMapperImpl {

    private T_CONCERTDto toDo(T_CONCERT concert){
        T_CONCERTDto tConcertDto = new T_CONCERTDto();
        tConcertDto.setId(concert.getId());
        tConcertDto.setNom(concert.getNom());
        tConcertDto.setDate(concert.getDate());
        tConcertDto.setHeure(concert.getHeure());
        tConcertDto.setDuree(concert.getDuree());
        tConcertDto.setGroupeId(concert.getGroupe());
        tConcertDto.setSoireeId(concert.getSoiree());
        return tConcertDto;

    }
    private T_CONCERT toEntity(T_CONCERTDto concertDto){
        T_CONCERT tConcert = new T_CONCERT();
        tConcert.setId(concertDto.getId());
        tConcert.setNom(concertDto.getNom());
        tConcert.setDate(concertDto.getDate());
        tConcert.setHeure(concertDto.getHeure());
        tConcert.setDuree(concertDto.getDuree());
        tConcert.setGroupe(concertDto.getGroupeId());
        tConcert.setSoiree(concertDto.getSoireeId());
        return tConcert;

    }
}
