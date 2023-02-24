package fr.Mapper;

import fr.dtos.T_SOIREEDto;
import fr.entities.T_SOIREE;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
        componentModel = "spring"
)
public interface T_SOIREEMapper {
    @Mapping(source = "soi_id", target = "soi_id")
    @Mapping(source = "salleconcert", target = "salleconcert")
    T_SOIREEDto toDo(T_SOIREE soiree);
    @Mapping(source = "soi_id", target = "soi_id")
    @Mapping(source = "salleconcert", target = "salleconcert")
    T_SOIREE toEntity(T_SOIREEDto soireeDto);
}
