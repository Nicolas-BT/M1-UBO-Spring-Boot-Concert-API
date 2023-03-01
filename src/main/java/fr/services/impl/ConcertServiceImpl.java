package fr.services.impl;

import fr.Mapper.ConcertMapper;
import fr.dtos.ConcertDto;
import fr.entities.Concert;
import fr.repositories.ConcertRepository;
import fr.services.ConcertService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service("T_CONCERTService")
public class ConcertServiceImpl implements ConcertService {

    private final ConcertRepository tConcertRepository;

    private  final ConcertMapper ConcertMapper;




    public ConcertServiceImpl(ConcertRepository tConcertRepository, ConcertMapper ConcertMapper) {
        this.tConcertRepository = tConcertRepository;

        this.ConcertMapper = ConcertMapper;
    }

    /**
     * Sauve a concert
     */
    @Override
    public ConcertDto saveConcert(ConcertDto tConcertDto) {
        // Converts the dto to the T_CONCERT entity
        Concert tConcert = ConcertMapper.ConcertDtoToEntity(tConcertDto);
        // Save the T_CONCERT entity
        tConcert = tConcertRepository.save(tConcert);
        //return the new Dto
        return ConcertMapper.ConcertEntityToDto(tConcert);

    }

    /**
     * Get a concert by it's id
     */
    @Override
    public ConcertDto getConcertById(Integer ConcertId) {
        Concert tConcert = tConcertRepository.findById(ConcertId).orElseThrow(() -> new EntityNotFoundException("T_CONCERT not found"));
        //return the new Dto
        return ConcertMapper.ConcertEntityToDto(tConcert);
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
    public List<ConcertDto> getAllConcerts() {
        List<ConcertDto> tConcertDtos = new ArrayList<>();
        List<Concert> tConcerts = tConcertRepository.findAll();
        tConcerts.forEach(T_CONCERT -> {
            tConcertDtos.add(ConcertMapper.ConcertEntityToDto(T_CONCERT));
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