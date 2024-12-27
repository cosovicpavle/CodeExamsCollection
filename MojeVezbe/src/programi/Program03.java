package programi;



import oop3.Circle;
import oop3.Rectangle;
import oop3.Shape;

public class Program03 {

	public static void main(String[] args) {
		
		
		// Circle c =  new Circle(5);
		//Rectangle r = new oop3.Rectangle(3, 4);
		
		
		//Shape[] shapes = {c, r};
		
		
		Shape[] shapes =  new Shape[2];
		shapes[0]= new Circle(5);
		
		shapes[1]=new Rectangle(3, 4);
		
		
		for(Shape shape :shapes) {
			if(shape instanceof Circle) {
				System.out.println("Area of the Circle: "+shape.getArea());
			}else if(shape instanceof Rectangle) {
				System.out.println("Area of the Rectangle: "+shape.getArea());
				
			}
				
		}

	}

}
