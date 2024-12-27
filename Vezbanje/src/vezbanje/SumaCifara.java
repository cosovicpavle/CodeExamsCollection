package vezbanje;

import java.util.Scanner;

public class SumaCifara {

	public static void main(String[] args) {
		int n=234;
		
		System.out.println("Suma cifara n= "+sumaCifara(n));
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite a");
		int a = sc.nextInt();
		System.out.println("Unesite b");
		int b=sc.nextInt();
		
		System.out.println("Unesite x");
		int x =sc.nextInt();
		
		
		System.out.println("Resenje = "+prebrojavanje(a, b, x));
		
		sc.close();
		
		
		
		
		
		

	}
	
	public static int sumaCifara(int n) {
		
		int sum=0;
		
		
		while(n!=0) {
			int temp=n%10;
			sum+=temp;
			n=n/10;
		}
		
		
		return sum;
		
		
		
		
		
	}
	
	public static int prebrojavanje(int a,int b,int x) {
		int count=0;
		
		for (int i = a; i <= b; i++) {
			if(sumaCifara(i)==x){
				count++;
				
			}
			
			
		}
		
		
		
		
		return count;
	}

}
