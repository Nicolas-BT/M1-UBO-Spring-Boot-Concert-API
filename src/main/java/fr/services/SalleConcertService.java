package fr.services;

import fr.dtos.SalleConcertDto;

import java.util.List;

public interface SalleConcertService {

    /**
     * Sauve a salle concert
     */
    SalleConcertDto saveSalleConcert (SalleConcertDto tSalleconcertDto);

    /**
     * Get a  salle concert by it's id
     */
    SalleConcertDto getSalleConcertById(Integer SalleConcertId);

    /**
     * Delete a  salle concert by it's id
     */
    boolean deleteSalleConcert(Integer SalleConcertId);

    /**
     * Get all the  salle concerts
     */
    List<SalleConcertDto> getAllSalleConcerts();
}
