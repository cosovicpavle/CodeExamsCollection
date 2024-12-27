package vezbanje;

import java.util.Scanner;

public class FibonacijevNiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite neki broj");
		int n = sc.nextInt();

		
		fibonacijevNiz(n);

		sc.close();
	}
	public static void fibonacijevNiz(int n) {
		int a=0;
		int b=1;
		int temp;
		
		System.out.print("Fibonacijev niz:");
		for (int i =1;i<=n;i++ ) {
			String nastavak = i!=n ? "," : "";
			System.out.print(a+nastavak);
			temp=a+b;
			a=b;
			b=temp;
		}
		
	}

}
