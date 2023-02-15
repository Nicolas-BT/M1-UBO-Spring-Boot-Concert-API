package fr.Mapper;

import fr.dtos.T_CONCERTDto;
import fr.entities.T_CONCERT;
import org.springframework.web.bind.annotation.Mapping;


public interface T_CONCERTMapper {
    T_CONCERTDto toDo(T_CONCERT concert);
    T_CONCERT toEntity(T_CONCERTDto concertDto);
}
