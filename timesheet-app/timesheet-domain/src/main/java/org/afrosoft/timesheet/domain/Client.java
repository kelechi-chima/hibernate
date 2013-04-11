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
    result = 37 * result + (id != null ? id.hashCode() : 0);
    result = 37 * result + (name != null ? name.hashCode() : 0);
    result = 37 * result + (contact != null ? contact.hashCode() : 0);
    result = 37 * result + (address != null ? address.hashCode() : 0);
    result = 37 * result + (projects != null ? projects.hashCode() : 0);
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Client))
      return false;
    
    Client other = (Client)obj;
    
    if (this.id == null && other.id != null ||
        this.id != null && (other.id == null || !this.id.equals(other.id)))
      return false;
    
    if (this.name == null && other.name != null ||
        this.name != null && (other.name == null || !this.name.equals(other.name)))
      return false;
    
    if (this.contact == null && other.contact != null ||
        this.contact != null && (other.contact == null || !this.contact.equals(other.contact)))
      return false;
    
    if (this.address == null && other.address != null ||
        this.address != null && (other.address == null || !this.address.equals(other.address)))
      return false;
    
    if (this.projects == null && other.projects != null ||
        this.projects != null && (other.projects == null || !this.projects.equals(other.projects)))
      return false;
    
    return true;
  }

  @Override
  public String toString() {
	  return new StringBuilder().
	  		append("Client[id=").append(id).
	  		append(", name=").append(name).
	  		append(", contact=").append(contact).
	  		append(", address=").append(address).
	  		append("]").toString();
  }
	
}
