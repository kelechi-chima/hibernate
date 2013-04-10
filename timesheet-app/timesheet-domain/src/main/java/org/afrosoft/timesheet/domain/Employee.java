package org.afrosoft.timesheet.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Employee {

	private Long id;

	private String nationalInsuranceNo;

	private String firstName;

	private String lastName;

	private Date dateOfBirth;

	private Role role;
	
	private BigDecimal rate;

	private Address address;

	private List<Project> projects = new ArrayList<Project>();
	
	private List<Timesheet> timesheets = new ArrayList<Timesheet>();

	public Long getId() {
		return id;
	}

	protected void setId(Long id) {
		this.id = id;
	}
	
	public String getNationalInsuranceNo() {
		return nationalInsuranceNo;
	}

	public void setNationalInsuranceNo(String nationalInsuranceNo) {
		this.nationalInsuranceNo = nationalInsuranceNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public List<Timesheet> getTimesheets() {
		return timesheets;
	}

	public void setTimesheets(List<Timesheet> timesheets) {
		this.timesheets = timesheets;
	}

	@Override
  public String toString() {
	  return new StringBuilder().
	  		append("Employee[id=").append(id).
	  		append(", first name=").append(firstName).
	  		append(", last name=").append(lastName).
	  		append(", dob=").append(dateOfBirth).
	  		append(", role=").append(role).
	  		append(", rate=").append(rate).
	  		append("]").toString();
  }

}
