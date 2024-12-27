package vezbanje;

import java.util.Scanner;

public class SumaParnih {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ispisati susedne clanove niza cija je suma parna");
		System.out.println("Unesite broj clanova niza");
		int n=sc.nextInt();
		
		int[]niz = new int [n];
		System.out.println("Unesite clanove niza: ");
		for (int i = 0; i < niz.length; i++) {
			niz[i]=sc.nextInt();
			
		}
		for(int i =0 ; i<niz.length-1;i++) {
			if((niz[i]+niz[i+1])%2==0) {
				System.out.println(niz[i]+" "+niz[i+1]);
			}
		}

	}

}
