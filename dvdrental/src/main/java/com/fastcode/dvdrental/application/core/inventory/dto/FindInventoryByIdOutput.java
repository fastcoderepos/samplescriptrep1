package com.fastcode.dvdrental.application.core.inventory.dto;

import java.time.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FindInventoryByIdOutput {

  	private Integer inventoryId;
  	private LocalDate lastUpdate;
  	private Short storeId;
  	private Integer filmId;
  	private Integer filmDescriptiveField;
	private Long versiono;
 
}

