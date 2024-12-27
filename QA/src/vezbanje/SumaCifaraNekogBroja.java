package vezbanje;

import java.util.Scanner;

public class SumaCifaraNekogBroja {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite neka dva broja");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("unesinte x");
		int x = sc.nextInt();

		System.out.println("Izmedju broja "+a+" i broja "+b+" ima= "+brojac(a, b, x)+" broja da im je suma cifara jednaka "+x);

		sc.close();


	}

	public static int sumaCifaraBroja(int n ) {
		int suma= 0;
		int c=0;
		while (n!=0) {
			c=n%10;
			suma+=c;
			n/=10;



		}
		return suma;
	}

	public static int brojac(int a, int b, int x) {
		int br=0;
		for (int i = a; i <=b; i++) {
			if(sumaCifaraBroja(i)==x) {
				br++;
			}


		}
		return br;

	}




}
