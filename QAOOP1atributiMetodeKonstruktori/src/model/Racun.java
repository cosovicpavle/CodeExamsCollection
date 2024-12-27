package model;



public class Racun {
	// atributi
	public int brojRacuna;
	private int stanje;
	
	// get i set metode
	public int getStanje() {
		//zastisi prikaz stanja sa unosom pina 
	/*	Scanner sc = new Scanner(System.in);
		int[]tacanpin = {1,2,3,4};
		int[]pin = new int [4];
		System.out.println("Uneti pin");
		for (int i = 0; i < pin.length; i++) {
			pin[i]=sc.nextInt();
			
		}
		if() {
			
		}
		*/
		
		
		
		
		return stanje;
	}
	
	public void setStanje(int stanje) {
		if(stanje>=0)
		this.stanje = stanje;
	
	}
	
	// licne metode
	public void uplata(int iznos) {
		if(iznos>0) 
		stanje+=iznos;
		else {
			System.out.println("Pogresan iznos za uplatu");
		}
	}

}
