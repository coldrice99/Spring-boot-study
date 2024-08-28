package com.example.firstproject.repository;

import com.example.firstproject.entity.Article;
import org.springframework.data.repository.CrudRepository;

//JPA에서 제공하는 리파토리 인터페이스를 활용해서 쉽게 만들자.
public interface ArticleRepository extends CrudRepository<Article, Long> {
}
