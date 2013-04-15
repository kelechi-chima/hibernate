package org.afrosoft.timesheet.dao;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import org.afrosoft.timesheet.domain.Employee;
import org.afrosoft.timesheet.domain.Project;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicTest {

  private final Logger logger = LoggerFactory.getLogger(BasicTest.class);
  
  @Test
  public void crudOperationsOnEmployee() throws Exception {
    Session session = null;
    try {
      SessionFactory sessionFactory = new Configuration().
          configure("/hibernate/hibernate.cfg.xml").
          buildSessionFactory();
      
      Employee employee = TestUtils.employee();
      
      logger.info("About to save new Employee instance");
      session = sessionFactory.openSession();
      Transaction tx = session.beginTransaction();
      session.save(employee);
      tx.commit();
      
      Long id = employee.getId();
      assertNotNull(id);
      
      BigDecimal employeeRate = employee.getRate();
      BigDecimal newEmployeeRate = employeeRate.add(BigDecimal.ONE);
      
      logger.info("About to retrieve and update Employee rate");
      tx = session.beginTransaction();
      Employee employee2 = (Employee) session.get(Employee.class, id);
      employee2.setRate(newEmployeeRate);
      Set<Project> projects = employee2.getProjects();
      assertEquals(0, projects.size());
      tx.commit();

      logger.info("About to retrieve Employee using HQL");
      tx = session.beginTransaction();
      List<?> list = session.createQuery("from Employee e where e.firstName = :firstName").
          setString("firstName", employee.getFirstName()).
          list();
      assertEquals(1, list.size());
      Employee employee3 = (Employee) list.get(0);
      assertEquals(employee, employee3);
      tx.commit();

      logger.info("About to retrieve Employee using Criteria API");
      tx = session.beginTransaction();
      list = session.createCriteria(Employee.class).
          add(Restrictions.eq("firstName", employee.getFirstName())).
          list();
      assertEquals(1, list.size());
      Employee employee4 = (Employee) list.get(0);
      assertEquals(employee, employee4);
      tx.commit();
      
      logger.info("About to retrieve and delete Employee");
      tx = session.beginTransaction();
      Employee employee5 = (Employee) session.get(Employee.class, id);
      assertEquals(newEmployeeRate, employee5.getRate());
      session.delete(employee5);
      tx.commit();
      
      tx = session.beginTransaction();
      assertNull(session.get(Employee.class, id));
      tx.commit();
    } finally {
      if (session != null) session.close();
    }
  }
  
}
