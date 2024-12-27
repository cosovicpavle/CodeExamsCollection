package oop1predavanje;

import model.Racun;

public class Program01 {

	public static void main(String[] args) {
		System.out.println("TestOOP1");
		
		Racun r1 =new Racun();
		System.out.println(r1.toString());
		
		Racun r2 =  new Racun();
		System.out.println(r2.toString());
		
		r1.brojRacuna=1;
		r1.setStanje(1000);
		System.out.println("Racun broj "+r1.brojRacuna+" = "+r1.getStanje()+"RSD");
		System.out.println("Racun broj "+r2.brojRacuna+" = "+r2.getStanje()+"RSD");
		r2.setStanje(-50000);
		ispis(r1);
		ispis(r2);
		
		r1.uplata(-500);
		ispis(r1);

	}
	public static void ispis(Racun r) {
		System.out.println("Racun broj "+r.brojRacuna+" = "+r.getStanje()+"RSD");
	}

}
