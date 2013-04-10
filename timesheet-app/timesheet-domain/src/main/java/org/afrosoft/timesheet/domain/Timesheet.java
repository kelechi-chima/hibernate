package org.afrosoft.timesheet.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Timesheet {

	private Long id;

	private Date entryDate;
	
	private Double hoursWorked;

	private Employee employee;
	
	private List<TimesheetTask> timesheetTasks = new ArrayList<TimesheetTask>();

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

	public List<TimesheetTask> getTimesheetTasks() {
    return timesheetTasks;
  }

  public void setTimesheetTasks(List<TimesheetTask> timesheetTasks) {
    this.timesheetTasks = timesheetTasks;
  }

  @Override
  public String toString() {
	  return new StringBuilder().
	  		append("Timesheet[id=").append(id).
	  		append(", entry date=").append(entryDate).
	  		append("]").toString();
  }
	
}
