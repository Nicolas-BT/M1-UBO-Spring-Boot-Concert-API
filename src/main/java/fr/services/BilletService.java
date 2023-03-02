package fr.services;

import fr.dtos.BilletDto;

import java.util.List;

public interface BilletService {

    /**
     * Sauve a Billet
     */
    BilletDto saveBillet (BilletDto tBilletDto);

    /**
     * Get a Billet by its id
     */
    BilletDto getBilletById(Integer BilletId);

    /**
     * Delete a Billet by its id
     */
    boolean deleteBillet(Integer BilletId);

    /**
     * Get all the Billets
     */
    List<BilletDto> getAllBillets();
}
