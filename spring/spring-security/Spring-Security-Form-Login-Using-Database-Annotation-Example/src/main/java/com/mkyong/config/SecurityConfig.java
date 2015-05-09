package com.mkyong.config;
 
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
 
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception { 
	  auth.jdbcAuthentication().dataSource(dataSource)
		.usersByUsernameQuery(
			"select username,password, enabled from users where username=?")
		.authoritiesByUsernameQuery(
			"select username, role from user_roles where username=?");
	}	
  
	//.csrf() is optional, enabled by default, if using WebSecurityConfigurerAdapter constructor
	@Override
	protected void configure(HttpSecurity http) throws Exception {
 
	    http.authorizeRequests()
		.antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')")
		.and()
		    .formLogin()
				.loginProcessingUrl("/j_spring_security_check")
				.loginPage("/login")
				.failureUrl("/login?error")
				.usernameParameter("username")
				.passwordParameter("password")		
		.and()
		    .logout()
				.logoutUrl("/j_spring_security_logout")
				.logoutSuccessUrl("/login?logout")
		.and()
			.exceptionHandling().accessDeniedPage("/403")
		.and()
		    .csrf(); 		
	}
}