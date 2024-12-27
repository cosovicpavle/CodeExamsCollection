package vezbanjenizovi;

import java.util.Scanner;

public class ObrnutiRedosled {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite velicinu niza");
		int n = sc.nextInt();

		int []niz = new int [n];
		System.out.println("Unesite clanove niza");
		System.out.println("--------------------");
		for (int i = 0; i < niz.length; i++) {
			System.out.print("Unesite "+(i+1)+" clan niza: ");
			niz [i]=sc.nextInt();

		}
		System.out.println("Ispis unetog niza");
		ispisNiza(niz);
		
		
		
		System.out.println("Ispis obrnutog niza");
		obrnutiNiz(niz);
		sc.close();
		

	}
	public static void ispisNiza(int[]niz) {
		System.out.print("niz= {");
		for (int i = 0; i < niz.length; i++) {
			String nastavak =i!=niz.length-1 ? "," : "";
			System.out.print(niz[i]+nastavak);


		}
		System.out.println("}");
	}
	public static void obrnutiNiz(int[]niz) {
		System.out.print("niz = {");
		for (int i = niz.length-1; i>=0; i--) {
			String nastavak = i!=0 ? "," : "";
			System.out.print(niz[i]+nastavak);
			
			
			
		}
		System.out.println("}");
	}

}
