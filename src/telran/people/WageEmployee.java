package telran.people;

public class WageEmployee extends Employee {
	
	private int wage;
	private int hours;

	public WageEmployee(long id, int yearBirth, String email, int basicSalary,int wage, int hours) { // wage - salary per 1 hour
		super(id, yearBirth, email, basicSalary);
		setWage(wage);
		setHours(hours);
	}
	

	
	private void setWage(int wage) {
		this.wage = wage;
	}
	
	private void setHours(int hours) {
		this.hours = hours;
	}
	
	@Override
	public int computePay(int basicSalary, int wage, int hours) {
		int pay = basicSalary + (wage * hours);
		return pay;
	}
	

}
