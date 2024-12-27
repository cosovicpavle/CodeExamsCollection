package vezbe;

public class Programmer extends Employee{
	
	private double bonus;
	
	
	public Programmer(double salary,double bonus) {
		super(salary);
		this.bonus=bonus;
		
	}
	
	public double getBonus() {
		return this.bonus;
		
	}

	
	
	

}
