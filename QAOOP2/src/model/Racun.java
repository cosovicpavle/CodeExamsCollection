package model;

public class Racun {
	
	public  String nazivBanke ;
	private  int stanjeRacuna;
	
	private static TipRacuna tip=TipRacuna.DEVIZNI;
	
	public final float konstanta = 3.14f;
	
	public static TipRacuna getTip() {
		return tip;
		
		
		
	}
	
	
	public static void setTip(TipRacuna tip) {
		Racun.tip = tip;
	}


	public Racun(){
		
		
	}
	
	public Racun(Racun r) {   // java konstruktor kopije
		this.nazivBanke = r.nazivBanke;
		this.stanjeRacuna =  r.stanjeRacuna;
	}
	
	public Racun (String nazivBanke, int stanjeRacuna) {
		this.nazivBanke=nazivBanke;
		this.stanjeRacuna=stanjeRacuna;
		
		
		
		
	}
	
	
	@Override
	public  String toString() {
		return "Bank info:\nNazivBanke: "+nazivBanke+"\nStanje na racunu: "+stanjeRacuna;
	}
	
	public void setStanje(int stanje) {
		if(stanje>0) {
		this.stanjeRacuna=stanje;
		}else {
			System.out.println("Stanje ne moze biti u minusu");
		}
	}
	
	public boolean equals(Object obj) {
		if(obj == this)
			return true;
		if(obj ==null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		Racun pom = (Racun)obj;
		 
		if(nazivBanke.equals(pom.nazivBanke) && stanjeRacuna==pom.stanjeRacuna)
			return true;
		else
		return false;
			
			
		
	}

}
