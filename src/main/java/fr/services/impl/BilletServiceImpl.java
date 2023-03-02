package fr.services.impl;

import fr.Mapper.BilletMapper;
import fr.dtos.BilletDto;
import fr.entities.Billet;
import fr.repositories.BilletRepository;
import fr.services.BilletService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service("T_BILLETService")
public class BilletServiceImpl implements BilletService {


    private final BilletRepository tBilletRepository;

    private  final fr.Mapper.BilletMapper BilletMapper;




    public BilletServiceImpl(BilletRepository tBilletRepository, BilletMapper BilletMapper) {
        this.tBilletRepository = tBilletRepository;

        this.BilletMapper = BilletMapper;
    }

    /**
     * Sauve a Billet
     */
    @Override
    public BilletDto saveBillet(BilletDto tBilletDto) {
        // Converts the dto to the T_Billet entity
        Billet tBillet = BilletMapper.toEntity(tBilletDto);
        // Save the T_Billet entity
        tBillet = tBilletRepository.save(tBillet);
        //return the new Dto
        return BilletMapper.toDto(tBillet);

    }

    /**
     * Get a Billet by it's id
     */
    @Override
    public BilletDto getBilletById(Integer BilletId) {
        Billet tBillet = tBilletRepository.findById(Long.valueOf(BilletId)).orElseThrow(() -> new EntityNotFoundException("T_Billet not found"));
        //return the new Dto
        return BilletMapper.toDto(tBillet);
    }

    /**
     * Delete a Billet by it's id
     */
    @Override
    public boolean deleteBillet(Integer BilletId) {
        tBilletRepository.deleteById(Long.valueOf(BilletId));
        return true;
    }

    /**
     * Get all the Billets
     */
    @Override
    public List<BilletDto> getAllBillets() {
        List<BilletDto> tBilletDtos = new ArrayList<>();
        List<Billet> tBillets = tBilletRepository.findAll();
        tBillets.forEach(T_Billet -> {
            tBilletDtos.add(BilletMapper.toDto(T_Billet));
        });
        return tBilletDtos;
    }

    /*
    private T_BilletDto toDo(T_Billet Billet) {
        T_BilletDto tBilletDto = new T_BilletDto();
        tBilletDto.setCon_id(Billet.getCon_id());
        tBilletDto.setNom(Billet.getNom());
        tBilletDto.setDate(Billet.getDate());
        tBilletDto.setHeure(Billet.getHeure());
        tBilletDto.setDuree(Billet.getDuree());
        tBilletDto.setGroupeId(Billet.getGroupe());
        tBilletDto.setSoireeId(Billet.getSoiree());
        return tBilletDto;

    }


    private T_Billet toEntity(T_BilletDto BilletDto) {
        T_Billet tBillet = new T_Billet();
        tBillet.setCon_id(BilletDto.getCon_id());
        tBillet.setNom(BilletDto.getNom());
        tBillet.setDate(BilletDto.getDate());
        tBillet.setHeure(BilletDto.getHeure());
        tBillet.setDuree(BilletDto.getDuree());
        tBillet.setGroupe(BilletDto.getGroupeId());
        tBillet.setSoiree(BilletDto.getSoireeId());
        return tBillet;
    }

     */
}
