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
	  result = 37 * result + (line1 != null ? line1.hashCode() : 0);
	  result = 37 * result + (line2 != null ? line2.hashCode() : 0);
	  result = 37 * result + (line3 != null ? line3.hashCode() : 0);
	  result = 37 * result + (line4 != null ? line4.hashCode() : 0);
	  result = 37 * result + (postcode != null ? postcode.hashCode() : 0);
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Address))
      return false;
    
    Address other = (Address)obj;
    
    if (this.line1 == null && other.line1 != null ||
        this.line1 != null && (other.line1 == null || !this.line1.equals(other.line1)))
      return false;
    
    if (this.line2 == null && other.line2 != null ||
        this.line2 != null && (other.line2 == null || !this.line2.equals(other.line2)))
      return false;
    
    if (this.line3 == null && other.line3 != null ||
        this.line3 != null && (other.line3 == null || !this.line3.equals(other.line3)))
      return false;
    
    if (this.line4 == null && other.line4 != null ||
        this.line4 != null && (other.line4 == null || !this.line4.equals(other.line4)))
      return false;
    
    if (this.postcode == null && other.postcode != null ||
        this.postcode != null && (other.postcode == null || !this.postcode.equals(other.postcode)))
      return false;
    
    return true;
  }

  @Override
  public String toString() {
    return new StringBuilder().
	  		append("Address[line1=").append(line1).
	  		append(", line2=").append(line2).
	  		append(", line3=").append(line3).
	  		append(", line4=").append(line4).
	  		append(", postcode=").append(postcode).
	  		append("]").toString();
  }
	
}
