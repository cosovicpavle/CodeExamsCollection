package model;

public interface IPolygon {
	
	double getArea();
	
	default void getSides() {
		System.out.println("I can get sides of a polygon");
	}

}
