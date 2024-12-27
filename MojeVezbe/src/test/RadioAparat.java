package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RadioAparat {

	private int jacinaTona;
	private String trenutnaStanica;
	private static final List<String>radioStanice=new ArrayList<String>(Arrays.asList("SuperFM","202","StudioB","RadioS","RockRadio"));
	private boolean ukljucen;

	public RadioAparat() {
		this.jacinaTona=0;
		this.trenutnaStanica="undefined";
		this.ukljucen=false;
	}



	public boolean ukljuci() {
		return this.ukljucen=true;
	}


	public boolean iskljuci() {
		return this.ukljucen=false;
	}

	public boolean daLiJeUkljucen() {
		if(this.ukljucen==true)
			return true;
		else
			return false;
	}

	public void pojacajTon() {
		if(this.ukljucen)
			if(this.jacinaTona<50)
				jacinaTona++;
	}
	public void smanjiTon() {
		if(this.ukljucen)
			if(this.jacinaTona>0)
				jacinaTona--;
	}


	public void promeniStanicu(String novaStanica)throws PogresnaStanicaException {
		if(radioStanice.contains(novaStanica)) {
			this.trenutnaStanica=novaStanica;
		}else {
				this.trenutnaStanica="undefined";
				throw new PogresnaStanicaException("Radio stanica ne postoji");
			}
				
			
		}
	
	public void ispisiParametre() {
		System.out.println("Info: ");
		System.out.println("-----------");
		System.out.print("ON/OFF status: ");
		if(daLiJeUkljucen()) {
			
			System.out.println("ON");
			
			System.out.println("Current Station: "+this.trenutnaStanica);
			System.out.println("Tone volume: "+this.jacinaTona);
		}else
			System.out.println("OFF");
		
		
	}
		
		 
		
		



	}


