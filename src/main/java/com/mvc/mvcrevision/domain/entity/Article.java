package com.mvc.mvcrevision.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Getter
@Entity
@NoArgsConstructor
@Table(name = "article_fourth")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String contents;
    private String author;

    public Article(String title, String contents, String author) {
        this.title = title;
        this.contents = contents;
        this.author = author;
    }
}
