package org.afrosoft.timesheet.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Project {

	private Long id;

	private String name;

	private Date startDate;

	private Date endDate;

	private Client client;
	
	private List<Employee> employees = new ArrayList<Employee>();
	
	private List<TimesheetTask> timesheetTasks = new ArrayList<TimesheetTask>();

	public Long getId() {
		return id;
	}

	protected void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
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
	  		append("Project[id=").append(id).
	  		append(", name=").append(name).
	  		append(", start date=").append(startDate).
	  		append(", end date=").append(endDate).
	  		append("]").toString();
  }
	
}
