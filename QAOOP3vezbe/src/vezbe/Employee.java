package vezbe;

public class Employee {
	
	private double salary;
	
	public Employee(double salary) {
		this.salary = salary;
		
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	
	@Override
	public String toString() {
		
		return "Salary: "+this.salary;
		
	}
	
	
	

}
