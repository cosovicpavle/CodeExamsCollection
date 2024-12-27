package vezbanje;

import java.util.Scanner;

public class ParniBrojevi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite broj clanova niza ");
		
		
		int n = sc.nextInt();
		
		int []niz = new int [n];
		
		System.out.println("Unesite clanove niza ");
		
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Uneti "+(i+1)+" clan niza");
			
			niz [i] =sc.nextInt();
			
		}
		System.out.println("Parni brojevi iz niza su: ");
		
		for (int i = 0; i < niz.length; i++) {
			if (niz[i]%2==0) {
				System.out.print(niz[i]+" ");
			}
			
		}
			
		}
		

	}


