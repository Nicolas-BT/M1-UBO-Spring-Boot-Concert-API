package fr.Mapper;

import fr.dtos.T_SALLECONCERTDto;
import fr.entities.T_SALLECONCERT;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
        componentModel = "spring"
)
public interface T_SALLECONCERTMapper {

    @Mapping(source = "sac_id",target = "sac_id")
    T_SALLECONCERTDto toDo (T_SALLECONCERT salleconcert);
    @Mapping(source = "sac_id",target = "sac_id")
    T_SALLECONCERT toEntity(T_SALLECONCERTDto salleconcertDto);
}
