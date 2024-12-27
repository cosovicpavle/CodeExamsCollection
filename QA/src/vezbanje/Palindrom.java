package vezbanje;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite ceo nenegativan broj");
		int num = sc.nextInt();
		if(brojPalindrom(num)) {
			System.out.println("Uneti broj je palindrom");
		}else {
			System.out.println("Uneti broj nije palindrom");
		}

		sc.close();

	}
	public static boolean brojPalindrom(int num) {
		int reverse=0;
		int temp=num;
		int reminder;

		while(temp!=0) {
			reminder=temp%10;
			reverse=reverse*10+reminder;
			temp/=10;





		}
		return reverse==num;

	}

}
