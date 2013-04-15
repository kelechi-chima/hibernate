package org.afrosoft.timesheet.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.joda.time.DateTime;
import org.junit.Test;

public class TimesheetTest {

  @Test
  public void differentInstancesWithSameEmployeeAndEntryDateAreEqual() {
    Employee employee = TestUtils.employee();
    Timesheet a = TestUtils.timesheet();
    a.setEmployee(employee);
    Timesheet b = TestUtils.copyFields(a);
    assertEquals(a, b);
  }
  
  @Test
  public void differentInstancesWithDifferentEmployeesAndSameEntryDateAreNotEqual() {
    Employee employee = TestUtils.employee();
    Timesheet a = TestUtils.timesheet();
    a.setEmployee(employee);
    Timesheet b = TestUtils.copyFields(a);
    b.setEmployee(new Employee());
    assertNotEquals(a, b);
  }

  @Test
  public void differentInstancesWithSameEmployeesAndDifferentEntryDateAreNotEqual() {
    Employee employee = TestUtils.employee();
    Timesheet a = TestUtils.timesheet();
    a.setEmployee(employee);
    Timesheet b = TestUtils.copyFields(a);
    b.setEntryDate(new DateTime(a.getEntryDate()).plusDays(1).toDate());
    assertNotEquals(a, b);
  }
  
}
