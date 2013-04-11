package org.afrosoft.timesheet.domain;

import java.util.HashSet;
import java.util.Set;

public class Client {

	private Long id;
	
	private String name;
	
	private Contact contact;
	
	private Address address;
	
	private Set<Project> projects = new HashSet<Project>();
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Contact getContact() {
		return contact;
	}
	
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Set<Project> getProjects() {
		return projects;
	}
	
	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}
	
	public Long getId() {
		return id;
	}
	
	protected void setId(Long id) {
		this.id = id;
	}

	@Override
  public int hashCode() {
    int result = 17;
    result = 37 * result + (getName() != null ? getName().hashCode() : 0);
    return result;
  }

  @Override
  public boolean equals(Object obj) {
  	if (this == obj) return true;
    if (!(obj instanceof Client)) return false;
    
    Client other = (Client)obj;
    
    if (this.getName() == null && other.getName() != null) return false;
    if (this.getName() != null)
    	if (other.getName() == null || !this.getName().equals(other.getName())) return false;
    
    return true;
  }

  @Override
  public String toString() {
	  return new StringBuilder().
	  		append("Client[id=").append(getId()).
	  		append(", name=").append(getName()).
	  		append(", contact=").append(getContact()).
	  		append(", address=").append(getAddress()).
	  		append("]").toString();
  }
	
}
