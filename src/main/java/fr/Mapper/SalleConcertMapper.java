package fr.Mapper;

import fr.dtos.SalleConcertDto;
import fr.entities.SalleConcert;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
        componentModel = "spring"
)
public interface SalleConcertMapper {

    @Mapping(source = "sac_id",target = "sac_id")
    SalleConcertDto toDo (SalleConcert salleconcert);
    @Mapping(source = "sac_id",target = "sac_id")
    SalleConcert toEntity(SalleConcertDto salleconcertDto);
}
