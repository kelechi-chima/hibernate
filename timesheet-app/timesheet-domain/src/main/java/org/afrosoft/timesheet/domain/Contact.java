package org.afrosoft.timesheet.domain;

public class Contact {

	private String firstName;
	private String lastName;
	private String email;
	private String telephone;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelephone() {
		return telephone;
	}
	
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	@Override
  public int hashCode() {
	  int result = 17;
	  result = 37 * result + (getFirstName() != null ? getFirstName().hashCode() : 0);
	  result = 37 * result + (getLastName() != null ? getLastName().hashCode() : 0);
	  result = 37 * result + (getEmail() != null ? getEmail().hashCode() : 0);
	  result = 37 * result + (getTelephone() != null ? getTelephone().hashCode() : 0);
    return result;
  }

  @Override
  public boolean equals(Object obj) {
  	if (this == obj) return true;
    if (!(obj instanceof Contact)) return false;
    
    Contact other = (Contact)obj;
    
    if (this.getFirstName() == null && other.getFirstName() != null) return false;
    if (this.getFirstName() != null)
    	if (other.getFirstName() == null || !this.getFirstName().equals(other.getFirstName())) return false;
    
    if (this.getLastName() == null && other.getLastName() != null) return false;
    if (this.getLastName() != null)
    	if (other.getLastName() == null || !this.getLastName().equals(other.getLastName())) return false;    
    
    if (this.getEmail() == null && other.getEmail() != null) return false;
    if (this.getEmail() != null)
    	if (other.getEmail() == null || !this.getEmail().equals(other.getEmail())) return false;

    if (this.getTelephone() == null && other.getTelephone() != null) return false;
    if (this.getTelephone() != null)
    	if (other.getTelephone() == null || !this.getTelephone().equals(other.getTelephone())) return false;
    
    return true;
  }

  @Override
  public String toString() {
	  return new StringBuilder().
	  		append("Contact[first name=").append(firstName).
	  		append(", last name=").append(lastName).
	  		append(", email=").append(email).
	  		append(", telephone=").append(telephone).
	  		append("]").toString();
  }
	
}
