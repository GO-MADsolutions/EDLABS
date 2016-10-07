package com.example.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="employee")
public class Employee {
	@Id
	@Column(name="employeeid")
	private int employeeid;
	
	@Column(name="emailid")
	private String emailid;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="password")
	private String password;
	
	@Column(name="passwordconfirm")
	private String passwordconfirm;
	
	@Column(name="salary")
	private int salary;
	
	@Column(name="jobrole")
	private String jobrole;
	
	@Column(name="employeetype")
	private String employeetype;
	
	public Employee (String emailid, String firstname, String lastname, String password,
			 int salary, String jobrole, String employeetype) {
		super();
		//this.employeeid = employeeid;
		this.emailid = emailid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		
		this.salary = salary;
		this.jobrole = jobrole;
		this.employeetype = employeetype;
	}
	public Employee (int employeeid, String emailid, String firstname, String lastname, String password,
			 int salary, String jobrole, String employeetype) {
		super();
		this.employeeid = employeeid;
		this.emailid = emailid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		
		this.salary = salary;
		this.jobrole = jobrole;
		this.employeetype = employeetype;
	}
	public Employee()
	{
		
	}
	
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswordconfirm() {
		return passwordconfirm;
	}
	public void setPasswordconfirm(String passwordconfirm) {
		this.passwordconfirm = passwordconfirm;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getJobrole() {
		return jobrole;
	}
	public void setJobrole(String jobrole) {
		this.jobrole = jobrole;
	}
	public String getEmployeetype() {
		return employeetype;
	}
	public void setEmployeetype(String employeetype) {
		this.employeetype = employeetype;
	}
	
	

}
