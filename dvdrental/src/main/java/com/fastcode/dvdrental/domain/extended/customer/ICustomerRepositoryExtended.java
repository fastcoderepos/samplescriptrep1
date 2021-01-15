package com.fastcode.dvdrental.domain.extended.customer;

import org.springframework.stereotype.Repository;
import com.fastcode.dvdrental.domain.core.customer.ICustomerRepository;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@Repository("customerRepositoryExtended")
public interface ICustomerRepositoryExtended extends ICustomerRepository {

	//Add your custom code here
}

