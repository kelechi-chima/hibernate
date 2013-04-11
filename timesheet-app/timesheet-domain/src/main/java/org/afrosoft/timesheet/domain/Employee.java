package org.afrosoft.timesheet.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Employee {

  private Long id;

  private String nationalInsuranceNo;

  private String firstName;

  private String lastName;

  private Date dateOfBirth;

  private Role role;

  private BigDecimal rate;

  private Address address;

  private Manager manager;

  private Set<Project> projects = new HashSet<Project>();

  private Set<Timesheet> timesheets = new HashSet<Timesheet>();

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

  public Manager getManager() {
    return manager;
  }

  public void setManager(Manager manager) {
    this.manager = manager;
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
    result = 37 * result + (id != null ? id.hashCode() : 0);
    result = 37 * result + (firstName != null ? firstName.hashCode() : 0);
    result = 37 * result + (lastName != null ? lastName.hashCode() : 0);
    result = 37 * result + (nationalInsuranceNo != null ? nationalInsuranceNo.hashCode() : 0);
    result = 37 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
    result = 37 * result + (role != null ? role.hashCode() : 0);
    result = 37 * result + (address != null ? address.hashCode() : 0);
    result = 37 * result + (manager != null ? manager.hashCode() : 0);
    result = 37 * result + (timesheets != null ? timesheets.hashCode() : 0);
    result = 37 * result + (projects != null ? projects.hashCode() : 0);
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Employee))
      return false;

    Employee other = (Employee)obj;

    if (this.id == null && other.id != null ||
        this.id != null && (other.id == null || !this.id.equals(other.id)))
      return false;

    if (this.firstName == null && other.firstName != null ||
        this.firstName != null && (other.firstName == null || !this.firstName.equals(other.firstName)))
      return false;

    if (this.lastName == null && other.lastName != null ||
        this.lastName != null && (other.lastName == null || !this.lastName.equals(other.lastName)))
      return false;

    if (this.role == null && other.role != null ||
        this.role != null && (other.role == null || !this.role.equals(other.role)))
      return false;
    
    if (this.dateOfBirth == null && other.dateOfBirth != null ||
        this.dateOfBirth != null && (other.dateOfBirth == null || !this.dateOfBirth.equals(other.dateOfBirth)))
      return false;
    
    if (this.nationalInsuranceNo == null && other.nationalInsuranceNo != null ||
        this.nationalInsuranceNo != null && (other.nationalInsuranceNo == null || !this.nationalInsuranceNo.equals(other.nationalInsuranceNo)))
      return false;
    
    if (this.manager == null && other.manager != null || 
        this.manager != null && (other.manager == null || !this.manager.equals(other.manager)))
      return false;
    
    if (this.address == null && other.address != null ||
        this.address != null && (other.address == null || !this.address.equals(other.address)))
      return false;

    if (this.projects == null && other.projects != null ||
        this.projects != null && (other.projects == null || !this.projects.equals(other.projects)))
      return false;
    
    if (this.timesheets == null && other.timesheets != null ||
        this.timesheets != null && (other.timesheets == null || !this.timesheets.equals(other.timesheets)))
      return false;

    return true;
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
