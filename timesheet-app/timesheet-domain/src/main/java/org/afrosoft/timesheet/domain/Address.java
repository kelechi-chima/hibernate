package org.afrosoft.timesheet.domain;


public class Address {

	private String line1;
	private String line2;
	private String line3;
	private String line4;
	private String postcode;
	
	public String getLine1() {
		return line1;
	}
	
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	
	public String getLine2() {
		return line2;
	}
	
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	
	public String getLine3() {
		return line3;
	}
	
	public void setLine3(String line3) {
		this.line3 = line3;
	}
	
	public String getLine4() {
		return line4;
	}
	
	public void setLine4(String line4) {
		this.line4 = line4;
	}
	
	public String getPostcode() {
		return postcode;
	}
	
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	
	@Override
  public int hashCode() {
	  int result = 17;
	  result = 37 * result + (getLine1() != null ? getLine1().hashCode() : 0);
	  result = 37 * result + (getLine2() != null ? getLine2().hashCode() : 0);
	  result = 37 * result + (getLine3() != null ? getLine3().hashCode() : 0);
	  result = 37 * result + (getLine3() != null ? getLine4().hashCode() : 0);
	  result = 37 * result + (getPostcode() != null ? getPostcode().hashCode() : 0);
    return result;
  }

  @Override
  public boolean equals(Object obj) {
  	if (this == obj) return true;
    if (!(obj instanceof Address)) return false;
    
    Address other = (Address)obj;
    
    if (this.getLine1() == null && other.getLine1() != null) return false;
    if (this.getLine1() != null)
    	if (other.getLine1() == null || !this.getLine1().equals(other.getLine1())) return false;
    
    if (this.getLine2() == null && other.getLine2() != null) return false;
    if (this.getLine2() != null)
    	if (other.getLine2() == null || !this.getLine2().equals(other.getLine2())) return false;
    
    if (this.getLine3() == null && other.getLine3() != null) return false;
    if (this.getLine3() != null)
    	if (other.getLine3() == null || !this.getLine3().equals(other.getLine3())) return false;
    
    if (this.getLine4() == null && other.getLine4() != null) return false;
    if (this.getLine4() != null)
    	if (other.getLine4() == null || !this.getLine4().equals(other.getLine4())) return false;
    
    if (this.getPostcode() == null && other.getPostcode() != null) return false;
    if (this.getPostcode() != null)
    	if (other.getPostcode() == null || !this.getPostcode().equals(other.getPostcode())) return false;
    
    return true;
  }

  @Override
  public String toString() {
    return new StringBuilder().
	  		append("Address[line1=").append(getLine1()).
	  		append(", line2=").append(getLine2()).
	  		append(", line3=").append(getLine3()).
	  		append(", line4=").append(getLine4()).
	  		append(", postcode=").append(getPostcode()).
	  		append("]").toString();
  }
	
}
