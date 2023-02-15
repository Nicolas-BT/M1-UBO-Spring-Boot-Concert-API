package fr.services;

import fr.dtos.DogDto;
import fr.dtos.T_CONCERTDto;

import java.util.List;

public interface T_CONCERTService {

    /**
     * Sauve a concert
     */
    T_CONCERTDto saveConcert (T_CONCERTDto tConcertDto);

    /**
     * Get a concert by it's id
     */
    T_CONCERTDto getConcertById(Integer ConcertId);

    /**
     * Delete a concert by it's id
     */
    boolean deleteConcert(Integer ConcertId);

    /**
     * Get all the concerts
     */
    List<T_CONCERTDto> getAllConcerts();
}
