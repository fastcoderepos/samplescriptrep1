package com.fastcode.dvdrental.application.extended.filmactor;

import org.springframework.stereotype.Service;
import com.fastcode.dvdrental.application.core.filmactor.FilmActorAppService;

import com.fastcode.dvdrental.domain.extended.filmactor.IFilmActorRepositoryExtended;
import com.fastcode.dvdrental.domain.extended.actor.IActorRepositoryExtended;
import com.fastcode.dvdrental.domain.extended.film.IFilmRepositoryExtended;
import com.fastcode.dvdrental.commons.logging.LoggingHelper;

@Service("filmActorAppServiceExtended")
public class FilmActorAppServiceExtended extends FilmActorAppService implements IFilmActorAppServiceExtended {

	public FilmActorAppServiceExtended(IFilmActorRepositoryExtended filmActorRepositoryExtended,
				IActorRepositoryExtended actorRepositoryExtended,IFilmRepositoryExtended filmRepositoryExtended,IFilmActorMapperExtended mapper,LoggingHelper logHelper) {

		super(filmActorRepositoryExtended,
		actorRepositoryExtended,filmRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

