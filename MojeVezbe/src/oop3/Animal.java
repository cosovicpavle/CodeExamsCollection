package oop3;

public class Animal {
	
	private String name;
	private String sound;
	private int numOfLegs;
	
	
	public Animal(String name,String sound,int numOfLegs) {
		this.name=name;
		this.sound=sound;
		this.numOfLegs=numOfLegs;
		
	}
	
	public String toString() {
		return "Dog info:\nName: "+this.name+"\nSound: "+this.sound+"\nNumer of legs: "+this.numOfLegs;
	}
	
	
	

}
