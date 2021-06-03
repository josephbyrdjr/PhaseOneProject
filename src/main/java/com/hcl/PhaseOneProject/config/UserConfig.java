package com.hcl.PhaseOneProject.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
@EnableWebSecurity
public class UserConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	UserDetailsService userDetailsService;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.userDetailsService(userDetailsService);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/").permitAll()
				.antMatchers("/*").hasAnyRole("USER", "ADMIN")
				.antMatchers("/getEmployees").hasAnyRole("USER", "ADMIN")
				.antMatchers("/addNewEmployee").hasAnyRole("ADMIN").anyRequest()
				.authenticated()
				.and()
				.formLogin()
				.loginPage("/login").permitAll()
				.and().logout().permitAll();
		http.csrf().disable();
	}
	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests().antMatchers("/").permitAll()
//				.antMatchers("/*").hasAnyRole("USER", "ADMIN")
//				.and().formLogin()
//				.loginPage("/login").permitAll();
//		http.csrf().disable();
//	}
}
