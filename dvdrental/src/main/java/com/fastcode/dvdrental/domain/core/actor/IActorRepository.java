package com.fastcode.dvdrental.domain.core.actor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;
import java.util.*;
import java.time.*;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@Repository("actorRepository")
public interface IActorRepository extends JpaRepository<ActorEntity, Integer>,QuerydslPredicateExecutor<ActorEntity> {

}

