
package com.concretedetailer.model;

import java.sql.Date;
import java.util.Collection;
import java.util.Collections;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Data
@Table(name = "login_info")
public class Login implements UserDetails {

	@Id
	private int userid;

	@OneToOne
	@JoinColumn(name = "userid", referencedColumnName = "userid")
	private Users user;

	@Column
	private String username;

	@Column
	private String password;



	@OneToOne
	@JoinColumn(name = "subscription_id", referencedColumnName = "subscription_id")
	public Subscription subscription;

	@Column
	private Date createddate;

	@Column
	private boolean active;
	
	@Enumerated(EnumType.STRING)
    private Role role;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		  SimpleGrantedAuthority authority = new SimpleGrantedAuthority(role.name());
	        return Collections.singletonList(authority);
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

}
