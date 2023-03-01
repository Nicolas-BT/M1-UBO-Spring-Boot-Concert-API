package fr.controllers;

import fr.dtos.ConcertDto;
import fr.services.impl.ConcertServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tconcerts")
public class ConcertController {

    private final ConcertServiceImpl tConcertService;

    public ConcertController(ConcertServiceImpl tConcertService) {
        this.tConcertService = tConcertService;
    }

    /**
     * <p>Get all t_concert in the system</p>
     * @return List<T_CONCERTDto>
     */
    @GetMapping
    public List<ConcertDto> getconcerts() {
        return tConcertService.getAllConcerts();
    }

    /**
     * Method to get the t_concert based on the ID
     */
    @GetMapping("/{id}")
    public ConcertDto getconcert(@PathVariable Integer id){
        return tConcertService.getConcertById(id) ;
    }

    /**
     * Create a new t_concert in the system
     */
    @PostMapping
    public ConcertDto saveconcert(final @RequestBody ConcertDto tConcertDto){
        return tConcertService.saveConcert(tConcertDto);
    }

    /**
     * Delete a t_concert by it's id
     */
    @DeleteMapping("/{id}")
    public Boolean deleteconcert(@PathVariable Integer id){
        return tConcertService.deleteConcert(id);
    }
}
