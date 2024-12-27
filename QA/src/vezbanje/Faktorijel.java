package vezbanje;

import java.util.Scanner;

public class Faktorijel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("unesite neka dva broja");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int resenje = (faktorijel(a)+faktorijel(b))/faktorijel(a);
		System.out.println("rezultat je "+resenje);
		sc.close();
		
		
		

	}
	
	public static int faktorijel(int n) {
		
		int f=1;
		for(int i = 1;i<=n;i++) {
			f = f*i;
			
			
		}
		return f;
		
	}

}
