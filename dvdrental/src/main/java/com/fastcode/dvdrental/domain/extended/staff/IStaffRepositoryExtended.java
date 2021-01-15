package com.fastcode.dvdrental.domain.extended.staff;

import org.springframework.stereotype.Repository;
import com.fastcode.dvdrental.domain.core.staff.IStaffRepository;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@Repository("staffRepositoryExtended")
public interface IStaffRepositoryExtended extends IStaffRepository {

	//Add your custom code here
}

