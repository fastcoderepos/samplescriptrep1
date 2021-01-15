package com.fastcode.dvdrental.domain.extended.authorization.user;

import org.springframework.stereotype.Repository;
import com.fastcode.dvdrental.domain.core.authorization.user.IUserRepository;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@Repository("userRepositoryExtended")
public interface IUserRepositoryExtended extends IUserRepository {

	//Add your custom code here
}

