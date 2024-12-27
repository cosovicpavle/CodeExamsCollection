package vezbe;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Employee {
	
	private String name;
	private int salary;
	
	
	public Employee(String name,int salary) {
		this.name=name;
		this.salary=salary;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		
		return "Name = "+this.name+" Salary = "+this.salary;
	}
	
	public boolean equals(Object o ) {
		if(this==o)
		return true;
		if(o==null || !(o instanceof Employee))
			return false;
		Employee pom = (Employee)o;
		if(this.getSalary()!=pom.getSalary())
			return false;
		
		if(this.getName()!=null ? !this.getName().equals(pom.getName()):pom.getName()!=null )
		return false;
		else
			return true;

		
	}
	/*@Override
	public int hashCode() {
		
		return Objects.hash(this.name,this.salary);
	}
	*/
	
	@Override
	public int hashCode() {
		
		int result=this.name!=null ? this.name.hashCode() : 0;
		result =31*result+this.salary;
		return result;
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee("Marko", 100000);
		Employee e2 = new Employee("Marko", 100000);
		
		
		Set<Employee> employees = new HashSet<Employee>();
		employees.add(e1);
		employees.add(e2);
		
		
		System.out.println(employees);
	}

}
