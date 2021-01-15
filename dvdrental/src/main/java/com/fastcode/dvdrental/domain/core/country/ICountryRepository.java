package com.fastcode.dvdrental.domain.core.country;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;
import java.util.*;
import java.time.*;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@Repository("countryRepository")
public interface ICountryRepository extends JpaRepository<CountryEntity, Integer>,QuerydslPredicateExecutor<CountryEntity> {

}

