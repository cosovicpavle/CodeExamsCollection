package programi;

import model.Racun;
import model.TipRacuna;

public class Program {

	public static void main(String[] args) {
		
		Racun r1 = new Racun();
		Racun r2 =  new Racun("Intesa", 1000);
		
		System.out.println(r1);
		System.out.println(r2);
		
		Racun r3 = r2;// referentno vezivanje
		
		System.out.println(r3);
		
		r2.setStanje(5000);
		
		System.out.println(r2);
		System.out.println(r3);
		
		Racun r4 = new Racun(r2);  // java konstruktor kopije
		System.out.println(r4);
		
		
		
		System.out.println(r2);
		System.out.println(r4); // nezavisna kopija
		
		System.out.println(r2.equals(r4)); // po onome sto sam ja postavio
		System.out.println(r2==r4);// gleda po referenci
		
		
		Racun.setTip(TipRacuna.DEVIZNI);
		System.out.println(Racun.getTip());
		
		
		
		



	}

}
