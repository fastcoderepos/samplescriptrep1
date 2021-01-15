package com.fastcode.dvdrental.application.extended.category;

import org.springframework.stereotype.Service;
import com.fastcode.dvdrental.application.core.category.CategoryAppService;

import com.fastcode.dvdrental.domain.extended.category.ICategoryRepositoryExtended;
import com.fastcode.dvdrental.commons.logging.LoggingHelper;

@Service("categoryAppServiceExtended")
public class CategoryAppServiceExtended extends CategoryAppService implements ICategoryAppServiceExtended {

	public CategoryAppServiceExtended(ICategoryRepositoryExtended categoryRepositoryExtended,
				ICategoryMapperExtended mapper,LoggingHelper logHelper) {

		super(categoryRepositoryExtended,
		mapper,logHelper);

	}

 	//Add your custom code here
 
}

