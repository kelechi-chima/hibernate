package org.afrosoft.timesheet.dao;

import net.sf.hibernate.Session;
import net.sf.hibernate.SessionFactory;
import net.sf.hibernate.Transaction;
import net.sf.hibernate.cfg.Configuration;

import org.afrosoft.timesheet.domain.Client;

public class HibernateConfigTest {

  public static void main(String[] args) {
    try {
      SessionFactory sessionFactory = new Configuration().
          configure("/hibernate.cfg.xml").
          buildSessionFactory();
      
      Client client = TestUtils.client();
      
      Session session = sessionFactory.openSession();
      Transaction transaction = session.beginTransaction();
      Long clientId = (Long) session.save(client);
      transaction.commit();
      
      transaction = session.beginTransaction();
      session.delete(client);
      transaction.commit();
      
      session.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    
  }
  
}
