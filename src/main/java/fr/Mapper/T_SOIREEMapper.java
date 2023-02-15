package fr.Mapper;

import fr.dtos.T_SOIREEDto;
import fr.entities.T_SOIREE;

public interface T_SOIREEMapper {
    T_SOIREEDto toDo(T_SOIREE soiree);
    T_SOIREE toEntity(T_SOIREEDto soireeDto);
}
