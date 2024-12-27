package vezbanje;

import java.util.Scanner;

public class ObrnutiNizDrugiNacin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu niza");
		int n = sc.nextInt();
		 int []niz = new int [n];
		 
		 System.out.println("Unesite clanove niza");
		 for (int i = 0; i < niz.length; i++) {
			 System.out.print("Unesite "+(i+1)+" clan niza: ");
			 niz[i]=sc.nextInt();
			 
			
		}
		 System.out.println("Ispis unetog niza");
		 ispisNiza(niz);
		 
		 ObrnutiNiz(niz);
		 
		 System.out.println("Ispis obrnutog niza");
		 ispisNiza(niz);
		 

	}
	public static void ispisNiza(int []niz) {
		System.out.print("niz = {");
		for (int i = 0; i < niz.length; i++) {
			String nastavak = i!=niz.length-1 ? ",":"";
			System.out.print(niz[i]+nastavak);
		}
		System.out.println("}");
	}
	public static void ObrnutiNiz(int []niz) {
		int temp;
		int  duzina = niz.length;
		for (int i = 0; i <duzina/2 ; i++) {
			temp= niz[i];
			niz[i]=niz[duzina-i-1];
			niz[duzina-i-1]=temp;
			
			
		}
	}

}
