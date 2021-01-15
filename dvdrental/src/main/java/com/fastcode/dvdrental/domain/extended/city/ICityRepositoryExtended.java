package com.fastcode.dvdrental.domain.extended.city;

import org.springframework.stereotype.Repository;
import com.fastcode.dvdrental.domain.core.city.ICityRepository;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@Repository("cityRepositoryExtended")
public interface ICityRepositoryExtended extends ICityRepository {

	//Add your custom code here
}

