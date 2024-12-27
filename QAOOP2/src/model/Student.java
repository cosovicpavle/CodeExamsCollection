package model;

public class Student {
	
	public String ime;
	public String Prezime;
	public double prosek;
	public static Tip tip;
	
	public Student(String ime, String Prezime, double prosek) {
		this.ime = ime;
		this.Prezime =Prezime;
		this.prosek = prosek;
		
	}
	
	
	
	@Override
	public String toString() {
		return "Student info:\nIme : "+this.ime+"\nPrezime: "+this.Prezime+"\nProsek: "+this.prosek+"\nTip Finansiranja: "+Student.tip;
	}
	
	
	
	

}
