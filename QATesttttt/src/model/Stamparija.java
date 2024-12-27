package model;

import java.util.ArrayList;
import java.util.List;

public class Stamparija {
	
	private List<Trafika>trafike = new ArrayList<Trafika>();
	
	
	
	public void dodajTrafiku(Trafika trafika) {
		
		trafike.add(trafika);
		
	}
	
	public void stampajOglas(String tekst) {
		for (Trafika trafika : trafike) {
			System.out.println(trafika+tekst);
			
		}
	}

}
