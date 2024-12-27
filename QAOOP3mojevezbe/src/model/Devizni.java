package model;

public class Devizni extends Racun{
	
	public String tip ="Devizni";
	
	
	
	public final double kurs= 116.5;
	
	
	public Devizni(double stanje) {
		super(stanje);
	}
	
	
	@Override
	public String toString() {
		
		return super.toString()+" kurs= "+kurs+" "+tip;
	}
	
	@Override
	public void isplata(double iznos2) {
		
		double provizija=2;
		
		if(this.stanje-iznos2-iznos2/(100/provizija)>=0) {
			this.stanje-=iznos2+iznos2/(100/provizija);
			if(iznos2>maxIsplata) {
				this.maxIsplata=iznos2;
			}
			return;
		}
		System.out.println("Trazena isplata nije moguca");
		
		
		
		
	}
	
	
	}


