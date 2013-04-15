package org.afrosoft.timesheet.dao.hibernate;

import org.afrosoft.timesheet.domain.Role;

public class RoleEnumUserType extends EnumUserType<Role> {

  public RoleEnumUserType() {
    super(Role.class);
  }

}
