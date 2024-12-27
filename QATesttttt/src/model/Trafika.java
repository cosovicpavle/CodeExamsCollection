package model;

public class Trafika {
	
	private String name;
	
	public Trafika(String name){
		this.name=name;
		
	}
	
	
	@Override
	public String toString() {
		
		return this.name+" : ";
	}

}
