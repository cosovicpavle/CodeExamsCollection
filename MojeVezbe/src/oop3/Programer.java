package oop3;

public class Programer extends Employee {
	
	private double bonus;
	
	public Programer(double salary,double bonus) {
		super(salary);
		this.bonus=bonus;
		
	}
	
	@Override
	public void display() {
		
		super.display();
		System.out.println("Bonus: "+this.bonus);
	}

	

}
