package vezbe;

public class Animal {
	
	public String name;
	public String sound;
	public int numOdLegs;
	
	
	public Animal(String name, String sound,int numOfLegs) {
		this.name=name;
		this.sound=sound;
		this.numOdLegs=numOfLegs;
		
	}
	
	@Override
	public String toString() {
		return "Animal info:\nName: "+this.name+"\nSound: "+this.sound+"\nNumber of legs: "+this.numOdLegs;
	}

}
