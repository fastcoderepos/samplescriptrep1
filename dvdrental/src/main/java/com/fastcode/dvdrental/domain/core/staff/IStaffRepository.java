package com.fastcode.dvdrental.domain.core.staff;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;
import java.util.*;
import java.time.*;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@Repository("staffRepository")
public interface IStaffRepository extends JpaRepository<StaffEntity, Integer>,QuerydslPredicateExecutor<StaffEntity> {

}

