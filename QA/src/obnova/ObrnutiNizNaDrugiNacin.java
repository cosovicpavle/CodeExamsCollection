package obnova;

import java.util.Scanner;

public class ObrnutiNizNaDrugiNacin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu niza");
		int n = sc.nextInt();

		int []niz =  new int [n];


		System.out.println("Unesite clanove niza: ");
		for (int i = 0; i < niz.length; i++) {
			System.out.print("Unesite "+(i+1)+" clan niza: ");
			niz[i]=sc.nextInt();


		}
		obrnutiNiz2(niz);
		System.out.println("Obrnuti niz");
		ispisNiza(niz);
		sc.close();

	}
	public static void ispisNiza(int []niz) {

		System.out.print("niz= {");
		for (int i = 0; i < niz.length; i++) {
			String nastavak = i!=niz.length-1 ? "," : "";
			System.out.print(niz[i]+nastavak);


		}
		System.out.println("}");
	}
	public static void obrnutiNiz2(int []niz) {
		int duzina = niz.length;
		for (int i = 0; i < duzina/2; i++) {
			int temp =niz[i];
			niz[i]=niz[duzina-i-1];
			niz[duzina-i-1]=temp;

		}
	}

}
