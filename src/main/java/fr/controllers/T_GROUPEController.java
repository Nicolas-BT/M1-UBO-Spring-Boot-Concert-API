package fr.controllers;

import fr.dtos.T_CONCERTDto;
import fr.dtos.T_GROUPEDto;
import fr.services.impl.T_GROUPEServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/tgroupes")
public class T_GROUPEController {

    private final T_GROUPEServiceImpl tGroupeService;

    public T_GROUPEController(T_GROUPEServiceImpl tGroupeService) {
        this.tGroupeService = tGroupeService;
    }

    /**
     * <p>Get all t_concert in the system</p>
     * @return List<T_GROUPEDto>
     */
    @GetMapping
    public List<T_GROUPEDto> getgroupes() {
        return tGroupeService.getAllGroupes();
    }

    /**
     * Method to get the t_groupe based on the ID
     */
    @GetMapping("/{id}")
    public T_GROUPEDto getgroupe(@PathVariable Integer id){
        return tGroupeService.getGroupeById(id) ;
    }

    /**
     * Create a new t_groupe in the system
     */
    @PostMapping
    public T_GROUPEDto savegroupe(final @RequestBody T_GROUPEDto tGroupeDto){
        return tGroupeService.savegroupe(tGroupeDto);
    }

    /**
     * Delete a t_groupe by it's id
     */
    @DeleteMapping("/{id}")
    public Boolean deletegroupe(@PathVariable Integer id){

        return tGroupeService.deleteGroupe(id);
    }
}

