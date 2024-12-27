package model;

public class Employee extends Person {
	
	private int empld;
	
	public Employee(String name, String gender,int empld) {
		super(name, gender);
		this.empld=empld;
		
	}

	

	@Override
	public void work() {
		if(this.empld>0)
			System.out.println("Zaposlen je");
		else
			System.out.println("Nije zaposlen");
			
		
		
	}

}
