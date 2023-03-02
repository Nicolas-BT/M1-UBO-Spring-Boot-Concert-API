package fr.controllers;

import fr.dtos.ArticleDto;
import fr.services.impl.ArticleServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Articles")
public class ArticleController {

    private final ArticleServiceImpl tArticleService;

    public ArticleController(ArticleServiceImpl tArticleService) {
        this.tArticleService = tArticleService;
    }

    /**
     * <p>Get all t_Article in the system</p>
     * @return List<T_ArticleDto>
     */
    @GetMapping
    public List<ArticleDto> getArticles() {
        return tArticleService.getAllArticles();
    }

    /**
     * Method to get the t_Article based on the ID
     */
    @GetMapping("/{id}")
    public ArticleDto getArticle(@PathVariable String id){
        return tArticleService.getArticleById(id) ;
    }

    /**
     * Create a new t_Article in the system
     */
    @PostMapping
    public ArticleDto saveArticle(final @RequestBody ArticleDto tArticleDto){
        return tArticleService.saveArticle(tArticleDto);
    }

    /**
     * Delete a t_Article by it's id
     */
    @DeleteMapping("/{id}")
    public Boolean deleteArticle(@PathVariable String id){
        return tArticleService.deleteArticle(id);
    }
}
