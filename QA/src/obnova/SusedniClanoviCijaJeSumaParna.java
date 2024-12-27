package obnova;

import java.util.Scanner;

public class SusedniClanoviCijaJeSumaParna {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu niza");
		int n = sc.nextInt();

		int [] niz =new int [n];
		System.out.println("Unesite clanove niza: ");
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesite "+(i+1)+" clan niza: ");
			niz[i]=sc.nextInt();



		}
		System.out.println("Susedni clanovi niza cija je suma parna");
		susedniParni(niz);
		sc.close();
	}
	public static void susedniParni(int []niz) {

		for (int i = 0; i < niz.length-1; i++) {
			if((niz[i]+niz[i+1])%2==0) {
				System.out.println(niz[i]+" "+niz[i+1]);

			}

		}
	}

}
