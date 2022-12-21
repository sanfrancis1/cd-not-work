package com.concretedetailer.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class SignupDto {
	
	 	private String name;
	    private String email;
	    private String mobilenumber;
	    private String address;
	    private String country;
	    private Date createddate;
	    private boolean active;

}
