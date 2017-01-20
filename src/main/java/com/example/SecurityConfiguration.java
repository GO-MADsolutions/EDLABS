package com.example;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


import com.example.Model.EmployeeRepo;
import com.example.Service.CurrentUserDetailService;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	EmployeeRepo emprepo;
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(new CurrentUserDetailService(emprepo));
		
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().
		
		
		antMatchers("/admin*").hasAuthority("ADMIN").
	//	antMatchers("/adminpaneltoedituser").hasAnyAuthority("ADMIN")
	
		anyRequest().fullyAuthenticated().
		
		and().
		formLogin().loginPage("/login").usernameParameter("emailid").permitAll().
		defaultSuccessUrl("/",true).
		and().
		logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/login").
		and().
		exceptionHandling().accessDeniedPage("/403");
		
		
		
		
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		// TODO Auto-generated method stub
		super.configure(web);
	}

}
