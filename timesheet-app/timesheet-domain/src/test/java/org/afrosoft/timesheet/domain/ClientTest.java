package org.afrosoft.timesheet.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClientTest {

  @Test
  public void differentInstancesWithSameNameAreEqual() {
    Client a = TestUtils.client();
    Client b = copyFields(a);
    assertEquals(a, b);
  }
  
  @Test
  public void differentInstancesWithDifferentNamesAreNotEqual() {
    Client a = TestUtils.client();
    Client b = copyFields(a);
    b.setName("Different Name");
    assertNotEquals(a, b);
  }
  
  private Client copyFields(Client a) {
    Client b = new Client();
    b.setId(a.getId());
    b.setName(a.getName());
    b.setAddress(a.getAddress());
    b.setContact(a.getContact());
    b.setProjects(a.getProjects());
    return b;
  }
  
}
