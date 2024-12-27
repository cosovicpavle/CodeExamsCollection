package obnova;

import java.util.Scanner;

public class GenerisatiNiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite ceo broj");
		int n = sc.nextInt();
		
		int []niz = new int [n*2];
		
		for (int i = 0; i <  n; i++) {
			niz[i]=random();
			niz[n+i]=niz[i]*2;
			
		}
		
		System.out.println("Ipsis generisanog niza");
		ispis(niz);
		
	
		sc.close();
		
		

	}
	public static int random() {
		int min=1;
		int max=100;
		return min+ (int)(Math.random()*((max-min)+1));
	}
	public static void ispis(int []niz) {
		System.out.print("niz={");
		for (int i = 0; i < niz.length; i++) {
			String nastavak = i!=niz.length-1 ? "," :"";
			System.out.print(niz[i]+nastavak);
			
			
		}
		System.out.println("}");
	}

}
