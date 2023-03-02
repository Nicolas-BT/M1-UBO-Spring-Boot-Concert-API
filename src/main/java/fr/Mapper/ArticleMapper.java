package fr.Mapper;

import fr.dtos.ArticleDto;
import fr.entities.Article;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
        componentModel = "spring"
)
public interface ArticleMapper {
        @Mapping(source = "id",target = "id")
        ArticleDto toDto(Article Article);
        @Mapping(source = "id",target = "id")
        Article toEntity(ArticleDto ArticleDto);

    }

