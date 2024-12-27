package obnova;

import java.util.Scanner;

public class CifraNaNtoj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite ceo broj");
		int n = sc.nextInt();
		System.out.println("Unesite poziciju");
		int pozicija= sc.nextInt();

		System.out.println("Cifra na poziciji "+pozicija+" je "+cifra(n, pozicija));

		sc.close();

	}
	public static int brojCifara(int n) {
		int br = 0;

		while(n!=0) {
			n=n/10;
			br++;

		}
		return br;



	}

	public static int cifra(int n,int pozicija) {

		int brc=brojCifara(n);
		for (int i = 0; i < brc-pozicija; i++) {
			n=n/10;

		}
		int cifra=n%10;
		return cifra;

	}

}
