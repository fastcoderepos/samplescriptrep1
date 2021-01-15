package com.fastcode.dvdrental.application.core.payment.dto;

import java.time.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class GetRentalOutput {

 	private LocalDate lastUpdate;
 	private LocalDate rentalDate;
 	private Integer rentalId;
 	private LocalDateTime returnDate;
  	private Integer paymentPaymentId;

}

