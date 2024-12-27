package obnova;

import java.util.Scanner;

public class PIVKvadra {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i <= 2; i++) {
			System.out.println("Unesite stranice "+(i+1)+" kvadra: ");
			int a =sc.nextInt();
			int b =sc.nextInt();
			int c =sc.nextInt();

			System.out.println("Unesite:\n1-za izracunavanje Povrsine\n2-za izracunavanje Zapremine");
			int opcija = sc.nextInt();
			switch(opcija){
			case 1:
				System.out.println("Povrsina kvadra je: "+povrsinaKvadra(a, b, c));
				break;
			case 2:
				System.out.println("Zapremina kvadra je: "+zapreminaKvadra(a, b, c));
				break;
			default:
				System.out.println("Uneli ste nepostojecu opciju");
			}


		}
		sc.close();




	}

	public static int povrsinaKvadra(int a,int b,int c) {
		int p = 2*(a*b+a*c+b*c);
		return p;

	}
	public static int zapreminaKvadra(int a, int b, int c) {
		int v = a*b*c;
		return v;
	}

}