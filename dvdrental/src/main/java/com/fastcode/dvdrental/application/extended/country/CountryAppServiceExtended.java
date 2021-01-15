package com.fastcode.dvdrental.application.extended.country;

import org.springframework.stereotype.Service;
import com.fastcode.dvdrental.application.core.country.CountryAppService;

import com.fastcode.dvdrental.domain.extended.country.ICountryRepositoryExtended;
import com.fastcode.dvdrental.commons.logging.LoggingHelper;

@Service("countryAppServiceExtended")
public class CountryAppServiceExtended extends CountryAppService implements ICountryAppServiceExtended {

	public CountryAppServiceExtended(ICountryRepositoryExtended countryRepositoryExtended,
				ICountryMapperExtended mapper,LoggingHelper logHelper) {

		super(countryRepositoryExtended,
		mapper,logHelper);

	}

 	//Add your custom code here
 
}

