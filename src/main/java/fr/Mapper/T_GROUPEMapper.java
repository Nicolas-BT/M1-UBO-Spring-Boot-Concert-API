package fr.Mapper;

import fr.dtos.T_CONCERTDto;
import fr.dtos.T_GROUPEDto;
import fr.entities.T_GROUPE;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Mapper(
        componentModel = "spring"
)
public interface T_GROUPEMapper {
    @Mapping(source = "grp_id",target = "grp_id")
    T_GROUPEDto toDo (T_GROUPE groupe);
    T_GROUPE toEntity (T_GROUPEDto groupeDto);
}
