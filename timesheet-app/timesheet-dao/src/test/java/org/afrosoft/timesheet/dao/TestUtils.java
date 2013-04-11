package org.afrosoft.timesheet.dao;

import java.math.BigDecimal;
import java.util.Date;

import org.afrosoft.timesheet.domain.Address;
import org.afrosoft.timesheet.domain.Client;
import org.afrosoft.timesheet.domain.Contact;
import org.afrosoft.timesheet.domain.Employee;
import org.afrosoft.timesheet.domain.Project;
import org.afrosoft.timesheet.domain.Role;
import org.afrosoft.timesheet.domain.Timesheet;
import org.afrosoft.timesheet.domain.TimesheetTask;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;

/**
 * Utility class that centralizes creation of test domain objects.
 */
public final class TestUtils {

  /**
   * @return a Client object populated with test values.
   */
  public static Client client() {
    Client client = new Client();
    client.setName("Another fictional client");
    client.setContact(contact());
    client.setAddress(address());
    return client;
  }

  /**
   * @return a Contact object populated with test values.
   */
  public static Contact contact() {
    Contact contact = new Contact();
    contact.setFirstName("Jane");
    contact.setLastName("Doe");
    contact.setEmail("jane.doe@anotherfictionalclient.com");
    contact.setTelephone("019875425892");
    return contact;
  }
  
  /**
   * @return an Address object populated with test values.
   */
  public static Address address() {
    Address address = new Address();
    address.setLine1("Another Fictional Client House");
    address.setLine2("Another Fictional Client Road");
    address.setLine3("Another Fictional Client City");
    address.setLine4("Another Fictional Client County");
    address.setPostcode("Postcode");
    return address;
  }
  
  /**
   * @return an Employee object populated with test values.
   */
  public static Employee employee() {
    Employee employee = new Employee();
    employee.setEmployeeNo("AX497822E");
    employee.setFirstName("Jane");
    employee.setLastName("Smith");
    employee.setDateOfBirth(new DateMidnight(1975, 5, 15).toDate());
    employee.setRole(Role.ANALYST);
    employee.setRate(new BigDecimal(30.75));
    employee.setAddress(address());
    return employee;
  }
  
  /**
   * @return a Project object populated with test values.
   */
  public static Project project() {
    DateTime currentDate = new DateTime();
    Project project = new Project();
    project.setName("project name");
    project.setStartDate(currentDate.minusMonths(6).toDate());
    project.setEndDate(currentDate.plusMonths(6).toDate());
    return project;
  }
  
  /**
   * @return a Timesheet object populated with test values.
   */
  public static Timesheet timesheet() {
    Timesheet timesheet = new Timesheet();
    timesheet.setEntryDate(new Date());
    return timesheet;
  }
  
  /**
   * @return a TimesheetTask object populated with test values.
   */
  public static TimesheetTask timesheetTask() {
    TimesheetTask task = new TimesheetTask();
    task.setDescription("description");
    task.setHoursWorked(5.00);
    return task;
  }
}
