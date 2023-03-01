package fr.controllers;

import fr.dtos.SoireeDto;
import fr.services.SoireeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tsoiree")
public class SoireeController {

    private final SoireeService tSoireeService;

    public SoireeController(SoireeService tSoireeService) {
        this.tSoireeService = tSoireeService;
    }

    /**
     * <p>Get all t_soiree in the system</p>
     * @return List<T_SOIREEDto>
     */
    @GetMapping
    public List<SoireeDto> getSoirees() {
        return tSoireeService.getAllSoirees();
    }

    /**
     * Method to get the t_soiree based on the ID
     */
    @GetMapping("/{id}")
    public SoireeDto getSoiree(@PathVariable Integer id){
        return tSoireeService.getSoireeById(id) ;
    }

    /**
     * Create a new t_soiree in the system
     */
    @PostMapping
    public SoireeDto saveSoiree(final @RequestBody SoireeDto tSoireeDto){
        return tSoireeService.saveSoiree(tSoireeDto);
    }

    /**
     * Delete a t_soiree by it's id
     */
    @DeleteMapping("/{id}")
    public Boolean deleteSoiree(@PathVariable Integer id){

        return tSoireeService.deletesoiree(id);
    }
}
