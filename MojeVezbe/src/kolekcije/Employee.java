package kolekcije;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Employee {
	
	private String name;
	private int salary;
	
	
	public Employee(String name,int salary){
		
		this.name=name;
		this.salary=salary;
		
	}
	
	
	@Override
	public String toString() {
		
		return "Name: "+this.name+" Salary: "+this.salary;
		
	}
	
	@Override
	public boolean equals(Object o) {
		if(o==this)
			return true;
		if(o==null || this.getClass()!=o.getClass())
			return false;
		Employee pom = (Employee)o;
		
		if(this.salary!=pom.salary)
			return false;
		
		if(this.name!=null ? !this.name.equals(pom.name): pom.name!=null  )
		return false;
		else
			return true;
		
		
		
		
		
	}
	@Override
	public int hashCode() {
		int result = this.name!=null ? this.name.hashCode() : 0 ;
		result = 31*result+this.salary;
		return result;
		
		
	}
	
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("Marko", 50000);
		Employee e2 = new Employee("Marko", 50000);
		
		
		
		Set<Employee> employees = new HashSet<Employee>();
		employees.add(e1);
		employees.add(e2);
		
		System.out.println(employees);
		
		
		
		
		
	}
	
	

}
