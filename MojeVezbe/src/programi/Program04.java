package programi;

import oop3.Dinarski;

public class Program04 {

	public static void main(String[] args) {
		Dinarski d =  new Dinarski();
		
	
		
		System.out.println(d.getStanje());

		d.isplata(1);
		System.out.println(d.getStanje());

	}

}
