package fr.services;

import fr.dtos.T_CONCERTDto;
import fr.dtos.T_GROUPEDto;
import fr.repositories.T_GROUPERepository;

import java.util.List;

public interface T_GROUPEService {
    /**
     * Sauve a groupe
     */
    T_GROUPEDto savegroupe (T_GROUPEDto tGroupeDto);

    /**
     * Get a groupe by it's id
     */
    T_GROUPEDto getGroupeById(Integer GroupeId);

    /**
     * Delete a groupe by it's id
     */
    boolean deleteGroupe(Integer GroupeId);

    /**
     * Get all the groupes
     */
    List<T_GROUPEDto> getAllGroupes();
}
