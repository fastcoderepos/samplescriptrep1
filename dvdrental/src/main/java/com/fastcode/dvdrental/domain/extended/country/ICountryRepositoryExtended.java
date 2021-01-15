package com.fastcode.dvdrental.domain.extended.country;

import org.springframework.stereotype.Repository;
import com.fastcode.dvdrental.domain.core.country.ICountryRepository;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@Repository("countryRepositoryExtended")
public interface ICountryRepositoryExtended extends ICountryRepository {

	//Add your custom code here
}

