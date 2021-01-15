package com.fastcode.dvdrental.application.core.payment.dto;

import java.time.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class GetCustomerOutput {

 	private Integer active;
 	private LocalDate createDate;
 	private Integer customerId;
 	private String email;
 	private String firstName;
 	private String lastName;
 	private LocalDate lastUpdate;
 	private Short storeId;
  	private Integer paymentPaymentId;

}

