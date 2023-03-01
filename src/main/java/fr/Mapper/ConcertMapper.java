package fr.Mapper;

import fr.dtos.ConcertDto;
import fr.entities.Concert;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(
        componentModel = "spring"
)
public interface ConcertMapper {
    @Mapping(source = "conId", target = "conId")
    @Mapping(source = "groupe", target = "groupe")
    @Mapping(source = "soiree", target = "soiree")
    ConcertDto ConcertEntityToDto(Concert concert);
    @Mapping(source = "conId", target = "conId")
    @Mapping(source = "groupe", target = "groupe")
    @Mapping(source = "soiree", target = "soiree")
    Concert ConcertDtoToEntity(ConcertDto concertDto);
}
