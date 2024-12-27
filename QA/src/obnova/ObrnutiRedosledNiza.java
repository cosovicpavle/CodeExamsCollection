package obnova;

import java.util.Scanner;

public class ObrnutiRedosledNiza {

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
		
		System.out.println("Obrnuti redosle niza");
		obrnutiRedosled(niz);
		sc.close();

	}
	public static void obrnutiRedosled(int []niz) {
		for (int i = niz.length-1; i >=0; i--) {
			System.out.println(niz[i]);
			
		}
	}

}
