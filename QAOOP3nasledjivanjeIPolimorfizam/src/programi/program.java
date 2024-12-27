package programi;

import model.Racun;
import model.StedniRacun;

public class program {

	public static void main(String[] args) {
		
		
		Racun r1 = new Racun() ;
		System.out.println(r1);
		//r1.stanje=500;
		System.out.println(r1.getStanje());
		r1.uplata(1000);
		System.out.println(r1.getStanje());
		
		
		StedniRacun r2 =  new StedniRacun();
		System.out.println(r2);
		//System.out.println(r2.getStanje());
		r2.uplata(1000);
		System.out.println(r2.getStanje());
		
		r2.setKamata(5);
		r2.pripisKamate();
		System.out.println(r2.getStanje());
		System.out.println(r2);
		
		r2.uplata(100000);
		System.out.println(r2);
		
		
		Racun r3 = new StedniRacun();
		r3.test();
		
		if(r3 instanceof StedniRacun) {
			((StedniRacun) r3).test2();
		}
		
		

	}

}
