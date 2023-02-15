package fr.services;

import fr.dtos.T_CONCERTDto;
import fr.dtos.T_SALLECONCERTDto;
import fr.entities.T_SALLECONCERT;

import java.util.List;

public interface T_SALLECONCERTService {

    /**
     * Sauve a salle concert
     */
    T_SALLECONCERTDto saveSalleConcert (T_SALLECONCERTDto tSalleconcertDto);

    /**
     * Get a  salle concert by it's id
     */
    T_SALLECONCERTDto getSalleConcertById(Integer SalleConcertId);

    /**
     * Delete a  salle concert by it's id
     */
    boolean deleteSalleConcert(Integer SalleConcertId);

    /**
     * Get all the  salle concerts
     */
    List<T_SALLECONCERTDto> getAllSalleConcerts();
}
