package fr.controllers;

import fr.dtos.T_SALLECONCERTDto;
import fr.services.T_SALLECONCERTService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tsalleconcert")
public class T_SALLECONCERTController {

    private final T_SALLECONCERTService tSalleconcertService;

    public T_SALLECONCERTController(T_SALLECONCERTService tSalleconcertService) {
        this.tSalleconcertService = tSalleconcertService;
    }

    /**
     * <p>Get all t_salleconcert in the system</p>
     * @return List<T_SALLECONCERTDto>
     */
    @GetMapping
    public List<T_SALLECONCERTDto> getsallesconcert() {
        return tSalleconcertService.getAllSalleConcerts();
    }

    /**
     * Method to get the t_salleconcert based on the ID
     */
    @GetMapping("/{id}")
    public T_SALLECONCERTDto getsalleconcert(@PathVariable Integer id){
        return tSalleconcertService.getSalleConcertById(id) ;
    }

    /**
     * Create a new t_salleconcert in the system
     */
    @PostMapping
    public T_SALLECONCERTDto savesalleconcert(final @RequestBody T_SALLECONCERTDto tSalleconcertDto){
        return tSalleconcertService.saveSalleConcert(tSalleconcertDto);
    }

    /**
     * Delete a t_salleconcert by it's id
     */
    @DeleteMapping("/{id}")
    public Boolean deletesalleconcert(@PathVariable Integer id){

        return tSalleconcertService.deleteSalleConcert(id);
    }
}
