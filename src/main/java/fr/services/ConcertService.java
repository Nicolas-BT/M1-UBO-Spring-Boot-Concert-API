package fr.services;

import fr.dtos.ConcertDto;

import java.util.List;

public interface ConcertService {

    /**
     * Sauve a concert
     */
    ConcertDto saveConcert (ConcertDto tConcertDto);

    /**
     * Get a concert by its id
     */
    ConcertDto getConcertById(Integer ConcertId);

    /**
     * Delete a concert by its id
     */
    boolean deleteConcert(Integer ConcertId);

    /**
     * Get all the concerts
     */
    List<ConcertDto> getAllConcerts();
}
