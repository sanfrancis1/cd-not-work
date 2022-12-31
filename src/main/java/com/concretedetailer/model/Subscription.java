package com.concretedetailer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Data
@Table(name = "subscription")
public class Subscription {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int subscription_id;
	
	@Column
	private String subscription_type;
	
	@Column
	private int subscription_duration;
	
	@Column
	private String subscription_datetype;
	
	@Column
	private int subscription_price;
	
}
