package com.fastcode.dvdrental.domain.core.inventory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;
import java.util.*;
import java.time.*;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@Repository("inventoryRepository")
public interface IInventoryRepository extends JpaRepository<InventoryEntity, Integer>,QuerydslPredicateExecutor<InventoryEntity> {

}

