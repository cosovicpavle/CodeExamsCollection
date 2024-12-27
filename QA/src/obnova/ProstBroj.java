package obnova;

import java.util.Scanner;

public class ProstBroj {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite neki broj");
		int n = sc.nextInt();
		if(prostBroj(n)) {
			System.out.println("Broj je prost");
		}else {
			System.out.println("Broj nije prost");
		}
		System.out.println("Prosti brojevi manji od n");
		ispis(n);
		
		sc.close();

	}
	
	public static boolean prostBroj(int n) {
		if(n>1) {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if(n%i==0) {
					return false;
				}
				
				
			}
			return true;
			
			
				
			
		}
		return false;
	}

	
	public static void ispis(int n) {
		for (int i = 2; i <=n; i++) {
			if(prostBroj(i)) {
				
				System.out.print(i+"\n");
			}
		}
	}
}

