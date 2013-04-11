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
    return super.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Contact))
      return false;
    
    Contact other = (Contact)obj;
    
    if (this.firstName == null && other.firstName != null ||
        this.firstName != null && (other.firstName == null || !this.firstName.equals(other.firstName)))
      return false;
    
    if (this.lastName == null && other.lastName != null ||
        this.lastName != null && (other.lastName == null || !this.lastName.equals(other.lastName)))
      return false;    
    
    if (this.email == null && other.email != null ||
        this.email != null && (other.email == null || !this.email.equals(other.email)))
      return false;

    if (this.telephone == null && other.telephone != null ||
        this.telephone != null && (other.telephone == null || !this.telephone.equals(other.telephone)))
      return false;
    
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
