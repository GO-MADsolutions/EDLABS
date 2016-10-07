package com.example.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.example.Model.Employee;
import com.example.Model.EmployeeRepo;

public class CurrentUserDetailService implements UserDetailsService {

	private EmployeeRepo emprepo;
	public CurrentUserDetailService(EmployeeRepo emprepo) {
		
		this.emprepo = emprepo;
	}
	@Override
	public UserDetails loadUserByUsername(String Emailid) throws UsernameNotFoundException {
		Employee e = emprepo.findOneByEmailid(Emailid);
		
		List<GrantedAuthority> grantedauthorities = new ArrayList<>();
		grantedauthorities.add(new SimpleGrantedAuthority(e.getEmployeetype()));
		System.out.println(e.getEmployeetype());
		return new User(e.getEmailid(),e.getPassword(),grantedauthorities);
		
	}

}
