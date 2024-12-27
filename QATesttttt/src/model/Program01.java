package model;

public class Program01 {

	public static void main(String[] args) {
		
		
		Stamparija s = new Stamparija();
		
		
		Trafika t1 =  new Trafika("7 jul");
		Trafika t2 = new Trafika("Gala");
		
		
		s.dodajTrafiku(t1);
		
		s.dodajTrafiku(t2);
		
		s.stampajOglas("Prodaje se auto");

	}

}
