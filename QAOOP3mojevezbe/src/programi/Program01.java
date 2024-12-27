package programi;

import model.Devizni;
import model.Dinarski;

public class Program01 {

	public static void main(String[] args) {
		
		Dinarski dinarski = new Dinarski(100000);
		
		Devizni devizni =  new Devizni(500);
		
		
		
		System.out.println("------Dinarski Racun-------");
		
		
		dinarski.printStanje();
		dinarski.uplata(20000);
		dinarski.printStanje();
		dinarski.isplata(90000);
		dinarski.printStanje();
		dinarski.isplata(35000);
		dinarski.printStanje();
		dinarski.uplata(25000);
		dinarski.printStanje();
		dinarski.printMaxIsplata();
		
		
		System.out.println();
		
		
		System.out.println("---------Devizni Racun--------");
		devizni.printStanje();
		devizni.uplata(100);
		devizni.printStanje();
		devizni.isplata(400);
		devizni.printStanje();
		devizni.isplata(300);
		devizni.printStanje();
		devizni.uplata(300);
		devizni.printStanje();
		devizni.printMaxIsplata();
		
		
		
		
		
		
		
		
		
		
        
        
        
        

	}

}
