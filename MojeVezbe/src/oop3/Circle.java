package oop3;

public class Circle extends Shape {
	
	private double r;
	
	
	public Circle(double r){
		this.r=r;
		
	}
	
	
	@Override
	public double getArea() {
		
		return this.r*this.r*Math.PI;
	}

}
