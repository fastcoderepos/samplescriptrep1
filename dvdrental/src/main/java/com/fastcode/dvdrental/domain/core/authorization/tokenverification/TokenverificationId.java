package com.fastcode.dvdrental.domain.core.authorization.tokenverification;

import java.time.*;
import javax.persistence.*;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter @Setter
@NoArgsConstructor
public class TokenverificationId implements Serializable {

	private static final long serialVersionUID = 1L;
	
    private String tokenType;
    private Long userId;
    
    public TokenverificationId(String tokenType,Long userId) {
 	this.tokenType = tokenType;
 	this.userId = userId;
    }
    
}
