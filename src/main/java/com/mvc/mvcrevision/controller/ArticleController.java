package com.mvc.mvcrevision.controller;

import com.mvc.mvcrevision.domain.dto.ArticleDto;
import com.mvc.mvcrevision.domain.entity.Article;
import com.mvc.mvcrevision.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/articles")
@Slf4j
public class ArticleController {

    private final ArticleRepository articleRepository;

    public ArticleController(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @GetMapping("/new")
    public String createPage() {
        return "articles/new";
    }

    @PostMapping("")
    public String articles(ArticleDto articleDto) {
        log.info(articleDto.toString());
        Article savedArticle = articleRepository.save(articleDto.toEntity());
        log.info("GeneratedValue:{}", savedArticle.getId());
        return "";
    }
}
