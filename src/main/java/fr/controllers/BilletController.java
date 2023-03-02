package fr.controllers;
import fr.dtos.BilletDto;
import fr.services.impl.BilletServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/billets")
public class BilletController {

    private final BilletServiceImpl tBilletService;

    public BilletController(BilletServiceImpl tBilletService) {
        this.tBilletService = tBilletService;
    }

    /**
     * <p>Get all t_Billet in the system</p>
     * @return List<T_BilletDto>
     */
    @GetMapping
    public List<BilletDto> getBillets() {
        return tBilletService.getAllBillets();
    }

    /**
     * Method to get the t_Billet based on the ID
     */
    @GetMapping("/{id}")
    public BilletDto getBillet(@PathVariable Integer id){
        return tBilletService.getBilletById(id) ;
    }

    /**
     * Create a new t_Billet in the system
     */
    @PostMapping
    public BilletDto saveBillet(final @RequestBody BilletDto tBilletDto){
        return tBilletService.saveBillet(tBilletDto);
    }

    /**
     * Delete a t_Billet by it's id
     */
    @DeleteMapping("/{id}")
    public Boolean deleteBillet(@PathVariable Integer id){
        return tBilletService.deleteBillet(id);
    }
}