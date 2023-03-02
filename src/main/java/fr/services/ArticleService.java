package fr.services;

import fr.dtos.ArticleDto;

import java.util.List;

public interface ArticleService {

    /**
     * Sauve a Article
     */
    ArticleDto saveArticle (ArticleDto tArticleDto);

    /**
     * Get a Article by its id
     */

    ArticleDto getArticleById(String ArticleId);

    /**
     * Delete a Article by its id
     */


    boolean deleteArticle(String ArticleId);

    /**
     * Get all the Articles
     */
    List<ArticleDto> getAllArticles();
}

