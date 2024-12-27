package obnova;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite ceo nenegativan broj");
		int n = sc.nextInt();
		
		if(palindrom(n)) {
			System.out.println("Broj je palidnrom");
		}else {
			System.out.println("Broj nije palindrom");
		}
		sc.close();

	}
	
	public static boolean palindrom(int n) {
		int temp=n;
		int reverse = 0;
		while(temp!=0) {
			int reminder = temp%10;
			reverse=reverse*10+reminder;
			temp=temp/10;
			
		}
		return n==reverse;
	}
	
	

}
