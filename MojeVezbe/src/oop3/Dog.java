package oop3;

public class Dog extends Animal{
	
	
	private String color;
	private String breed;

	public Dog(String name, String sound, int numOfLegs,String color,String breed) {
		super(name, sound, numOfLegs);
		this.color=color;
		this.breed=breed;
		
	}
	
	@Override
	public String toString() {
		
		return super.toString()+"\nColor: "+this.color+"\nBreed: "+this.breed;
	}

}
