package model;

public abstract class Person {
	
	private String name;
	private String gender;
	
	public Person(String name, String gender) {
		this.name=name;
		this.gender=gender;
		
	}
	
	public abstract void work();
	
	public  void setName(String name) {
		this.name=name;
		
	}
	
	@Override
	public String toString() {
		
		return "Name= "+this.name+"\nGender= "+this.gender;
	}

}
