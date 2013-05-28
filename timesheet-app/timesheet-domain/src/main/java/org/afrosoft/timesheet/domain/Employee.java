package org.afrosoft.timesheet.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Employee {

  private Long id;
  
  private Timestamp lastUpdatedTime;

  private String employeeNo;

  private String firstName;

  private String lastName;

  private Date dateOfBirth;

  private Role role;

  private BigDecimal rate;

  private Address address;

  private Employee manager;
  
  private Set<Employee> subordinates = new HashSet<Employee>();

  private Set<Project> projects = new HashSet<Project>();

  private Set<Timesheet> timesheets = new HashSet<Timesheet>();

  public Long getId() {
    return id;
  }

  protected void setId(Long id) {
    this.id = id;
  }

  Timestamp getLastUpdatedTime() {
    return lastUpdatedTime;
  }

  void setLastUpdatedTime(Timestamp lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }

  public String getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
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

  public Employee getManager() {
    return manager;
  }

  public void setManager(Employee manager) {
    this.manager = manager;
  }

  public Set<Employee> getSubordinates() {
    return subordinates;
  }

  public void setSubordinates(Set<Employee> subordinates) {
    this.subordinates = subordinates;
  }

  public Set<Project> getProjects() {
    return projects;
  }

  public void setProjects(Set<Project> projects) {
    this.projects = projects;
  }

  public Set<Timesheet> getTimesheets() {
    return timesheets;
  }

  public void setTimesheets(Set<Timesheet> timesheets) {
    this.timesheets = timesheets;
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 37 * result + (getEmployeeNo() != null ? getEmployeeNo().hashCode() : 0);
    return result;
  }

  @Override
  public boolean equals(Object obj) {
  	if (this == obj) return true;
    if (!(obj instanceof Employee)) return false;

    Employee other = (Employee)obj;

    if (this.getEmployeeNo() == null && other.getEmployeeNo() != null) return false;
    if (this.getEmployeeNo() != null)
    	if (other.getEmployeeNo() == null || !this.getEmployeeNo().equals(other.getEmployeeNo())) return false;

    return true;
  }

  @Override
  public String toString() {
    return new StringBuilder().
        append("Employee[id=").append(getId()).
        append(", employee no=").append(getEmployeeNo()).
        append(", first name=").append(getFirstName()).
        append(", last name=").append(getLastName()).
        append(", dob=").append(getDateOfBirth()).
        append(", role=").append(getRole()).
        append(", rate=").append(getRate()).
        append("]").toString();
  }

}
