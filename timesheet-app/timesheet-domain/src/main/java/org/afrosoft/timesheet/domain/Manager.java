package org.afrosoft.timesheet.domain;

import java.util.HashSet;
import java.util.Set;

public class Manager extends Employee {

  private Set<Employee> subordinates = new HashSet<Employee>();

  public Set<Employee> getSubordinates() {
    return subordinates;
  }

  public void setSubordinates(Set<Employee> subordinates) {
    this.subordinates = subordinates;
  }

}
