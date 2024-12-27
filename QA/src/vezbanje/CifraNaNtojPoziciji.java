package vezbanje;

import java.util.Scanner;

public class CifraNaNtojPoziciji {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite ceo broj");
		int num = sc.nextInt();
		System.out.println("Unesite poziciju");
		int pozicija = sc.nextInt();

		System.out.println("Za uneti broj "+num+" i unetu poziciju "+pozicija+" cifra je = "+cifra(num, pozicija));
		sc.close();
	}
	public static int cifra (int num ,int pozicija) {
		int brCifara=brojCifara(num);
		int cifra;
		for(int i =0;i<brCifara- pozicija;i++) {
			num=num/10;


		}
		cifra=num%10;

		return cifra;

	}
	public static int brojCifara(int num) {
		int br=0;
		while(num!=0) {
			num/=10;
			br++;
		}
		return br;
	}

}
