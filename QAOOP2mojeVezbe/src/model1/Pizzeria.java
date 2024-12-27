package model1;

public class Pizzeria {
	
	
	public PizzaSize size;
	
	public Pizzeria (PizzaSize size) {
		this.size=size;
	}
	
	
	public void pizzaOrdering() {
		switch(this.size) {
		case SMALL:
			System.out.println("I am ordering a small pizza");
			break;
		case MEDIUM:
			System.out.println("I am ordering a medium pizza");
			break;
		case LARGE:
			System.out.println("I am ordering a large pizza");
			break;
		case EXTRALARGE:
			System.out.println("I am ordering a extralarge pizza");
			break;
			default:
				System.out.println("We dont have that size of pizza");
		}
	}

}
