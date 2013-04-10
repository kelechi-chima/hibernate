package org.afrosoft.timesheet.dao;

import org.afrosoft.timesheet.domain.Project;
import org.afrosoft.timesheet.domain.Timesheet;
import org.afrosoft.timesheet.domain.TimesheetTask;

public interface TimesheetTaskDao {

  Timesheet add(Timesheet timesheet, Project project);

  Timesheet update(Timesheet timesheet);

  void remove(TimesheetTask timesheetTask);
  
}
