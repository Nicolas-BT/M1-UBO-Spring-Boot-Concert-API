package fr.controllers;

import fr.dtos.SalleConcertDto;
import fr.services.SalleConcertService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tsalleconcert")
public class SalleConcertController {

    private final SalleConcertService tSalleconcertService;

    public SalleConcertController(SalleConcertService tSalleconcertService) {
        this.tSalleconcertService = tSalleconcertService;
    }

    /**
     * <p>Get all t_salleconcert in the system</p>
     * @return List<T_SALLECONCERTDto>
     */
    @GetMapping
    public List<SalleConcertDto> getsallesconcert() {
        return tSalleconcertService.getAllSalleConcerts();
    }

    /**
     * Method to get the t_salleconcert based on the ID
     */
    @GetMapping("/{id}")
    public SalleConcertDto getsalleconcert(@PathVariable Integer id){
        return tSalleconcertService.getSalleConcertById(id) ;
    }

    /**
     * Create a new t_salleconcert in the system
     */
    @PostMapping
    public SalleConcertDto savesalleconcert(final @RequestBody SalleConcertDto tSalleconcertDto){
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
