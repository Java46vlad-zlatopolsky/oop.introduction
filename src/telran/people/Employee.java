package telran.people;

public class Employee extends Person {
	
	private int basicSalary;
	
	public Employee(long id, int yearBirth, String email, int basicSalary ) {
		super(id, yearBirth, email);
		setBasicSalary(basicSalary);
	}
	
	public void setBasicSalary(int basicSalary) {
		if (basicSalary > 0) {
			this.basicSalary = basicSalary;
		}
	}
	
	public int computePay(int basicSalary, int parameter1, int parameter2) {
		int pay = basicSalary + parameter1 + parameter2;
		return pay;
	}
	

	
	

}
