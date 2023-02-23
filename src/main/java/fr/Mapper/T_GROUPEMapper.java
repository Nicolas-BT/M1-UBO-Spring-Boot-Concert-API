package fr.Mapper;

import fr.dtos.T_CONCERTDto;
import fr.dtos.T_GROUPEDto;
import fr.entities.T_GROUPE;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface T_GROUPEMapper {

    T_GROUPEDto toDo (T_GROUPE groupe);
    T_GROUPE toEntity (T_GROUPEDto groupeDto);
}
