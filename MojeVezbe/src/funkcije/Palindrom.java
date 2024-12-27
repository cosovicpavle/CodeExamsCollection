package funkcije;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Unesite ceo nenegativan broj:");
		int n = sc.nextInt();
		
		
		if(brPalindrom(n)) {
			System.out.println("Uneti broj je palindrom");
			
		}else
			System.out.println("Uneti broj nije palidnrom");
		
		sc.close();
		
		
		

	}
	
	public static boolean brPalindrom(int n) {
		
		int temp=n;
		int reverse=0;
		
		
		while(temp!=0) {
			int reminder=temp%10;
			reverse=reverse*10+reminder;
			temp=temp/10;
			
			
			
			
			
		}
		
		return n==reverse;
		
	}

}
