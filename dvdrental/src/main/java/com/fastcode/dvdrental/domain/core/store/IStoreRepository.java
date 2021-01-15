package com.fastcode.dvdrental.domain.core.store;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;
import java.util.*;
import java.time.*;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@Repository("storeRepository")
public interface IStoreRepository extends JpaRepository<StoreEntity, Integer>,QuerydslPredicateExecutor<StoreEntity> {

}

