package vezbanje;

public class BrojReci {

	public static void main(String[] args) {
		
		String recenica = "Pluton je najdalja, najhlanija i najmanja planeta Suncevog sistema";
		
		
				
				System.out.println(recenica);
				String []nizreci =recenica.split(" "); // (\\s+)
				
				System.out.println("Broj reci u recenici je : "+nizreci.length);
				
				
	}

}

