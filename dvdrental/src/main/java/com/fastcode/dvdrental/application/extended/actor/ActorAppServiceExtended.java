package com.fastcode.dvdrental.application.extended.actor;

import org.springframework.stereotype.Service;
import com.fastcode.dvdrental.application.core.actor.ActorAppService;

import com.fastcode.dvdrental.domain.extended.actor.IActorRepositoryExtended;
import com.fastcode.dvdrental.commons.logging.LoggingHelper;

@Service("actorAppServiceExtended")
public class ActorAppServiceExtended extends ActorAppService implements IActorAppServiceExtended {

	public ActorAppServiceExtended(IActorRepositoryExtended actorRepositoryExtended,
				IActorMapperExtended mapper,LoggingHelper logHelper) {

		super(actorRepositoryExtended,
		mapper,logHelper);

	}

 	//Add your custom code here
 
}

