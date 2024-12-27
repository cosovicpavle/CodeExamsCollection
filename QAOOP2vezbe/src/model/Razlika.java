package model;

public class Razlika {
	
	
	public static void display() {
		System.out.println("ispis preko staticke metode");
	}
	
	public void show() {
		System.out.println("Ispis preko licne metode");
	}
	
	public static void main (String []args) {
		Razlika r = new Razlika();
		
		r.show();
		display();
		
	
	}

}
