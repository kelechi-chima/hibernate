package org.afrosoft.timesheet.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class EmployeeTest {

  @Test
  public void differentInstancesWithSameEmployeeNoAreEqual() {
    Employee a = TestUtils.employee();
    Employee b = copyFields(a);
    assertEquals(a, b);
  }
  
  @Test
  public void differentInstancesWithDifferentEmployeeNoAreNotEqual() {
    Employee a = TestUtils.employee();
    Employee b = copyFields(a);
    b.setEmployeeNo("Different employee no");
    assertNotEquals(a, b);
  }

  private Employee copyFields(Employee a) {
    Employee b = new Employee();
    b.setId(a.getId());
    b.setFirstName(a.getFirstName());
    b.setLastName(a.getLastName());
    b.setDateOfBirth(a.getDateOfBirth());
    b.setRate(a.getRate());
    b.setRole(a.getRole());
    b.setAddress(a.getAddress());
    b.setManager(a.getManager());
    b.setEmployeeNo(a.getEmployeeNo());
    b.setProjects(a.getProjects());
    b.setTimesheets(a.getTimesheets());
    return b;
  }
}
