package fr.Mapper.impl;

import fr.dtos.T_CONCERTDto;
import fr.dtos.T_GROUPEDto;
import fr.entities.T_GROUPE;

public class T_GROUPEMapperImpl {
     private T_GROUPEDto toDo(T_GROUPE groupe){
        T_GROUPEDto tGroupeDto = new T_GROUPEDto();
        tGroupeDto.setId(groupe.getId());
        tGroupeDto.setNom(groupe.getNom());
        tGroupeDto.setPrenom(groupe.getPrenom());
        tGroupeDto.setPseudo(groupe.getPseudo());
        tGroupeDto.setAge(groupe.getAge());
        tGroupeDto.setVille(groupe.getVille());
        return tGroupeDto;
     }

    private T_GROUPE toEntity(T_GROUPEDto groupeDto){
         T_GROUPE tGroupe = new T_GROUPE();
        tGroupe.setId(groupeDto.getId());
        tGroupe.setNom(groupeDto.getNom());
        tGroupe.setPrenom(groupeDto.getPrenom());
        tGroupe.setPseudo(groupeDto.getPseudo());
        tGroupe.setAge(groupeDto.getAge());
        tGroupe.setVille(groupeDto.getVille());
         return tGroupe;

    }

}
