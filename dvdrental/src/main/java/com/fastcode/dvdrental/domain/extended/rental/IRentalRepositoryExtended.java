package com.fastcode.dvdrental.domain.extended.rental;

import org.springframework.stereotype.Repository;
import com.fastcode.dvdrental.domain.core.rental.IRentalRepository;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@Repository("rentalRepositoryExtended")
public interface IRentalRepositoryExtended extends IRentalRepository {

	//Add your custom code here
}

