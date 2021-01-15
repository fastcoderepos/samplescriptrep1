package com.fastcode.dvdrental.domain.extended.authorization.userpermission;

import org.springframework.stereotype.Repository;
import com.fastcode.dvdrental.domain.core.authorization.userpermission.IUserpermissionRepository;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@Repository("userpermissionRepositoryExtended")
public interface IUserpermissionRepositoryExtended extends IUserpermissionRepository {

	//Add your custom code here
}

