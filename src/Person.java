import java.util.Date;

public class Person {

	private String lastname;
	private String firstname;
	private Date birthdate;
	
	
	public Person(String lastname, String firstname, Date birthdate) {
		this.lastname = lastname;
		this.firstname = firstname;
		this.birthdate = birthdate;
	}
	public Person(String lastname, String firstname) {
		this.lastname = lastname;
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	
}
