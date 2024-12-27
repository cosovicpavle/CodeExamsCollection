package oop3;

public class Devizni extends Racun {
	
	private double provizija=2;
	
	
	
	@Override
	public void isplata(double iznos) {
		
		super.isplata(iznos+iznos/(100/provizija));
	}

}
