package com.fastcode.dvdrental.application.core.city.dto;

import java.time.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FindCityByIdOutput {

  	private String city;
  	private Integer cityId;
  	private LocalDate lastUpdate;
  	private Integer countryId;
  	private Integer countryDescriptiveField;
	private Long versiono;
 
}

