package com.mvc.mvcrevision.domain.dto;

import com.mvc.mvcrevision.domain.entity.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ArticleDto {
//    private int id;
    private String title;
    private String contents;

    public Article toEntity() {
        return new Article(this.title, this.contents);
    }
}
