package com.fastcode.dvdrental.domain.core.rental;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;
import java.util.*;
import java.time.*;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@Repository("rentalRepository")
public interface IRentalRepository extends JpaRepository<RentalEntity, Integer>,QuerydslPredicateExecutor<RentalEntity> {

}

