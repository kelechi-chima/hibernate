package org.afrosoft.timesheet.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class AddressTest {

  @Test
  public void twoInstancesWithSameFieldValuesShouldBeEqual() {
    Address a = TestUtils.address();
    Address b = TestUtils.copyFields(a);
    assertEquals(a, b);
  }

  @Test
  public void addressesWithDifferentLine1ShouldNotBeEqual() {
    Address a = TestUtils.address();
    Address b = TestUtils.copyFields(a);
    b.setLine1("Different line 1");
    assertNotEquals(a, b);
  }
  
  @Test
  public void addressesWithDifferentLine2ShouldNotBeEqual() {
    Address a = TestUtils.address();
    Address b = TestUtils.copyFields(a);
    b.setLine2("Different line 2");
    assertNotEquals(a, b);
  }
  
  @Test
  public void addressesWithDifferentLine3ShouldNotBeEqual() {
    Address a = TestUtils.address();
    Address b = TestUtils.copyFields(a);
    b.setLine3("Different line 3");
    assertNotEquals(a, b);
  }
  
  @Test
  public void addressesWithDifferentLine4ShouldNotBeEqual() {
    Address a = TestUtils.address();
    Address b = TestUtils.copyFields(a);
    b.setLine4("Different line 4");
    assertNotEquals(a, b);
  }
  
  @Test
  public void addressesWithDifferentPostcodeShouldNotBeEqual() {
    Address a = TestUtils.address();
    Address b = TestUtils.copyFields(a);
    b.setPostcode("Different postcode");
    assertNotEquals(a, b);
  }
  
}
