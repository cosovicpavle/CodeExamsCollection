package model;

public class Racun {

	public String naziv;
	private float stanje;
	
	
	public Racun(){
		this.stanje=0;
	}
	
	public Racun(float stanje){
		this.stanje=stanje;
		
	}


	public float getStanje() {
		return this.stanje;

	}
/*
	public void setStanje(float stanje) {
		if(stanje>0)
			this.stanje=stanje;
	}
*/

	public void uplata(float iznos) {
		if(iznos>0) {
			this.stanje+=iznos;
		}
	}

	@Override
	public String toString() {
		return "Racun [naziv=" + naziv + ", stanje=" + stanje + "]";
	}
	
	public void test() {
		
	}
	
	




}
