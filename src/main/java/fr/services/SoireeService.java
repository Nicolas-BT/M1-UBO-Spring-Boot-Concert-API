package fr.services;

import fr.dtos.SoireeDto;

import java.util.List;

public interface SoireeService {
    /**
     * Sauve a soiree
     */
    SoireeDto saveSoiree (SoireeDto tSoireeDto);

    /**
     * Get a soiree by it's id
     */
    SoireeDto getSoireeById(Integer SoireeId);

    /**
     * Delete a soiree by it's id
     */
    boolean deletesoiree(Integer SoireeId);

    /**
     * Get all the soirees
     */
    List<SoireeDto> getAllSoirees();
}
