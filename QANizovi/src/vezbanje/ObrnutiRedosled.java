package vezbanje;

import java.util.Scanner;

public class ObrnutiRedosled {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite velicinu niza");
		int n = sc.nextInt();

		int[]niz = new int [n];

		System.out.println("Unesite clanove niza ");
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesite "+(i+1)+" clan");
			niz[i]=sc.nextInt();

		}
		System.out.println("Ispis unetog niza: ");
		ispisiniz(niz);
		
		System.out.println();
		System.out.println("Obrnuti redosled:  ");
		ispisObrnutogNiza(niz);

	}
	public static void ispisiniz(int []niz) {
		for (int i : niz) {
			System.out.print(i+" ");
			
		}
	}
	public static void ispisObrnutogNiza(int[]niz) {
		for (int i = niz.length-1; i >=0; i--) {
			System.out.print(niz[i]+" ");
		}
	}
	

}
