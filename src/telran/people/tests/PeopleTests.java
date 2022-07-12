package telran.people.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.people.Employee;
import telran.people.Person;
import telran.people.WageEmployee;
import telran.people.SalesPerson;

class PeopleTests {
	
	

	@Test
	void TestPerson() {
		long id = 123456789;
		int birthYear = 1991;
		String email = "person1@mail.com";
		
		Person person1 = new Person (id, birthYear, email);
		assertEquals(email, person1.getEmail());
		assertEquals(id, person1.getId());
		assertEquals(birthYear, person1.getBirthYear());
				
	}
	@Test
	void TestEmployee() {
		long id = 0000001112;
		int birthYear = 1992;
		String email = "employee1@mail.com";
		int basicSalary = 4800;
		Employee employee2 = new Employee(id, birthYear, email, basicSalary);
		assertEquals(basicSalary, employee2.computePay(basicSalary, 0, 0));
	}
	
	@Test
	void TestWageEmployee() {
		long id = 123456789;
		int birthYear = 1993;
		String email = "wageEmployee1@mail.com";
		int basicSalary = 4800;
		int hours = 50;
		int wage = 48;
		WageEmployee we1 = new WageEmployee(id, birthYear, email, basicSalary, wage, hours);
		assertEquals(7200, we1.computePay(basicSalary, wage, hours));
	}
	
	@Test
	void SalesPerson() {
		long id = 123456789;
		int birthYear = 1993;
		String email = "wageEmployee1@mail.com";
		int basicSalary = 4800;
		int sales = 12000;
		int percentPay = 15;
		SalesPerson sp1 = new telran.people.SalesPerson(id, birthYear, email, basicSalary, sales, percentPay);
		assertEquals(6600, sp1.computePay(basicSalary, sales, percentPay));
	}

}
