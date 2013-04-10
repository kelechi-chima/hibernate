package org.afrosoft.timesheet.dao;

import java.util.List;

import org.afrosoft.timesheet.domain.Client;
import org.afrosoft.timesheet.domain.Project;

public interface ProjectDao {

  Project add(Project project, Client client);
  
  Project update(Project project);
  
  List<Project> findByClientName(String clientName);
  
  Project findByProjectName(String projectName);
  
  void remove(Project project);
  
}
