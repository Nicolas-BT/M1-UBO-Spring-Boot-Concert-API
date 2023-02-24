package fr.Mapper;

import fr.dtos.T_CONCERTDto;
import fr.entities.T_CONCERT;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(
        componentModel = "spring"
)
public interface T_CONCERTMapper {
    @Mapping(source = "con_id", target = "con_id")
    @Mapping(source = "groupe", target = "groupe")
    @Mapping(source = "soiree", target = "soiree")

    T_CONCERTDto toDo(T_CONCERT concert);
    @Mapping(source = "con_id", target = "con_id")
    @Mapping(source = "groupe", target = "groupe")
    @Mapping(source = "soiree", target = "soiree")
    T_CONCERT toEntity(T_CONCERTDto concertDto);
}
