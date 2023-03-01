package fr.services.impl;


import fr.Mapper.SalleConcertMapper;
import fr.dtos.SalleConcertDto;
import fr.entities.SalleConcert;
import fr.repositories.SalleConcertRepository;
import fr.services.SalleConcertService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@Service("T_SALLECONCERTService")
public class SalleConcertServiceImpl implements SalleConcertService {

    private final SalleConcertRepository tSalleconcertRepository;
    private  final SalleConcertMapper tSalleconcertMapper;

    public SalleConcertServiceImpl(SalleConcertRepository tSalleconcertRepository, SalleConcertMapper tSalleconcertMapper) {
        this.tSalleconcertRepository = tSalleconcertRepository;
        this.tSalleconcertMapper = tSalleconcertMapper;
    }

    @Override
    public SalleConcertDto saveSalleConcert(SalleConcertDto tSalleconcertDto) {
        // Converts the dto to the T_SALLECONCERT entity
        SalleConcert tSalleconcert = tSalleconcertMapper.toEntity(tSalleconcertDto);
        // Save the T_SALLECONCERT entity
        tSalleconcert = tSalleconcertRepository.save(tSalleconcert);
        //return the new Dto
        return  tSalleconcertMapper.toDo(tSalleconcert);
    }

    @Override
    public SalleConcertDto getSalleConcertById(Integer SalleConcertId) {
        SalleConcert tSalleconcert = tSalleconcertRepository.findById(SalleConcertId).orElseThrow(() -> new EntityNotFoundException("T_SALLECONCERT not found"));
        //return the new Dto
        return  tSalleconcertMapper.toDo(tSalleconcert);
    }

    @Override
    public boolean deleteSalleConcert(Integer SalleConcertId) {
        tSalleconcertRepository.deleteById(SalleConcertId);
        return true;
    }

    @Override
    public List<SalleConcertDto> getAllSalleConcerts() {
        List<SalleConcert> tSalleconcerts = tSalleconcertRepository.findAll();
        return tSalleconcerts.stream().map(tSalleconcertMapper::toDo).collect(Collectors.toList());
    }
}
