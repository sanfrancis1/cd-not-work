
package com.concretedetailer.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.concretedetailer.service.CustomLoginSucessHandler;
import com.concretedetailer.service.CustomUserDetailsService;

@Configuration
@EnableWebSecurity

public class SecurityConfig //extends WebSecurityConfigurerAdapter {
{

	
	@Autowired
    private CustomLoginSucessHandler sucessHandler;
	
	
	@Autowired
	private DataSource dataSource;

	@Bean
	public UserDetailsService userDetailsService() {
		return new CustomUserDetailsService();
	}

	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
		authProvider.setUserDetailsService(userDetailsService());
		authProvider.setPasswordEncoder(passwordEncoder());

		return authProvider;
	}

	@Bean
	public static PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	/*
	 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
	 * Exception { auth.authenticationProvider(authenticationProvider()); }
	 */

	/*
	 * @Override protected void configure(HttpSecurity http) throws Exception {
	 * http.csrf().disable().authorizeRequests().antMatchers(HttpMethod.GET,
	 * "/login").permitAll().antMatchers("/login")
	 * .permitAll().antMatchers("/pages/**").permitAll().antMatchers(HttpMethod.GET,
	 * "/h2-console").permitAll() .antMatchers(HttpMethod.POST,
	 * "/signup").permitAll().anyRequest().authenticated().and().formLogin().
	 * usernameParameter("username") .passwordParameter("password")
	 * .loginPage("/login").permitAll().and().logout().invalidateHttpSession(true).
	 * clearAuthentication(true) .permitAll(); }
	 */
	
	
	 @Bean
	    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

	                http.authorizeRequests()
	                // URL matching for accessibility
	                .antMatchers("/", "/login", "/register").permitAll()
	                .antMatchers("/admin/**").hasAnyAuthority("ADMIN")
	                .antMatchers("/account/**").hasAnyAuthority("USER")
	                .anyRequest().authenticated()
	                .and()
	                // form login
	                .csrf().disable().formLogin()
	                .loginPage("/login")
	                .failureUrl("/login?error=true")
	                .successHandler(sucessHandler)
	                .usernameParameter("email")
	                .passwordParameter("password")
	                .and()
	                // logout
	                .logout()
	                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
	                .logoutSuccessUrl("/")
	                .and()
	                .exceptionHandling()
	                .accessDeniedPage("/access-denied");

	                http.authenticationProvider(authenticationProvider());
	                http.headers().frameOptions().sameOrigin();

	                return http.build();
	    }

	    @Bean
	    public WebSecurityCustomizer webSecurityCustomizer() {
	        return (web) -> web.ignoring().antMatchers("/images/**", "/js/**", "/webjars/**");
	    }
}
