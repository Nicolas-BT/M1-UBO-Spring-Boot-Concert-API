package fr.services.impl;

import fr.Mapper.ArticleMapper;
import fr.dtos.ArticleDto;
import fr.entities.Article;
import fr.repositories.ArticleRepository;
import fr.services.ArticleService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service("T_ArticleService")
public class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository tArticleRepository;

    private final fr.Mapper.ArticleMapper ArticleMapper;


    public ArticleServiceImpl(ArticleRepository tArticleRepository, ArticleMapper ArticleMapper) {
        this.tArticleRepository = tArticleRepository;

        this.ArticleMapper = ArticleMapper;
    }

    /**
     * Sauve a Article
     */
    @Override
    public ArticleDto saveArticle(ArticleDto tArticleDto) {
        // Converts the dto to the T_Article entity
        Article tArticle = ArticleMapper.toEntity(tArticleDto);
        // Save the T_Article entity
        tArticle = tArticleRepository.save(tArticle);
        //return the new Dto
        return ArticleMapper.toDto(tArticle);

    }

    /**
     * Get a Article by it's id
     */
    @Override
    public ArticleDto getArticleById(String ArticleId) {
        Article tArticle = tArticleRepository.findById(ArticleId).orElseThrow(() -> new EntityNotFoundException("T_Article not found"));
        //return the new Dto
        return ArticleMapper.toDto(tArticle);
    }

    /**
     * Delete a Article by it's id
     */
    @Override
    public boolean deleteArticle(String ArticleId) {
        tArticleRepository.deleteById(ArticleId);
        return true;
    }

    /**
     * Get all the Articles
     */
    @Override
    public List<ArticleDto> getAllArticles() {
        List<ArticleDto> tArticleDtos = new ArrayList<>();
        List<Article> tArticles = tArticleRepository.findAll();
        tArticles.forEach(T_Article -> {
            tArticleDtos.add(ArticleMapper.toDto(T_Article));
        });
        return tArticleDtos;
    }

    /*
    private T_ArticleDto toDo(T_Article Article) {
        T_ArticleDto tArticleDto = new T_ArticleDto();
        tArticleDto.setCon_id(Article.getCon_id());
        tArticleDto.setNom(Article.getNom());
        tArticleDto.setDate(Article.getDate());
        tArticleDto.setHeure(Article.getHeure());
        tArticleDto.setDuree(Article.getDuree());
        tArticleDto.setGroupeId(Article.getGroupe());
        tArticleDto.setSoireeId(Article.getSoiree());
        return tArticleDto;

    }


    private T_Article toEntity(T_ArticleDto ArticleDto) {
        T_Article tArticle = new T_Article();
        tArticle.setCon_id(ArticleDto.getCon_id());
        tArticle.setNom(ArticleDto.getNom());
        tArticle.setDate(ArticleDto.getDate());
        tArticle.setHeure(ArticleDto.getHeure());
        tArticle.setDuree(ArticleDto.getDuree());
        tArticle.setGroupe(ArticleDto.getGroupeId());
        tArticle.setSoiree(ArticleDto.getSoireeId());
        return tArticle;
    }
     */
}