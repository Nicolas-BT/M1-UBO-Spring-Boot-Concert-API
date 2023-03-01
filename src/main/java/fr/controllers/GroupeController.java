package fr.controllers;

import fr.dtos.GroupeDto;
import fr.services.impl.GroupeServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/tgroupes")
public class GroupeController {

    private final GroupeServiceImpl tGroupeService;

    public GroupeController(GroupeServiceImpl tGroupeService) {
        this.tGroupeService = tGroupeService;
    }

    /**
     * <p>Get all t_concert in the system</p>
     * @return List<T_GROUPEDto>
     */
    @GetMapping
    public List<GroupeDto> getgroupes() {
        return tGroupeService.getAllGroupes();
    }

    /**
     * Method to get the t_groupe based on the ID
     */
    @GetMapping("/{id}")
    public GroupeDto getgroupe(@PathVariable Integer id){
        return tGroupeService.getGroupeById(id) ;
    }

    /**
     * Create a new t_groupe in the system
     */
    @PostMapping
    public GroupeDto savegroupe(final @RequestBody GroupeDto tGroupeDto){
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

