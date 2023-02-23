package fr.services.impl;

import fr.Mapper.T_SOIREEMapper;
import fr.dtos.T_SOIREEDto;
import fr.entities.T_CONCERT;
import fr.entities.T_SOIREE;
import fr.repositories.T_SOIREERepository;
import fr.services.T_SOIREEService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@Service("T_SOIREEService")
public class T_SOIREEServiceImpl implements T_SOIREEService {

    private final T_SOIREERepository tSoireeRepository;
    private  final T_SOIREEMapper tSoireeMapper;

    public T_SOIREEServiceImpl(T_SOIREERepository tSoireeRepository, T_SOIREEMapper tSoireeMapper) {
        this.tSoireeRepository = tSoireeRepository;
        this.tSoireeMapper = tSoireeMapper;
    }

    @Override
    public T_SOIREEDto saveSoiree(T_SOIREEDto tSoireeDto) {
        // Converts the dto to the T_SOIREE entity
        T_SOIREE tSoiree = tSoireeMapper.toEntity((tSoireeDto));
        // Save the T_SOIREE entity
        tSoiree = tSoireeRepository.save(tSoiree);
        //return the new Dto
        return tSoireeMapper.toDo(tSoiree);
    }

    @Override
    public T_SOIREEDto getSoireeById(Integer SoireeId) {
        T_SOIREE tSoiree = tSoireeRepository.findById(SoireeId).orElseThrow(() -> new EntityNotFoundException("T_SOIREE not found"));
        //return the new Dto
        return tSoireeMapper.toDo(tSoiree);
    }

    @Override
    public boolean deletesoiree(Integer SoireeId) {
        tSoireeRepository.deleteById(SoireeId);
        return true;
    }

    @Override
    public List<T_SOIREEDto> getAllSoirees() {
        List<T_SOIREE> tSoirees = tSoireeRepository.findAll();
        return tSoirees.stream().map(tSoireeMapper::toDo).collect(Collectors.toList());
    }
}
