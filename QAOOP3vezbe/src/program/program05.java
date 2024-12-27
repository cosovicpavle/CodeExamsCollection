package program;




import vezbe.Circle;
import vezbe.Rectangle;
import vezbe.Shape;

public class program05 {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
		Shape[]shapes =  new Shape[2];
		
		shapes[0]= new Circle(2);
		shapes[1]= new Rectangle(2,2);
		
	/*	for(Shape shape:shapes) {
			if(shape instanceof Circle) {
				System.out.println("Area of the Circle: "+shape.getArea());
			}else if(shape instanceof Rectangle){
				System.out.println("Area of the Rectangle: "+shape.getArea());
			}
		}
		
		
	*/
		
		for(Shape shape: shapes) {
			System.out.println(shape);
			
		}
			
			
			
			
			
			
			
			
			
		}
		

	}


