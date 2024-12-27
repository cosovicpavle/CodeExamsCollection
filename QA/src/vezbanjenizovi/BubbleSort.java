package vezbanjenizovi;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite velicinu niza ");
		int n  = sc.nextInt();
		
		int[]niz = new int [n];
		
		System.out.println("Unesite clanove niza");
		for (int i = 0; i < niz.length; i++) {
			System.out.print("Unesite "+(i+1)+" clan niza: ");
			niz[i]=sc.nextInt();
			
			
		}
		System.out.println("Ispis unetog niza");
		ispisNiza(niz);
		
		bubbleSort(niz);
		
		System.out.println("Ispis sortiranog niza");
		ispisNiza(niz);
		
		
		sc.close();

	}
	public static void bubbleSort(int []niz) {
		for (int i = 0; i < niz.length-1; i++) {
			for (int j = i+1; j < niz.length; j++) {
				if(niz[i]>niz[j]) {
					int temp=niz[i];
					niz[i]=niz[j];
					niz[j]=temp;
					
					
				}
				
			}
			
		}
	}
	public static void ispisNiza(int []niz) {
		System.out.print("niz = {");
		for (int i = 0; i < niz.length; i++) {
			String nastavak = i!=niz.length-1 ? ",": "";
			System.out.print(niz[i]+nastavak);
			
		}
		System.out.println("}");
	}

}
