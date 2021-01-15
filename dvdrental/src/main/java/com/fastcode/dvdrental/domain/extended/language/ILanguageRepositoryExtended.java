package com.fastcode.dvdrental.domain.extended.language;

import org.springframework.stereotype.Repository;
import com.fastcode.dvdrental.domain.core.language.ILanguageRepository;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@Repository("languageRepositoryExtended")
public interface ILanguageRepositoryExtended extends ILanguageRepository {

	//Add your custom code here
}

