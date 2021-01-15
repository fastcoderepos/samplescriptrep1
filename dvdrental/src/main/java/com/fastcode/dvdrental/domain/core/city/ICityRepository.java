package com.fastcode.dvdrental.domain.core.city;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;
import java.util.*;
import java.time.*;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@Repository("cityRepository")
public interface ICityRepository extends JpaRepository<CityEntity, Integer>,QuerydslPredicateExecutor<CityEntity> {

}

