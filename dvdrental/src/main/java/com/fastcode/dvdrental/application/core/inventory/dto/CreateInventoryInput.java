package com.fastcode.dvdrental.application.core.inventory.dto;

import java.time.*;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CreateInventoryInput {

  	@NotNull(message = "inventoryId Should not be null")
  	private Integer inventoryId;
  
  	private LocalDate lastUpdate;
  
  	private Short storeId;
  
  	private Integer filmId;

}

