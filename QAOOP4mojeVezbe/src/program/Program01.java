package program;

import model.IOpstina;
import model.IOstali;
import model.IPolicija;
import model.Osoba;

public class Program01 {

	public static void main(String[] args) {
		
		IPolicija policija = new Osoba();
		
		policija.getBrLicneKarte();
		policija.setBrVozackeDozvole(0);
		policija.getBrVozackeDozvole();
		policija.getIme();
		policija.getPrezime();
		
		IOpstina opstina = new Osoba();
		opstina.getBrLicneKarte();
		opstina.getBrVozackeDozvole();
		opstina.setBrLicneKarte(0);
		opstina.setIme(null);
		opstina.setPrezime(null);
		opstina.getIme();
		opstina.getPrezime();
		
		IOstali ostali = new Osoba();
		
		ostali.getBrLicneKarte();
		ostali.getBrVozackeDozvole();
		ostali.getIme();
		ostali.getPrezime();
		
		

	}

}
