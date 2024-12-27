package vezbe;

public class Chocolate {
	
	public String name;
	public int size;
	
	
	public Chocolate(String name,int size) {
		this.name=name;
		this.size=size;
		
	}
	
	@Override
	public String toString() {
		
		return "Chocolate name: "+this.name+" Chocolate size: "+this.size;
	}

}
