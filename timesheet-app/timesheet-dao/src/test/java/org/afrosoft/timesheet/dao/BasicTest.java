package org.afrosoft.timesheet.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.math.BigDecimal;
import java.util.List;

import org.afrosoft.timesheet.domain.Employee;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicTest {

  private final Logger logger = LoggerFactory.getLogger(BasicTest.class);

  @Test
  public void crudOperationsOnEmployee() throws Exception {
    Session session = null;
    try {
      Configuration conf = new Configuration();
      conf.configure("/hibernate/hibernate.cfg.xml");
      ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(conf.getProperties())
                                                             .buildServiceRegistry();
      SessionFactory sessionFactory = conf.buildSessionFactory(registry);

      Employee employee1 = TestUtils.newEmployee();

      logger.info("About to save new Employee instance");
      session = sessionFactory.openSession();
      Transaction tx = session.beginTransaction();
      session.save(employee1);
      tx.commit();

      Long id = employee1.getId();
      assertNotNull(id);

      BigDecimal employeeRate = employee1.getRate();
      BigDecimal newEmployeeRate = employeeRate.add(BigDecimal.ONE);

      logger.info("About to retrieve and update Employee rate");
      tx = session.beginTransaction();
      Employee employee2 = (Employee) session.get(Employee.class, id);
      employee2.setRate(newEmployeeRate);
      tx.commit();

      logger.info("About to retrieve Employee using HQL");
      tx = session.beginTransaction();
      Query query = session.createQuery("from Employee e where e.firstName = :firstName");
      query.setString("firstName", employee1.getFirstName());
      List<?> list = query.list();

      assertEquals(1, list.size());
      Employee employee3 = (Employee) list.get(0);
      assertEquals(employee1, employee3);
      tx.commit();

      logger.info("About to retrieve Employee using Criteria API");
      tx = session.beginTransaction();
      Criteria criteria = session.createCriteria(Employee.class);
      criteria.add(Restrictions.eq("firstName", employee1.getFirstName()));
      criteria.list();

      assertEquals(1, list.size());
      Employee employee4 = (Employee) list.get(0);
      assertEquals(employee1, employee4);
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
      if (session != null)
        session.close();
    }
  }

}
