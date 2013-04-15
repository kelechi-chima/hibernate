package org.afrosoft.timesheet.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class EmployeeTest {

  @Test
  public void differentInstancesWithSameEmployeeNoAreEqual() {
    Employee a = TestUtils.employee();
    Employee b = TestUtils.copyFields(a);
    assertEquals(a, b);
  }
  
  @Test
  public void differentInstancesWithDifferentEmployeeNoAreNotEqual() {
    Employee a = TestUtils.employee();
    Employee b = TestUtils.copyFields(a);
    b.setEmployeeNo("Different employee no");
    assertNotEquals(a, b);
  }

}
