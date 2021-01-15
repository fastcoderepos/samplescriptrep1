package com.fastcode.dvdrental.domain.extended.payment;

import org.springframework.stereotype.Repository;
import com.fastcode.dvdrental.domain.core.payment.IPaymentRepository;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@Repository("paymentRepositoryExtended")
public interface IPaymentRepositoryExtended extends IPaymentRepository {

	//Add your custom code here
}

