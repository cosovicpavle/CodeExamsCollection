package model;

public class Dinarski extends  Racun {
	
	
	public String tip =  "Dinarski";
	
	public Dinarski(double stanje) {
		super(stanje);
	}
	
	
	
	
		
	@Override
	public String toString() {
		
		return super.toString()+" "+tip;
	}
	
	
	
	
	
	@Override
	public void isplata(double iznos2) {
		
		double provizija=60;
		
		if(this.stanje-iznos2-provizija>=0) {
			this.stanje-=iznos2+provizija;
		if(iznos2>maxIsplata) {
			this.maxIsplata=iznos2;
		}
		return;
		}
		System.out.println("Trazena islplata nije moguca");
	}
	
	
	}


