package org.afrosoft.timesheet.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class EmployeeTest {

  @Test
  public void twoInstancesWithSameFieldValuesShouldBeEqual() {
    Employee a = TestUtils.employee();
    a.setId(1L);
    
    Employee b = copyFields(a);
    
    assertEquals(a, b);
  }
  
  @Test
  public void twoInstancesWithDifferentIdShouldNotBeEqual() {
    Employee a = TestUtils.employee();
    a.setId(1L);
    
    Employee b = copyFields(a);
    b.setId(2L);
    
    assertNotEquals(a, b);
  }
  
  @Test
  public void twoInstancesWithDifferentNationalInsuranceNosShouldNotBeEqual() {
    Employee a = TestUtils.employee();
    a.setId(1L);
    
    Employee b = copyFields(a);
    b.setNationalInsuranceNo("Different No");
    
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
    b.setNationalInsuranceNo(a.getNationalInsuranceNo());
    b.setProjects(a.getProjects());
    b.setTimesheets(a.getTimesheets());
    return b;
  }
}
