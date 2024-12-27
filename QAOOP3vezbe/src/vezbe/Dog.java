package vezbe;

public class Dog extends Animal {
	
	public String color;
	public String breed;
	
	
	public Dog(String color,String breed,String name,String sound,int numOfLegs) {
		super(name, sound, numOfLegs);
		this.color=color;
		this.breed=breed;
		
		
	}
	
	@Override
	public String toString() {
		
		return super.toString()+"\nColor: "+this.color+"\nBreed: "+this.breed;
	}
	

}
