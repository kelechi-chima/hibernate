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
    int result = 17;
    result = 37 * result + (name != null ? name.hashCode() : 0);
	  return result;
  }

	@Override
  public boolean equals(Object obj) {
	  if (this == obj) return true;
	  if (!(obj instanceof Project)) return false;
	  
	  Project other = (Project)obj;
	  
	  if (getName() == null && other.getName() != null) return false;
	  if (getName() != null)
	    if (other.getName() == null || !getName().equals(other.getName())) return false;
	  
	  return true;
  }

	@Override
  public String toString() {
	  return new StringBuilder().
	  		append("Project[id=").append(getId()).
	  		append(", name=").append(getName()).
	  		append(", start date=").append(getStartDate()).
	  		append(", end date=").append(getEndDate()).
	  		append("]").toString();
  }
	
}
