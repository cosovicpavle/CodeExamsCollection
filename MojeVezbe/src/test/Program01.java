package test;

import java.util.ArrayList;

import java.util.List;

public class Program01 {
	
	public static void main(String[] args) {
		
		
		Automobil automobil1 = new Automobil();
		Autobus autobus1 = new Autobus();
		Kamion  kamion1 = new Kamion(8, 10, 8000, 130, 250);
		autobus1.setBrojTockova(3);
		autobus1.setDuzina(12);
		autobus1.setTrenutnaBrzina(150);
		autobus1.setZapreminaMotora(3500);
		
		automobil1.setDuzina(5);
		automobil1.setTrenutnaBrzina(220);
		automobil1.setZapreminaMotora(2500);
		
	
		
		List<Vozilo>v1 = new ArrayList<Vozilo>();
		v1.add(automobil1);
		v1.add(kamion1);
		v1.add(autobus1);
		
		
		
		
		for (Vozilo vozilo : v1) {
			int random=random();
			
			for (int i = 0; i < random; i++) {
				vozilo.gas();
			}
			
			
			
		}
		
		ispis(v1);
		
		
		
		
			
			 
			
			 
			
				
				
			
			
			
			
			
		}
	
	
	
	public static int random() {
		int min=1;
		int max=5;
		
		int random= min+(int)(Math.random()*((max-min)+1));
		
		return random;
		
	}
	
	public static void ispis(List<Vozilo>v) {
		
		for (Vozilo vozilo : v) {
			System.out.println(vozilo);
			System.out.println("///////////");
			
		}
		
			
		
	}
		
		
	
	
	
		
		
		
		
	}
	
	
		
		
		
		
	


