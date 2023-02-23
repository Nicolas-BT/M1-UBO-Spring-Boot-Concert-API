package fr.controllers;

import fr.dtos.T_SALLECONCERTDto;
import fr.dtos.T_SOIREEDto;
import fr.services.T_SOIREEService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tsoiree")
public class T_SOIREEController {

    private final T_SOIREEService tSoireeService;

    public T_SOIREEController(T_SOIREEService tSoireeService) {
        this.tSoireeService = tSoireeService;
    }

    /**
     * <p>Get all t_soiree in the system</p>
     * @return List<T_SOIREEDto>
     */
    @GetMapping
    public List<T_SOIREEDto> getSoirees() {
        return tSoireeService.getAllSoirees();
    }

    /**
     * Method to get the t_soiree based on the ID
     */
    @GetMapping("/{id}")
    public T_SOIREEDto getSoiree(@PathVariable Integer id){
        return tSoireeService.getSoireeById(id) ;
    }

    /**
     * Create a new t_soiree in the system
     */
    @PostMapping
    public T_SOIREEDto saveSoiree(final @RequestBody T_SOIREEDto tSoireeDto){
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
