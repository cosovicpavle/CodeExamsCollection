package exceptionsAndFiles;

public class Artikal {
	
	
	private String naziv;
	private double cena;
	
	
	Artikal(String naziv,double cena){
		this.naziv=naziv;
		this.cena=cena;
		
		
	}
	
	public double getCena() {
		return this.cena;
		
	}
	
	public String getNaziv() {
		return this.naziv;
	}
		
	

}
