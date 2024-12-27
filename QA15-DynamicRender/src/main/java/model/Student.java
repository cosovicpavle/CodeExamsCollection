package model;

public class Student {
	private String ime;
	private String prezime;
	private double prosek;
	
	
	
	
	public Student(String ime, String prezime, double prosek) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.prosek = prosek;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getRezime() {
		return prezime;
	}
	public void setRezime(String rezime) {
		this.prezime = rezime;
	}
	public double getProsek() {
		return prosek;
	}
	public void setProsek(double prosek) {
		this.prosek = prosek;
	}
	@Override
	public String toString() {
		return "Student [ime=" + ime + ", rezime=" + prezime + ", prosek=" + prosek + "]";
	}
	public Student() {
		super();
		
	}
	
	
	
	
	

}
