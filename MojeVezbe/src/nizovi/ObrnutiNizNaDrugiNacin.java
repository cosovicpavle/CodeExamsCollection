package nizovi;

import java.util.Scanner;

public class ObrnutiNizNaDrugiNacin {

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
		
		System.out.println("Ispis unetog niza: ");
		ispisNiza(niz);
		
		obrnutiNiz(niz);
		
		System.out.println("Ispis obrnutog niza: ");
		ispisNiza(niz);
		
		sc.close();
		
		

	}
	
	public static void obrnutiNiz(int []niz) {
		
		int duzina=niz.length;
		for (int i = 0; i < duzina/2; i++) {
			int temp=niz[i];
			niz[i]=niz[duzina-i-1];
			niz[duzina-i-1]=temp;
			
			
		}
		
	}
	
	public static void ispisNiza(int[]niz) {
		System.out.print("niz= {");
		for (int i = 0; i < niz.length; i++) {
			String nastavak = i!=niz.length-1 ? "," : "";
			System.out.print(niz[i]+nastavak);
			
		}
		System.out.println("}");
		
	}

}
