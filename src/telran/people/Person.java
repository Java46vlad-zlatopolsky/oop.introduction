package telran.people;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person implements Comparable<Person>{
	private long id;
	private int birthYear;
	private String email;
	
	public Person(long id, int birthYear, String email) {
			
		this.id = id;
		this.birthYear = birthYear;
		setEmail(email);
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if (!emailValidator(email)) {
			throw new IllegalArgumentException(String.format(email + " Is not valid email format"));
		}
		this.email = email;
	}
	private static boolean emailValidator(String email) {
		String regex = "^(.+)@(\\S+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
		
	}
	public long getId() {
		return id;
	}
	public int getBirthYear() {
		return birthYear;
	}
	@Override
	public int compareTo(Person o) {
		
		return Long.compare(this.id, o.id);
	}
	
	

}
