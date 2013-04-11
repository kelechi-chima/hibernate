package org.afrosoft.timesheet.dao;

import java.math.BigDecimal;

import net.sf.hibernate.Session;
import net.sf.hibernate.SessionFactory;
import net.sf.hibernate.Transaction;
import net.sf.hibernate.cfg.Configuration;

import org.afrosoft.timesheet.domain.Employee;
import org.afrosoft.timesheet.domain.Manager;
import org.joda.time.DateMidnight;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HibernateConfigTest {

  private static final Logger LOG = LoggerFactory.getLogger(HibernateConfigTest.class);
  
  public static void main(String[] args) {
    try {
      SessionFactory sessionFactory = new Configuration().
          configure("/hibernate.cfg.xml").
          buildSessionFactory();
      
      Employee worker = TestUtils.employee();
      
      Manager manager = new Manager();
      manager.setEmployeeNo("SC124588F");
      manager.setFirstName("Gosia");
      manager.setLastName("Antoinette");
      manager.setDateOfBirth(new DateMidnight(1969, 8, 23).toDate());
      manager.setRate(new BigDecimal(20.00));
      manager.getSubordinates().add(worker);
      worker.setManager(manager);
      
      Session session = sessionFactory.openSession();
      Transaction tx = session.beginTransaction();
      session.save(manager);
      tx.commit();
      
      Long workerId = worker.getId();
      
      tx = session.beginTransaction();
      Employee a = (Employee) session.load(Employee.class, workerId);
      Employee b = (Employee) session.load(Employee.class, workerId);
      LOG.info("a == b? {}", a == b);
      tx.commit();
      session.close();
      
      /*Session session2 = sessionFactory.openSession();
      Transaction tx2 = session2.beginTransaction();
      Employee c = (Employee) session2.load(Employee.class, workerId);
      LOG.info("a == c? {}", a == c);
      tx2.commit();
      session2.close();*/
      
      /*Session session3 = sessionFactory.openSession();
      Transaction tx3 = session3.beginTransaction();
      session3.delete("FROM EMPLOYEE");
      tx3.commit();
      session3.close();*/
    } catch (Exception ex) {
      LOG.error("HELP!", ex);
    }
  }
  
  
  
}
