package model;

public class StedniRacun extends Racun {
	
	private float kamata;
	
	public void setKamata(float kamata) {
		this.kamata=kamata;
	}
	
	public void pripisKamate() {
		// this.setStanje(this.getStanje()+this.getStanje()/(100/kamata));
			this.uplata(this.getStanje()/(100/kamata));
	}
	
	public StedniRacun() {
		super(1000);
		this.kamata=10;
	}
	
	@Override
	public String toString() {
		
		return "Stedni "+super.toString();
	}
	
	@Override
	public void uplata(float iznos) {
		if(iznos>=50000)
		super.uplata(iznos);
	}
	
	public void test2() {
		
	}
	

}
