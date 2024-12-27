package test;

public class TestRadio {

	public static void main(String[] args) {
		RadioAparat r1 = new RadioAparat();
		
		r1.ispisiParametre();
		r1.ukljuci();
		r1.ispisiParametre();
		
		r1.pojacajTon();
		try {
			r1.promeniStanicu("radioFM");
		} catch (PogresnaStanicaException e) {
			
			System.out.println(e.getMessage());
		}
		
		r1.ispisiParametre();
		
		try {
			r1.promeniStanicu("SuperFM");
		} catch (PogresnaStanicaException e) {
			
			System.out.println(e.getMessage());
		}
		
		r1.pojacajTon();
		r1.pojacajTon();
		r1.pojacajTon();
		r1.pojacajTon();
		
		r1.ispisiParametre();
		
		r1.smanjiTon();
		
		
		r1.ispisiParametre();
		
		r1.iskljuci();
		
		r1.ispisiParametre();

	}

}
