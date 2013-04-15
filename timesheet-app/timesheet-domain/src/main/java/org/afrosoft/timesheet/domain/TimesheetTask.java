package org.afrosoft.timesheet.domain;

public class TimesheetTask {

  private Long id;
  
  private String taskName;
  
  private String description;
  
  private Double hoursWorked;
  
  private Project project;
  
  private Timesheet timesheet;

  public Long getId() {
    return id;
  }

  protected void setId(Long id) {
    this.id = id;
  }

  public String getTaskName() {
    return taskName;
  }

  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Double getHoursWorked() {
    return hoursWorked;
  }

  public void setHoursWorked(Double hoursWorked) {
    this.hoursWorked = hoursWorked;
  }

  public Project getProject() {
    return project;
  }

  public void setProject(Project project) {
    this.project = project;
  }

  public Timesheet getTimesheet() {
    return timesheet;
  }

  public void setTimesheet(Timesheet timesheet) {
    this.timesheet = timesheet;
  }

  @Override
  public int hashCode() {
  	int result = 17;
  	result = 37 * result + (getTaskName() != null ? getTaskName().hashCode() : 0);
  	Timesheet timesheet = getTimesheet();
  	result = 37 * result + (timesheet != null ? timesheet.hashCode() : 0);
	  return result;
  }

	@Override
  public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!(obj instanceof TimesheetTask)) return false;
		
		TimesheetTask other = (TimesheetTask)obj;
		
		if (getTaskName() == null && other.getTaskName() != null) return false;
		if (getTaskName() != null)
		  if (other.getTaskName() == null || !getTaskName().equals(other.getTaskName())) return false;
		
	  return true;
  }

	@Override
  public String toString() {
    return new StringBuilder().
      append("TimesheetTask[id=").append(getId()).
      append(", task name=").append(getTaskName()).
      append(", description=").append(getDescription()).
      append(", hours worked=").append(getHoursWorked()).
      append("]").
      toString();
  }
  
}
