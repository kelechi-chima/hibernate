package org.afrosoft.timesheet.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Timesheet {

	private Long id;

	private Date entryDate;
	
	private Double hoursWorked;

	private Employee employee;
	
	private Set<TimesheetTask> timesheetTasks = new HashSet<TimesheetTask>();

	public Long getId() {
		return id;
	}

	protected void setId(Long id) {
		this.id = id;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public Double getHoursWorked() {
    return hoursWorked;
  }

  public void setHoursWorked(Double hoursWorked) {
    this.hoursWorked = hoursWorked;
  }

  public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Set<TimesheetTask> getTimesheetTasks() {
    return timesheetTasks;
  }

  public void setTimesheetTasks(Set<TimesheetTask> timesheetTasks) {
    this.timesheetTasks = timesheetTasks;
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 37 * result + (getEntryDate() != null ? getEntryDate().hashCode() : 0);
    result = 37 * result + (getEmployee() != null ? getEmployee().hashCode() : 0);
	  return result;
  }

	@Override
  public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!(obj instanceof Timesheet)) return false;
		
		Timesheet other = (Timesheet)obj;
		
		Employee employee = getEmployee();
		Employee otherEmployee = other.getEmployee();
		
		if (employee == null && otherEmployee != null) return false;
		if (employee != null)
		  if (otherEmployee == null || !employee.equals(otherEmployee)) return false;
		
		Date entryDate = getEntryDate();
    Date otherEntryDate = other.getEntryDate();
		
    if (entryDate == null && otherEntryDate != null) return false;
    if (entryDate != null)
      if (otherEntryDate == null || !entryDate.equals(otherEntryDate)) return false;
    
	  return true;
  }

	@Override
  public String toString() {
	  return new StringBuilder().
	  		append("Timesheet[id=").append(getId()).
	  		append(", entry date=").append(getEntryDate()).
	  		append(", hours worked=").append(getHoursWorked()).
	  		append("]").toString();
  }
	
}
