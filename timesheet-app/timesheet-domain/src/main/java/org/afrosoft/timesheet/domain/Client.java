package org.afrosoft.timesheet.domain;

import java.util.ArrayList;
import java.util.List;

public class Client {

	private Long id;
	
	private String name;
	
	private Contact contact;
	
	private Address address;
	
	private List<Project> projects = new ArrayList<Project>();
	
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
	
	public List<Project> getProjects() {
		if (projects == null) {
			projects = new ArrayList<Project>();
		}
		return projects;
	}
	
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
	public Long getId() {
		return id;
	}
	
	protected void setId(Long id) {
		this.id = id;
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
