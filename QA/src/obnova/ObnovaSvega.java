package obnova;

import java.util.Scanner;

public class ObnovaSvega {
	
	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite katete trougla a i b");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Povrsina pravouglog trougla je "+Povrsina(a, b)+" ,a hipotenuza je "+Hipotenuza(a, b));
		
		
		sc.close();
		
	}
	public static int Povrsina(int a,int b) {
		int p = a*b/2;
		return p;
	}
	public static double Hipotenuza(int a,int b) {
		double c = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
		return c;
	}

}
