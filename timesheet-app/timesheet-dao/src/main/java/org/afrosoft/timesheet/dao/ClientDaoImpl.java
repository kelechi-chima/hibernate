package org.afrosoft.timesheet.dao;

import java.util.List;

import org.afrosoft.timesheet.domain.Client;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class ClientDaoImpl implements ClientDao {

  private final Logger logger = LoggerFactory.getLogger(ClientDaoImpl.class);
  private final SessionFactory sessionFactory;
  
  public ClientDaoImpl() {
    sessionFactory = null;
  }
  
  @Override
  public List<Client> getAllClients() {
    return null;
  }

  @Override
  public Client add(Client client) {
    return null;
  }

  @Override
  public Client update(Client client) {
    return null;
  }

  @Override
  public void remove(Client client) {
  }

}
