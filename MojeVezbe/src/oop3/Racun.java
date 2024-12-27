package oop3;

public class Racun {
	
	
	private double stanje;
	
	public Racun() {
		stanje=2000;
	}
	
	
	public void uplata(double iznos) {
		if(iznos>0)
		this.stanje+=iznos;
	}
	
	
	public void isplata(double iznos) {
		if(this.stanje-iznos>=0)
		this.stanje-=iznos;
		
	}
	
	public double getStanje() {
		return this.stanje;
	}

}
