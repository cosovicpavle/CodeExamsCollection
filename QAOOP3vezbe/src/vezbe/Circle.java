package vezbe;

public class Circle extends Shape {
	
	private double r ;
	
	public Circle(double r) {
		this.r=r;
		
	}
	
	@Override
	public double getArea() {
		
		return r*r*Math.PI;
	}
	
	@Override
	public String toString() {
		
		return "Area of the Cirlce: "+getArea();
	}
	
	
	
	
		
	}


