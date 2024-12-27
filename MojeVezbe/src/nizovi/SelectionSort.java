package nizovi;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Unesite duzinu niza");
		int l = sc.nextInt();

		int []niz = new int [l];
		System.out.println("Unesite clanove niza: ");
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesite "+(i+1)+" clan niza:");
			niz[i]=sc.nextInt();


	}
		
		System.out.println("Ispis unetog niza");
		ispisNiza(niz);
		
		selectionSort(niz);
		System.out.println("Ispis sortiranog niza");
		ispisNiza(niz);
		
		sc.close();
	
		
		
		

	}
	
	public static void selectionSort(int[]niz) {
		for (int i = 0; i < niz.length-1; i++) {
			int min=niz[i];
			int minpoz=i;
			for (int j = i+1; j < niz.length; j++) {
				if(niz[j]<min) {
					min=niz[j];
					minpoz=j;
				}
				
			}
			if(i<minpoz) {
				int temp=niz[i];
				niz[i]=niz[minpoz];
				niz[minpoz]=temp;
				
			
				
			}
			
					
					
			
		}
	}
	
	
	public static void ispisNiza(int[]niz) {
		System.out.print("niz= {");
		for (int i = 0; i < niz.length; i++) {
			String nastavak = i!=niz.length-1 ? "," : "";
			System.out.print(niz[i]+nastavak);
			
		}
		System.out.println("}");
	}

}
