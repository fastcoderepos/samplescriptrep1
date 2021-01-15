package com.fastcode.dvdrental.application.core.payment.dto;

import java.time.*;
import javax.validation.constraints.NotNull;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CreatePaymentInput {

  	@NotNull(message = "amount Should not be null")
  	private BigDecimal amount;
  
  	private LocalDate paymentDate;
  
  	@NotNull(message = "paymentId Should not be null")
  	private Integer paymentId;
  
  	private Integer customerId;
  	private Integer rentalId;
  	private Integer staffId;

}

