package com.fastcode.dvdrental.domain.extended.filmactor;

import org.springframework.stereotype.Repository;
import com.fastcode.dvdrental.domain.core.filmactor.IFilmActorRepository;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@Repository("filmActorRepositoryExtended")
public interface IFilmActorRepositoryExtended extends IFilmActorRepository {

	//Add your custom code here
}

