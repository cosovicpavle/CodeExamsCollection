package funkcije;

import java.util.Scanner;

public class FibonacijevNiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite ceo broj");
		int n = sc.nextInt();
		
		
		fibonacijevniz(n);
		
		sc.close();
		
		

	}
	
	public static void fibonacijevniz(int n) {
		
		
		int a=0;
		int b=1;
		System.out.print("Fibonacijev niz=[");
		for(int i = 0;i<=n;i++) {
			
			String nastavak =i!=n ? "," :"";
			System.out.print(a+nastavak);
			
			
			
			int temp = a+b;
			b=a;
			a=temp;
			
			
		}
		System.out.println("]");
		
		
			
		}
		
	}
	
	
	



