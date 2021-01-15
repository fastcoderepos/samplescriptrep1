package com.fastcode.dvdrental.application.extended.rental;

import org.springframework.stereotype.Service;
import com.fastcode.dvdrental.application.core.rental.RentalAppService;

import com.fastcode.dvdrental.domain.extended.rental.IRentalRepositoryExtended;
import com.fastcode.dvdrental.domain.extended.customer.ICustomerRepositoryExtended;
import com.fastcode.dvdrental.domain.extended.inventory.IInventoryRepositoryExtended;
import com.fastcode.dvdrental.domain.extended.staff.IStaffRepositoryExtended;
import com.fastcode.dvdrental.commons.logging.LoggingHelper;

@Service("rentalAppServiceExtended")
public class RentalAppServiceExtended extends RentalAppService implements IRentalAppServiceExtended {

	public RentalAppServiceExtended(IRentalRepositoryExtended rentalRepositoryExtended,
				ICustomerRepositoryExtended customerRepositoryExtended,IInventoryRepositoryExtended inventoryRepositoryExtended,IStaffRepositoryExtended staffRepositoryExtended,IRentalMapperExtended mapper,LoggingHelper logHelper) {

		super(rentalRepositoryExtended,
		customerRepositoryExtended,inventoryRepositoryExtended,staffRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

