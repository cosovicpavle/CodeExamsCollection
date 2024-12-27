package model;

public class Pizzeria {
	
	
	public PizzaSize size;
	
	
	public Pizzeria(PizzaSize size) {
		this.size=size;
		
	}
	
	
	public void pizzaOrdering() {
		switch( size) {
		case SMALL:
			System.out.println("I ordered a small pizza");
			break;
		case MEDIUM:
			System.out.println("I ordered a medium pizza");
		
			break;
		case LARGE:
			System.out.println("I ordered a larger pizza");
		case EXTRALARGE:
			System.out.println("I ordered a extra large pizza");
			break;
			default:
				System.out.println("I dont know what to order");
		}
		
	}

}
