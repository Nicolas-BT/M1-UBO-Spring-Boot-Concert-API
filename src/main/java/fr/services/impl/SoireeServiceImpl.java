package fr.services.impl;

import fr.Mapper.SoireeMapper;
import fr.dtos.SoireeDto;
import fr.entities.Soiree;
import fr.repositories.SoireeRepository;
import fr.services.SoireeService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@Service("T_SOIREEService")
public class SoireeServiceImpl implements SoireeService {

    private final SoireeRepository tSoireeRepository;
    private  final SoireeMapper tSoireeMapper;

    public SoireeServiceImpl(SoireeRepository tSoireeRepository, SoireeMapper tSoireeMapper) {
        this.tSoireeRepository = tSoireeRepository;
        this.tSoireeMapper = tSoireeMapper;
    }

    @Override
    public SoireeDto saveSoiree(SoireeDto tSoireeDto) {
        // Converts the dto to the T_SOIREE entity
        Soiree tSoiree = tSoireeMapper.toEntity((tSoireeDto));
        // Save the T_SOIREE entity
        tSoiree = tSoireeRepository.save(tSoiree);
        //return the new Dto
        return tSoireeMapper.toDo(tSoiree);
    }

    @Override
    public SoireeDto getSoireeById(Integer SoireeId) {
        Soiree tSoiree = tSoireeRepository.findById(SoireeId).orElseThrow(() -> new EntityNotFoundException("T_SOIREE not found"));
        //return the new Dto
        return tSoireeMapper.toDo(tSoiree);
    }

    @Override
    public boolean deletesoiree(Integer SoireeId) {
        tSoireeRepository.deleteById(SoireeId);
        return true;
    }

    @Override
    public List<SoireeDto> getAllSoirees() {
        List<Soiree> tSoirees = tSoireeRepository.findAll();
        return tSoirees.stream().map(tSoireeMapper::toDo).collect(Collectors.toList());
    }
}
