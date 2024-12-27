package model;

public class Rectangle2 implements IPolygon {

	@Override
	public double getArea() {
		double a = 5, b= 6;
		return a*b;
	}
	

	@Override
	public void getSides() {
		System.out.println("I have four sides");
		
	}
	
	

}
