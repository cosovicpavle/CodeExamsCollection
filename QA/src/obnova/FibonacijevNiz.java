package obnova;

import java.util.Scanner;

public class FibonacijevNiz {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Unesite ceo broj");
		int n = sc.nextInt();

		System.out.println("Fibonacijev niz:");
		fibonacijevNiz(n);

		sc.close();


	}
	public static void fibonacijevNiz(int n) {
		int temp;
		int a = 0;
		int b =1;
		System.out.print("niz= ");
		for (int i = 0; i <= n; i++) {
			String nastavak = i!=n ? "," : "";
			System.out.print(a+nastavak);
			temp=a+b;
			b=a;
			a=temp;

		}
	}

}
