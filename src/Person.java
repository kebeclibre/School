import java.util.Date;

abstract class Person implements Comparable<Person>{

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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthdate == null) ? 0 : birthdate.hashCode());
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (birthdate == null) {
			if (other.birthdate != null)
				return false;
		} else if (!birthdate.equals(other.birthdate))
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		return true;
	}
	
	public int compareTo(Person p) {
		if (null != this.getBirthdate() && null != p.getBirthdate()){
			return this.getBirthdate().compareTo(p.getBirthdate());
		
		} else if (null == this.getBirthdate()) { return -1; 
		
		} else if (null == p.getBirthdate()) { return 1; 
		
		} else if ( 0 == this.getLastname().compareTo(p.getLastname())) {
			return this.getFirstname().compareTo(p.getFirstname());
		
		} else { return this.getLastname().compareTo(p.getLastname());}
	
	}
	
	
	
	@Override
	public String toString() {
		return "Person [lastname=" + lastname + ", firstname=" + firstname + ", birthdate=" + birthdate + "]";
	}
	
	
	
}
