package org.afrosoft.timesheet.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClientTest {

  @Test
  public void twoInstancesWithSameFieldValuesShouldBeEqual() {
    Client a = TestUtils.client();
    a.setId(7L);
    
    Client b = copyFields(a);
    
    assertEquals(a, b);
  }
  
  @Test
  public void twoInstancesWithDifferentIdShouldNotBeEqual() {
    Client a = TestUtils.client();
    a.setId(7L);
    
    Client b = copyFields(a);
    b.setId(8L);
    
    assertNotEquals(a, b);
  }
  
  @Test
  public void twoInstancesWithDifferentNamesShouldNotBeEqual() {
    Client a = TestUtils.client();
    a.setId(7L);
    
    Client b = copyFields(a);
    b.setName("Different Client");
    
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
