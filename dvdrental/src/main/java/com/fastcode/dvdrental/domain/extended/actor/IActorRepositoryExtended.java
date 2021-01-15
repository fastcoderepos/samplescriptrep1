package com.fastcode.dvdrental.domain.extended.actor;

import org.springframework.stereotype.Repository;
import com.fastcode.dvdrental.domain.core.actor.IActorRepository;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@Repository("actorRepositoryExtended")
public interface IActorRepositoryExtended extends IActorRepository {

	//Add your custom code here
}

