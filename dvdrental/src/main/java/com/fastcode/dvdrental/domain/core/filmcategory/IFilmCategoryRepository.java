package com.fastcode.dvdrental.domain.core.filmcategory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;
import java.util.*;
import java.time.*;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@Repository("filmCategoryRepository")
public interface IFilmCategoryRepository extends JpaRepository<FilmCategoryEntity, FilmCategoryId>,QuerydslPredicateExecutor<FilmCategoryEntity> {

}

