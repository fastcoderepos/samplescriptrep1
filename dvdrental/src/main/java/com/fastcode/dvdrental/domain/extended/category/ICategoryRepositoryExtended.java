package com.fastcode.dvdrental.domain.extended.category;

import org.springframework.stereotype.Repository;
import com.fastcode.dvdrental.domain.core.category.ICategoryRepository;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@Repository("categoryRepositoryExtended")
public interface ICategoryRepositoryExtended extends ICategoryRepository {

	//Add your custom code here
}

