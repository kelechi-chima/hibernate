package org.afrosoft.timesheet.dao.hibernate;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.usertype.UserType;

public class EnumUserType<E extends Enum<E>> implements UserType {

  private static final int[] SQL_TYPES = {Types.VARCHAR};

  private Class<E> clazz = null;

  protected EnumUserType(Class<E> c) {
    this.clazz = c;
  }

  @Override
  public int[] sqlTypes() {
    return SQL_TYPES;
  }

  @SuppressWarnings("rawtypes")
  @Override
  public Class returnedClass() {
    return clazz;
  }

  @Override
  public boolean equals(Object x, Object y) throws HibernateException {
    if (x == y) return true;
    if (x == null || y == null) return false;
    return x.equals(y);
  }

  @Override
  public int hashCode(Object x) throws HibernateException {
    return x.hashCode();
  }

  @Override
  public Object deepCopy(Object value) throws HibernateException {
    return value;
  }

  @Override
  public boolean isMutable() {
    return false;
  }

  @Override
  public Serializable disassemble(Object value) throws HibernateException {
    return (Serializable)value;
  }

  @Override
  public Object assemble(Serializable cached, Object owner)
      throws HibernateException {
    return cached;
  }

  @Override
  public Object replace(Object original, Object target, Object owner)
      throws HibernateException {
    return original;
  }

  @Override
  public Object nullSafeGet(ResultSet rs, String[] names, SessionImplementor session, Object owner)
      throws HibernateException, SQLException {
    String name = rs.getString(names[0]);
    E result = null;
    if (!rs.wasNull()) {
      result = Enum.valueOf(clazz, name);
    }
    return result;
  }

  @SuppressWarnings("rawtypes")
  @Override
  public void nullSafeSet(PreparedStatement stmt, Object value, int index, SessionImplementor session)
      throws HibernateException, SQLException {
    if (value == null) {
      stmt.setNull(index, Types.VARCHAR);
    } else {
      stmt.setString(index, ((Enum)value).name());
    }
  }
}
