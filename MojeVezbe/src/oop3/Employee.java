package oop3;

public class Employee {
	
	
	private double salary;
	
	public Employee(double salary) {
		this.salary=salary;
		
	}
	
	public void display() {
		System.out.println("Employee info:\nSalary: "+this.salary);
	}
	

}
