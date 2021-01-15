package com.fastcode.dvdrental.domain.extended.film;

import org.springframework.stereotype.Repository;
import com.fastcode.dvdrental.domain.core.film.IFilmRepository;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@Repository("filmRepositoryExtended")
public interface IFilmRepositoryExtended extends IFilmRepository {

	//Add your custom code here
}

