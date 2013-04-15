package org.afrosoft.timesheet.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClientTest {

  @Test
  public void differentInstancesWithSameNameAreEqual() {
    Client a = TestUtils.client();
    Client b = TestUtils.copyFields(a);
    assertEquals(a, b);
  }
  
  @Test
  public void differentInstancesWithDifferentNamesAreNotEqual() {
    Client a = TestUtils.client();
    Client b = TestUtils.copyFields(a);
    b.setName("Different Name");
    assertNotEquals(a, b);
  }
  
}
