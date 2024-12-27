package model;

public class Dog extends Animal {

	@Override
	public void makeSound() {
		
		 System.out.println("AV AV AV");;
	}
	
	public static void main(String []args) {
		Dog d =  new Dog();
		
		d.eat();
		d.makeSound();
	}
	

}
