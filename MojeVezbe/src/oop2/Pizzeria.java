package oop2;

public class Pizzeria {
	
	public PizzaSize size;
	
	
	
	
	public Pizzeria(PizzaSize size) {
		this.size=size;
		
	}
	
	public void pizzaOrdering() {
		
		
		switch(size) {
		case SMALL:
			System.out.println("I ordered a small pizza");
			break;
		case MEDIUM:
			System.out.println("I ordered a medium pizza");
			break;
		case LARGE:
			System.out.println("I ordered a large pizaa");
			break;
		case EXTRALARGE:
			System.out.println("I ordered a extralarge pizza");
			break;
			default:
				System.out.println("We dont have pizza that size");
		
		}
	}
	
	public static void main(String []args) {
		Pizzeria p =  new Pizzeria(PizzaSize.LARGE);
		
		p.pizzaOrdering();
	}
	
	

	
	

}
