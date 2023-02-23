package fr.services.impl;


import fr.Mapper.T_SALLECONCERTMapper;
import fr.dtos.T_SALLECONCERTDto;
import fr.entities.T_GROUPE;
import fr.entities.T_SALLECONCERT;
import fr.repositories.T_SALLECONCERTRepository;
import fr.services.T_SALLECONCERTService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@Service("T_SALLECONCERTService")
public class T_SALLECONCERTServiceImpl  implements T_SALLECONCERTService {

    private final T_SALLECONCERTRepository tSalleconcertRepository;
    private  final T_SALLECONCERTMapper tSalleconcertMapper;

    public T_SALLECONCERTServiceImpl(T_SALLECONCERTRepository tSalleconcertRepository, T_SALLECONCERTMapper tSalleconcertMapper) {
        this.tSalleconcertRepository = tSalleconcertRepository;
        this.tSalleconcertMapper = tSalleconcertMapper;
    }

    @Override
    public T_SALLECONCERTDto saveSalleConcert(T_SALLECONCERTDto tSalleconcertDto) {
        // Converts the dto to the T_SALLECONCERT entity
        T_SALLECONCERT tSalleconcert = tSalleconcertMapper.toEntity(tSalleconcertDto);
        // Save the T_SALLECONCERT entity
        tSalleconcert = tSalleconcertRepository.save(tSalleconcert);
        //return the new Dto
        return  tSalleconcertMapper.toDo(tSalleconcert);
    }

    @Override
    public T_SALLECONCERTDto getSalleConcertById(Integer SalleConcertId) {
        T_SALLECONCERT tSalleconcert = tSalleconcertRepository.findById(SalleConcertId).orElseThrow(() -> new EntityNotFoundException("T_SALLECONCERT not found"));
        //return the new Dto
        return  tSalleconcertMapper.toDo(tSalleconcert);
    }

    @Override
    public boolean deleteSalleConcert(Integer SalleConcertId) {
        tSalleconcertRepository.deleteById(SalleConcertId);
        return true;
    }

    @Override
    public List<T_SALLECONCERTDto> getAllSalleConcerts() {
        List<T_SALLECONCERT> tSalleconcerts = tSalleconcertRepository.findAll();
        return tSalleconcerts.stream().map(tSalleconcertMapper::toDo).collect(Collectors.toList());
    }
}
