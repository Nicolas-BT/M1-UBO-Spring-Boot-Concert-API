package fr.services.impl;

import fr.Mapper.GroupeMapper;

import fr.dtos.GroupeDto;
import fr.entities.Groupe;
import fr.repositories.GroupeRepository;
import fr.services.GroupeService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;


@Service("T_GROUPEService")
public class GroupeServiceImpl implements GroupeService {

    private final GroupeRepository tGroupeRepository;
    private  final GroupeMapper tGroupeMapper;

    public GroupeServiceImpl(GroupeRepository tGroupeRepository, GroupeMapper tGroupeMapper) {
        this.tGroupeRepository = tGroupeRepository;
        this.tGroupeMapper = tGroupeMapper;
    }


    @Override
    public GroupeDto savegroupe(GroupeDto tGroupeDto) {
        // Converts the dto to the T_GROUPE entity
        Groupe tGroupe = tGroupeMapper.toEntity((tGroupeDto));
        // Save the T_GROUPE entity
        tGroupe = tGroupeRepository.save(tGroupe);
        //return the new Dto
        return tGroupeMapper.toDo(tGroupe);
    }

    @Override
    public GroupeDto getGroupeById(Integer GroupeId) {
        Groupe tGroupe = tGroupeRepository.findById(GroupeId).orElseThrow(() -> new EntityNotFoundException("T_GROUPE not found"));
        //return the new Dto
        return tGroupeMapper.toDo(tGroupe);
    }

    @Override
    public boolean deleteGroupe(Integer GroupeId) {
        tGroupeRepository.deleteById(GroupeId);
        return true;
    }

    @Override
    public List<GroupeDto> getAllGroupes() {
        List<GroupeDto> tGroupeDtos = new ArrayList<>();
        List<Groupe> tGroupes = tGroupeRepository.findAll();
        tGroupes.forEach(T_GROUPE -> {
            tGroupeDtos.add(tGroupeMapper.toDo(T_GROUPE));
        });
        return tGroupeDtos;
    }

    /*
    private T_GROUPEDto toDo(T_GROUPE groupe){
        T_GROUPEDto tGroupeDto = new T_GROUPEDto();
        tGroupeDto.setGrp_id(groupe.getGrp_id());
        tGroupeDto.setGrp_nom(groupe.getGrp_nom());
        tGroupeDto.setPrenom(groupe.getPrenom());
        tGroupeDto.setPseudo(groupe.getPseudo());
        tGroupeDto.setAge(groupe.getAge());
        tGroupeDto.setVille(groupe.getVille());
        tGroupeDto.setNb(groupe.getNb());
        return tGroupeDto;
    }


    private  T_GROUPE toEntity(T_GROUPEDto groupeDto){
        T_GROUPE tGroupe = new T_GROUPE();
        tGroupe.setGrp_id(groupeDto.getGrp_id());
        tGroupe.setGrp_nom(groupeDto.getGrp_nom());
        tGroupe.setPrenom(groupeDto.getPrenom());
        tGroupe.setPseudo(groupeDto.getPseudo());
        tGroupe.setAge(groupeDto.getAge());
        tGroupe.setVille(groupeDto.getVille());
        tGroupe.setNb(groupeDto.getNb());
        return tGroupe;

    }
     */

}
