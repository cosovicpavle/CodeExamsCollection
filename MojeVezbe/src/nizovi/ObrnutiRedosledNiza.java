package nizovi;

import java.util.Scanner;

public class ObrnutiRedosledNiza {

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
		
		System.out.println("Obrnuti niz");
		
		obrnutiNiz(niz);
		
		sc.close();

}
	
	
	public static void obrnutiNiz(int []niz) {
		
		for (int i =niz.length-1;i>=0; i--) {
			System.out.println(niz[i]);
			
		}
		
		
		
		
		
	}
}
