package org.afrosoft.timesheet.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class ContactTest {

  @Test
  public void contactsWithSameFieldsShouldBeEqual() {
    Contact a = TestUtils.contact();
    Contact b = copyFields(a);
    assertEquals(a, b);
  }
  
  @Test
  public void contactsWithDifferentFirstNameShouldNotBeEqual() {
    Contact a = TestUtils.contact();
    Contact b = copyFields(a);
    b.setFirstName("Different first name");
    assertNotEquals(a, b);
  }
  
  @Test
  public void contactsWithDifferentLastNameShouldNotBeEqual() {
    Contact a = TestUtils.contact();
    Contact b = copyFields(a);
    b.setLastName("Different last name");
    assertNotEquals(a, b);
  }
  
  @Test
  public void contactsWithDifferentEmailShouldNotBeEqual() {
    Contact a = TestUtils.contact();
    Contact b = copyFields(a);
    b.setEmail("Different email");
    assertNotEquals(a, b);
  }
  
  @Test
  public void contactsWithDifferentTelephoneShouldNotBeEqual() {
    Contact a = TestUtils.contact();
    Contact b = copyFields(a);
    b.setTelephone("Different telephone");
    assertNotEquals(a, b);
  }
  
  public Contact copyFields(Contact a) {
    Contact b = new Contact();
    b.setFirstName(a.getFirstName());
    b.setLastName(a.getLastName());
    b.setEmail(a.getEmail());
    b.setTelephone(a.getTelephone());
    return b;
  }
}
