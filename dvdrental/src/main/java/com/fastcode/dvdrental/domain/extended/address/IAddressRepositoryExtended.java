package com.fastcode.dvdrental.domain.extended.address;

import org.springframework.stereotype.Repository;
import com.fastcode.dvdrental.domain.core.address.IAddressRepository;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@Repository("addressRepositoryExtended")
public interface IAddressRepositoryExtended extends IAddressRepository {

	//Add your custom code here
}

