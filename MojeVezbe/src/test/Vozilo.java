package test;

public abstract class Vozilo {
	
	private int brojTockova;
	private float duzina;
	private int zapreminaMotora;
	private int trenutnaBrzina;
	private int maxBrzina;
	
	
	public int getBrojTockova() {
		return this.brojTockova;
	}
	public void setBrojTockova(int brojTockova) {
		this.brojTockova=brojTockova;
	}
	
	public float getDuzina() {
		return this.duzina;
	}
	public void setDuzina(float duzina) {
		
			this.duzina=duzina;
	}
	public int getZapreminaMotora() {
		return this.zapreminaMotora;
	}
	public void setZapreminaMotora(int zapreminaMotora) {
		
			this.zapreminaMotora=zapreminaMotora;
	}
	
	public int getTrenutnaBrzina() {
		return this.trenutnaBrzina;
		
	}
	
	public void setTrenutnaBrzina(int trenutnaBrzina) {
		this.trenutnaBrzina=trenutnaBrzina;
	}
	public int getMaxBrzina() {
		return this.maxBrzina;
	}
	public void setMaxBrzina(int maxBrzina) {
		
			this.maxBrzina=maxBrzina;
			
	}
	
	public Vozilo() {
		this.trenutnaBrzina=0;
	}
	
	
	public abstract void gas();
	
	@Override
	public String toString() {
		
		return "Info:\nBrojTockova: "+this.getBrojTockova()+"\nDuzina: "+this.getDuzina()+"\nZapreminaMotora: "+this.getZapreminaMotora()+"\nTrenutnaBrzina: "+this.getTrenutnaBrzina()+"\nMaxBrzina: "+this.getMaxBrzina();  
	}
	

}
