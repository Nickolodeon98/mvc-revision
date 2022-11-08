package com.mvc.mvcrevision.repository;

import com.mvc.mvcrevision.domain.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
