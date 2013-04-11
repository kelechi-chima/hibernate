package org.afrosoft.timesheet.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Project {

	private Long id;

	private String name;

	private Date startDate;

	private Date endDate;

	private Client client;
	
	private Set<Employee> employees = new HashSet<Employee>();
	
	private Set<TimesheetTask> timesheetTasks = new HashSet<TimesheetTask>();

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

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	public Set<TimesheetTask> getTimesheetTasks() {
    return timesheetTasks;
  }

  public void setTimesheetTasks(Set<TimesheetTask> timesheetTasks) {
    this.timesheetTasks = timesheetTasks;
  }

  @Override
  public int hashCode() {
  	// TODO
	  return super.hashCode();
  }

	@Override
  public boolean equals(Object obj) {
		// TODO
	  return super.equals(obj);
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
