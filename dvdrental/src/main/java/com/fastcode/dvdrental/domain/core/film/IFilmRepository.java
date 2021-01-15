package com.fastcode.dvdrental.domain.core.film;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;
import java.util.*;
import java.time.*;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@Repository("filmRepository")
public interface IFilmRepository extends JpaRepository<FilmEntity, Integer>,QuerydslPredicateExecutor<FilmEntity> {

}

