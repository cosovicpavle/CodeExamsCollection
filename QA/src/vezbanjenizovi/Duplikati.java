package vezbanjenizovi;

import java.util.Iterator;
import java.util.Scanner;

public class Duplikati {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu niza");
		int n = sc.nextInt();
		
		int []niz = new int [n];
		System.out.println("Unesite clanove niza");
		for (int i = 0; i < niz.length; i++) {
			System.out.print("Unesite "+(i+1)+" clan niza: ");
			niz[i]= sc.nextInt();
			
			
		}
		System.out.println("Ispis unetog niza");
		ispisNiza(niz);
		bezDuplikataiNula(niz);
		
		System.out.println("Ispis niza bez duplikata");
		ispisNiza(niz);
		

	}
	public static void bezDuplikataiNula(int[]niz) {
		
			
			
				
			
			
		
	}
	public static void ispisNiza(int []niz) {
		System.out.print("niz = {");
		for (int i = 0; i < niz.length; i++) {
			String nastavak = i!=niz.length-1 ? ",":"";
			System.out.print(niz[i]+nastavak);
			
			
		}
		System.out.println("}");
	}

}
