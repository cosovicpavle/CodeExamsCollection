package model;

public class Rectangle implements IPolygonShape{
	
	private int length;
	private int width;
	
	
		
		
		
	
	

	@Override
	public void calculateArea(int length, int width) {
		
		int area=length*width;
		System.out.println("Area of the Rectangle= "+area);
		
	}
	
	
	public static void main(String []args) {
		IPolygonShape r = new Rectangle();
		
		r.calculateArea(10, 11);
		
		
	}

}
