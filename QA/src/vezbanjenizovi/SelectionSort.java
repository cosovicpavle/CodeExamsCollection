package vezbanjenizovi;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu niza");
		int n = sc.nextInt();
		
		int []niz = new int [n];
		
		System.out.println("Unesite clanove niza");
		for (int i = 0; i < niz.length; i++) {
			System.out.print("Unesite "+(i+1)+" clan niza:");
			niz[i]=sc.nextInt();
			
			
		}
		System.out.println("Ispis unetog niza");
		ispisNiza(niz);
		
		selectionSort(niz);
		
		System.out.println("Ispis sortiranog niza ");
		ispisNiza(niz);
		
		sc.close();
		

	}
	public static void ispisNiza(int []niz) {
		System.out.print("niz = {");
		for (int i = 0; i < niz.length; i++) {
			String nastavak = i!=niz.length-1 ? ",": "";
			System.out.print(niz[i]+nastavak);
			
		}
		System.out.println("}");
		
	}
	public static void selectionSort(int []niz) {
		for (int i = 0; i < niz.length-1; i++) {
			int min = niz[i];
			int minpos=i;
			for (int j = i+1; j < niz.length; j++) {
				if(niz[j]<min) {
					min=niz[j];
					minpos=j;
					
				}
				
				
			}
			if(minpos>i) {
				int temp= niz[i];
				niz[i]=niz[minpos];
				niz[minpos]=temp;
				
			}
			
		}
	}

}
