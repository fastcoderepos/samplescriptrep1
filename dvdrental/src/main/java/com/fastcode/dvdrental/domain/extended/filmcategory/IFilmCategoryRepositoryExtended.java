package com.fastcode.dvdrental.domain.extended.filmcategory;

import org.springframework.stereotype.Repository;
import com.fastcode.dvdrental.domain.core.filmcategory.IFilmCategoryRepository;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@Repository("filmCategoryRepositoryExtended")
public interface IFilmCategoryRepositoryExtended extends IFilmCategoryRepository {

	//Add your custom code here
}

