package model;

public class Student extends Osoba implements IPolaganje{
	
	@Override
	public void test() {
		
		System.out.print("Student ");
		super.test();
	}
	
	public void testStudent(){
		System.out.println("Student ");
	}

	@Override
	public void testAbstract() {
		System.out.println("Student abstract metoda");
		
	}

	@Override
	public void polaganje() {
		
		
	}
	public void pozdrav() {
		System.out.println("Hi");
	}
	
	

}
