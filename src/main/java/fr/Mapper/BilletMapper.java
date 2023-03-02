package fr.Mapper;

import fr.dtos.BilletDto;
import fr.entities.Billet;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
        componentModel = "spring"
)
public interface BilletMapper {
    @Mapping(source = "id",target = "id")
    BilletDto toDto(Billet Billet);
    @Mapping(source = "id",target = "id")
    Billet toEntity(BilletDto BilletDto);
}
