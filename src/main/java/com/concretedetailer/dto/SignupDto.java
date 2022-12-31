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
	    
	    private String password;
	    public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getMobilenumber() {
			return mobilenumber;
		}
		public void setMobilenumber(String mobilenumber) {
			this.mobilenumber = mobilenumber;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public Date getCreateddate() {
			return createddate;
		}
		public void setCreateddate(Date createddate) {
			this.createddate = createddate;
		}
		public boolean isActive() {
			return active;
		}
		public void setActive(boolean active) {
			this.active = active;
		}
		private Date createddate;
	    private boolean active;

}
