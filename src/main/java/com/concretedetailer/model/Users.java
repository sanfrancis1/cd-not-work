package com.concretedetailer.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users_info")
@Data
public class Users {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name ="userid")
	    private int id;
	    
	    @Column(nullable = false, length = 45)
	    private String name;
		
	    @Column(nullable = false, unique = true, length = 45)
	    private String email;
	    
	    @Column(nullable = false, length = 45)
	    private String mobilenumber;
	    
	    @Column(nullable = false, length = 45)
	    private String address;
	    
	    @Column(nullable = false, length = 45)
	    private String country;
	    
	    @Column(nullable = false, length = 45)
	    private Date createddate;
	    
	    @Column(nullable = false)
	    private boolean active;
	    
}
