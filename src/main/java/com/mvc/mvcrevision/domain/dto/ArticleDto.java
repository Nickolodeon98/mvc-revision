package com.mvc.mvcrevision.domain.dto;

import com.mvc.mvcrevision.domain.entity.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class ArticleDto {
    private Long id;
    private String title;
    private String contents;

    public Article toEntity() {
        return new Article(this.title, this.contents);
    }
}
