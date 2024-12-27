package program;

import model.D;
import model.IC;
import model.M;

public class Program {

	public static void main(String[] args) {
		System.out.println("Ispis metoda interfejsa IC");
		
		
		IC c =  new M();
		
		c.a();
		c.b();
		c.c();
		c.d();
		
		System.out.println();
		
		
		System.out.println("Ispis metoda klase M");
		
		M m =  new M();
		
		m.a();
		m.b();
		m.c();
		m.d();
		m.x();
		m.y();
		
		
		
		
		

	}

}
