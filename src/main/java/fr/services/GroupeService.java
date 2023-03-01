package fr.services;

import fr.dtos.GroupeDto;

import java.util.List;

public interface GroupeService {
    /**
     * Sauve a groupe
     */
    GroupeDto savegroupe (GroupeDto tGroupeDto);

    /**
     * Get a groupe by it's id
     */
    GroupeDto getGroupeById(Integer GroupeId);

    /**
     * Delete a groupe by it's id
     */
    boolean deleteGroupe(Integer GroupeId);

    /**
     * Get all the groupes
     */
    List<GroupeDto> getAllGroupes();
}
