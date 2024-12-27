package model;

public class Racun {

	protected double stanje;
	protected double maxIsplata;

	public Racun(double stanje) {
		this.stanje=stanje;
		this.maxIsplata=0;

	}


	public void uplata(double iznos) {
		if(iznos>0)
			this.stanje+=iznos;

	}

	public void isplata(double iznos2) {
		if(this.stanje-iznos2>=0) {
			this.stanje-=iznos2;
			if(iznos2>maxIsplata) {
				this.maxIsplata=iznos2;
			}
			return;
		}
		System.out.println("Trazena isplata nije moguca");





			


		}

	

			

			



		

		

       public void printMaxIsplata() {
    	   System.out.println("Max isplata sa racuna je: "+maxIsplata);
       }








		public void printStanje() {
			System.out.println("Stanje na racunu: "+this.stanje);
		}

	}
