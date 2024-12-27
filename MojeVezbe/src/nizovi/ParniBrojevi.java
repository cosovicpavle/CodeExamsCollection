package nizovi;


import java.util.Scanner;

public class ParniBrojevi {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Unesite duzinu niza");
		int l = sc.nextInt();

		int []niz = new int [l];
		System.out.println("Unesite clanove niza: ");
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesite "+(i+1)+" clan niza:");
			niz[i]=sc.nextInt();

		}
		
		System.out.println("Parni brojevi iz niza su: ");
		parniBrojevi(niz);
		
		sc.close();
		
		
		

	}
	
	public static void parniBrojevi(int []niz) {
		for (int i = 0; i < niz.length; i++) {
			if(niz[i]%2==0) {
				System.out.println(niz[i]);
			}
				
			
			
		}
	}
	
	

}


