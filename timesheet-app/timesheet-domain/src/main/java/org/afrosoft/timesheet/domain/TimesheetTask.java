package org.afrosoft.timesheet.domain;

public class TimesheetTask {

  private Long id;
  
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
  public String toString() {
    return new StringBuilder().
      append("TimesheetTask[id=").append(id).
      append(", description=").append(description).
      append(", hours worked=").append(hoursWorked).
      append("]").
      toString();
  }
  
}
