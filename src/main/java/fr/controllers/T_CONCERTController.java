package fr.controllers;

import fr.dtos.DogDto;
import fr.dtos.T_CONCERTDto;
import fr.services.impl.T_CONCERTServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tconcerts")
public class T_CONCERTController {

    private final T_CONCERTServiceImpl tConcertService;

    public T_CONCERTController(T_CONCERTServiceImpl tConcertService) {
        this.tConcertService = tConcertService;
    }

    /**
     * <p>Get all t_concert in the system</p>
     * @return List<T_CONCERTDto>
     */
    @GetMapping
    public List<T_CONCERTDto> getconcerts() {
        return tConcertService.getAllConcerts();
    }

    /**
     * Method to get the t_concert based on the ID
     */
    @GetMapping("/{id}")
    public T_CONCERTDto getconcert(@PathVariable Integer id){
        return tConcertService.getConcertById(id) ;
    }

    /**
     * Create a new t_concert in the system
     */
    @PostMapping
    public T_CONCERTDto saveconcert(final @RequestBody T_CONCERTDto tConcertDto){
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
