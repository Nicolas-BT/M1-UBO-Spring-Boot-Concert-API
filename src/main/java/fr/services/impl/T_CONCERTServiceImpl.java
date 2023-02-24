package fr.services.impl;

import fr.Mapper.T_CONCERTMapper;
import fr.dtos.T_CONCERTDto;
import fr.entities.T_CONCERT;
import fr.repositories.T_CONCERTRepository;
import fr.services.T_CONCERTService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service("T_CONCERTService")
public class T_CONCERTServiceImpl implements T_CONCERTService {

    private final T_CONCERTRepository tConcertRepository;

    private  final T_CONCERTMapper tConcertMapper;




    public T_CONCERTServiceImpl(T_CONCERTRepository tConcertRepository, T_CONCERTMapper tConcertMapper) {
        this.tConcertRepository = tConcertRepository;

        this.tConcertMapper = tConcertMapper;
    }

    /**
     * Sauve a concert
     */
    @Override
    public T_CONCERTDto saveConcert(T_CONCERTDto tConcertDto) {
        // Converts the dto to the T_CONCERT entity
        T_CONCERT tConcert = tConcertMapper.toEntity(tConcertDto);
        // Save the T_CONCERT entity
        tConcert = tConcertRepository.save(tConcert);
        //return the new Dto
        return tConcertMapper.toDo(tConcert);

    }

    /**
     * Get a concert by it's id
     */
    @Override
    public T_CONCERTDto getConcertById(Integer ConcertId) {
        T_CONCERT tConcert = tConcertRepository.findById(ConcertId).orElseThrow(() -> new EntityNotFoundException("T_CONCERT not found"));
        //return the new Dto
        return tConcertMapper.toDo(tConcert);
    }

    /**
     * Delete a concert by it's id
     */
    @Override
    public boolean deleteConcert(Integer ConcertId) {
        tConcertRepository.deleteById(ConcertId);
        return true;
    }

    /**
     * Get all the concerts
     */
    @Override
    public List<T_CONCERTDto> getAllConcerts() {
        List<T_CONCERTDto> tConcertDtos = new ArrayList<>();
        List<T_CONCERT> tConcerts = tConcertRepository.findAll();
        tConcerts.forEach(T_CONCERT -> {
            tConcertDtos.add(tConcertMapper.toDo(T_CONCERT));
        });
        return tConcertDtos;
    }

    /*
    private T_CONCERTDto toDo(T_CONCERT concert) {
        T_CONCERTDto tConcertDto = new T_CONCERTDto();
        tConcertDto.setCon_id(concert.getCon_id());
        tConcertDto.setNom(concert.getNom());
        tConcertDto.setDate(concert.getDate());
        tConcertDto.setHeure(concert.getHeure());
        tConcertDto.setDuree(concert.getDuree());
        tConcertDto.setGroupeId(concert.getGroupe());
        tConcertDto.setSoireeId(concert.getSoiree());
        return tConcertDto;

    }


    private T_CONCERT toEntity(T_CONCERTDto concertDto) {
        T_CONCERT tConcert = new T_CONCERT();
        tConcert.setCon_id(concertDto.getCon_id());
        tConcert.setNom(concertDto.getNom());
        tConcert.setDate(concertDto.getDate());
        tConcert.setHeure(concertDto.getHeure());
        tConcert.setDuree(concertDto.getDuree());
        tConcert.setGroupe(concertDto.getGroupeId());
        tConcert.setSoiree(concertDto.getSoireeId());
        return tConcert;
    }

     */
}