package com.fastcode.dvdrental.application.core.inventory.dto;

import java.time.*;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;

@Getter @Setter
public class GetFilmOutput {

 	private String description;
 	private Integer filmId;
 	private LocalDate lastUpdate;
 	private Short length;
 	private String rating;
 	private Integer releaseYear;
 	private Short rentalDuration;
 	private BigDecimal rentalRate;
 	private BigDecimal replacementCost;
 	private String title;
  	private Integer inventoryInventoryId;

}

