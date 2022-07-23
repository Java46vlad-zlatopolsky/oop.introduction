package telran.people;

import java.util.Arrays;

public class CompanySortedArray extends CompanyArray { 
	
	
	@Override
	public boolean addEmployee(Employee empl) { 
		
		long id = empl.getId();
		int index = getEmployeeIndex(id);
		if (index < 0) {
		index = -(index + 1);
		Employee [] newEmplArr = new Employee [employees.length + 1];
		System.arraycopy(employees, 0, newEmplArr, 0, index);
		newEmplArr [index] = empl;
		System.arraycopy(employees, index, newEmplArr, index + 1, employees.length - index);
		employees = newEmplArr;
		return true;
		}
		
		return false;
		}

	@Override
	protected int getEmployeeIndex(long id) {
		
		Person person1 = new Person(id, 0, null); 
		return Arrays.binarySearch(employees, person1);
		
	}

	@Override
	public Employee[] getAllEmployees() {
		return Arrays.copyOf(employees, employees.length);
	}
}
