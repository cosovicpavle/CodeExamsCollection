package program;

import model.Employee;
import model.Person;

public class Program01 {
	
	public static void main(String []args) {
		
		
		
	Person student = new Employee("Marko", "male", 0);
	Person employee = new Employee("Marina", "female", 15);
	
	student.work();
	employee.work();
	
	employee.setName("Nikolina");
	System.out.println(employee);
	
	
		
		
		
		
	}

}
