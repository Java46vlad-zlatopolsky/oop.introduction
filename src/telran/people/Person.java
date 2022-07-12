package telran.people;

public class Person {
	
	private static long id;
	private static int yearBirth;
	private static String email;

	public Person (long id, int yearBirth, String email) {
		setEmail(email);
		this.yearBirth = yearBirth;
		this.id = id;
	}
	
	
	
	public void setEmail(String email) {
		if (email != null) {
			this.email = email;
		}
	}
	
	public long getId() {
		return id;
	}
	
	public int getBirthYear() {
		return yearBirth;
	}
	
	public static String getEmail() {
		return email;
	}
}
