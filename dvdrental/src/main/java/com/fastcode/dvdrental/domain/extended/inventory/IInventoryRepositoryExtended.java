package com.fastcode.dvdrental.domain.extended.inventory;

import org.springframework.stereotype.Repository;
import com.fastcode.dvdrental.domain.core.inventory.IInventoryRepository;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@Repository("inventoryRepositoryExtended")
public interface IInventoryRepositoryExtended extends IInventoryRepository {

	//Add your custom code here
}

