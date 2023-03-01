package fr.Mapper;

import fr.dtos.GroupeDto;
import fr.entities.Groupe;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
        componentModel = "spring"
)
public interface GroupeMapper {
    @Mapping(source = "grpid",target = "grpid")
    GroupeDto toDo (Groupe groupe);
    @Mapping(source = "grpid",target = "grpid")
    Groupe toEntity (GroupeDto groupeDto);
}
