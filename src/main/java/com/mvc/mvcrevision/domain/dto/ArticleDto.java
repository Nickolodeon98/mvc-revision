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
    private String author;

    public Article toEntity() {
        return new Article(this.id, this.title, this.contents, this.author);
    }
}
