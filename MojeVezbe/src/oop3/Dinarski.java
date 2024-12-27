package oop3;

public class Dinarski extends Racun {
	
	
	private double provizija=60;
	
	@Override
	public void isplata(double iznos) {
		if(this.getStanje()-iznos-provizija>=0)
		super.isplata(iznos+provizija);
	}
	
	
	

}
