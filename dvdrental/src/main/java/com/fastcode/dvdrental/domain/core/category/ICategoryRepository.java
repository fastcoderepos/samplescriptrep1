package com.fastcode.dvdrental.domain.core.category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;
import java.util.*;
import java.time.*;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@Repository("categoryRepository")
public interface ICategoryRepository extends JpaRepository<CategoryEntity, Integer>,QuerydslPredicateExecutor<CategoryEntity> {

}

