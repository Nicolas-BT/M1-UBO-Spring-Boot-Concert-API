package fr.services;

import fr.dtos.T_CONCERTDto;
import fr.dtos.T_SOIREEDto;

import java.util.List;

public interface T_SOIREEService {
    /**
     * Sauve a soiree
     */
    T_SOIREEDto saveSoiree (T_SOIREEDto tSoireeDto);

    /**
     * Get a soiree by it's id
     */
    T_SOIREEDto getSoireeById(Integer SoireeId);

    /**
     * Delete a soiree by it's id
     */
    boolean deletesoiree(Integer SoireeId);

    /**
     * Get all the soirees
     */
    List<T_SOIREEDto> getAllSoirees();
}
