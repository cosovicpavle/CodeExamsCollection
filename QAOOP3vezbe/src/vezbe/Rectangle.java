package vezbe;

public class Rectangle extends Shape {
	
	private double a;
	private double b;
	
	
	public Rectangle(double a,double b) {
		this.a=a;
		this.b=b;
		
	}
	
	
	@Override
	public double getArea() {
		
		return a*b;
	}
	
	@Override
	public String toString() {
		
		return "Area of the Rectangle: "+getArea();
	}

}
