package vezbe;

public class Professor extends Person{
	
	public int workExp;

	public Professor(String name, int age,int workExp) {
		super(name, age);
		this.workExp=workExp;
		
	}
	
	@Override
	public String toString() {
		
		return "Professor info: Name: "+this.name+" Age: "+this.age+" WorkExp: "+this.workExp;
	}

}
