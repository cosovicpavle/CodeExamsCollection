package obnova;

import java.util.Scanner;

public class SumaCifaraNekogBroja {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite dva broja");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Unesite x");
		int x = sc.nextInt();


		System.out.println("Izmedju "+a+" i "+b+" ima "+brojac(a, b, x)+" brojeva da im je suma cifara jednaka "+x);

		sc.close();
	}

	public static int sumaCifara(int n) {
		int sum=0;
		while(n!=0) {
			int c=n%10;
			sum=sum+c;
			n=n/10;

		}



		return sum;


	}
	public static int brojac(int a,int b, int x) {
		int br=0;
		for ( int i =  a; i <=  b;i++) {
			if(sumaCifara(i)==x) {
				br++;
			}


		}
		return br;
	}

}
