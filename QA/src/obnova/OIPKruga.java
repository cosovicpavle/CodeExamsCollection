package obnova;

import java.util.Scanner;

public class OIPKruga {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Unesite poluprecnik Kruga");
		int r  = sc.nextInt();
		
		System.out.println("Unesite opciju \n1-za izracunavanje Povrsine \n2-za izracunavanje Obima");
		int opcija = sc.nextInt();
		
		switch(opcija) {
		case 1:
			System.out.println("Povrsina Kruga je "+povrsinaK(r));
			break;
		case 2:
			System.out.println("Obim Kruga je "+obimK(r));
			break;
			
			default:
				System.out.println("Izabrali ste nepostojecu opciju");
				
		}
		
		sc.close();
			
		


	}

	public static double obimK(int r) {
		double Obim = 2*r*Math.PI;

		return Obim;
	}
	public static double povrsinaK(int r) {
		double P= Math.pow(r, 2)*Math.PI;

		return P;
	}
}
