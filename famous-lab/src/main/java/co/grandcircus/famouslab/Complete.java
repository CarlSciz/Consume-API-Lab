package co.grandcircus.famouslab;

public class Complete implements Comparable<Complete>{

	public String firstName;
	public String lastName;
	public String Innovation;
	public Integer Year;
	
	
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
	public String getInnovation() {
		return Innovation;
	}
	public void setInnovation(String innovation) {
		Innovation = innovation;
	}
	public Integer getYear() {
		return Year;
	}
	public void setYear(Integer year) {
		Year = year;
	}
	@Override
	public String toString() {
		return "Complete [firstName=" + firstName + ", lastName=" + lastName + ", Innovation=" + Innovation + ", Year="
				+ Year + "]";
	}
	
	@Override
	public int compareTo(Complete o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
