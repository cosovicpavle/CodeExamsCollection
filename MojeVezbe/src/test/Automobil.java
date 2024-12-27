package test;

public class Automobil extends Vozilo implements PutnickoVozilo{
	
	

	public Automobil() {
		super.setBrojTockova(4);
	}
	@Override
	public void setZapreminaMotora(int zapreminaMotora) {
		if(zapreminaMotora<1000)
			super.setZapreminaMotora(1000);
		if(zapreminaMotora>5000) {
			super.setZapreminaMotora(5000);;
		}
		else
			super.setZapreminaMotora(zapreminaMotora);
	}
	
	
	@Override
	public void setDuzina(float duzina) {
		if(duzina>5)
		super.setDuzina(5);
		else
			super.setDuzina(duzina);
	}
	
	public void setMaxBrzina(int maxBrzina) {
		if(maxBrzina<250)
		super.setMaxBrzina(maxBrzina);
		else
			super.setMaxBrzina(250);
	}
	

	@Override
	public void gas() {
		if(getZapreminaMotora()<2000) {
			setMaxBrzina(getTrenutnaBrzina()+10);
			setTrenutnaBrzina(getTrenutnaBrzina()+10);
			
			
			 if(getTrenutnaBrzina()>getMaxBrzina()) {
				 setTrenutnaBrzina(getTrenutnaBrzina()-10);
				 
				 
				 
				 
			 }
				
			
				
		}else  {
			setMaxBrzina(getTrenutnaBrzina()+20);
			setTrenutnaBrzina(getTrenutnaBrzina()+20);
			if(getTrenutnaBrzina()>getMaxBrzina()) {
				setTrenutnaBrzina(getTrenutnaBrzina()-20);
				
				
				
				
				
			}
		}
			
		
				
			
		

	

	}
	
	@Override
	public void setBrojTockova(int brojTockova) {
		
		if(brojTockova<=4)
			super.setBrojTockova(4);
		else
			super.setBrojTockova(4);
		
	}
	@Override
	public int brojSedista() {
		
		return 5;
	}
	
	@Override
	public String toString() {
		
		return "Automobil "+super.toString()+"\nBrojSedista: "+this.brojSedista();
	}
}


