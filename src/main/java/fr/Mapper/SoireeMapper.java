package fr.Mapper;

import fr.dtos.SoireeDto;
import fr.entities.Soiree;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
        componentModel = "spring"
)
public interface SoireeMapper {
    @Mapping(source = "soi_id", target = "soi_id")
    @Mapping(source = "salleconcert", target = "salleconcert")
    SoireeDto toDo(Soiree soiree);
    @Mapping(source = "soi_id", target = "soi_id")
    @Mapping(source = "salleconcert", target = "salleconcert")
    Soiree toEntity(SoireeDto soireeDto);
}
