package com.casmir.org.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{
 
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeHttpRequests()
		.antMatchers("/admin/**").authenticated()
		.antMatchers("/user/**").permitAll()
		.and()
		.httpBasic();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) 
			throws Exception {
		auth.inMemoryAuthentication()
		.withUser("james").password("james123").authorities("user")
		.and()
		.withUser("john").password("john123").authorities("admin")
		.and()
		.passwordEncoder(NoOpPasswordEncoder.getInstance());
	}
	
	 
}
