package vezbanje;

import java.util.Scanner;

public class PovrsinaIZapremina {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1;i<=3;i++) {
			System.out.println("Unesite prvu stranicu kvadra broj  "+i);
			int a = sc.nextInt();
			System.out.println("Unesite drugu kvadra broj "+i);
			int b = sc.nextInt();
			System.out.println("Unesite trecu kvadr broj "+i);
			int c = sc.nextInt();
			
			System.out.println("--------------");
			System.out.println("Izaberite\n1.Povrsina\n2.Zapreminu");
			int opcija =sc.nextInt();
			switch (opcija) {
			case 1:
				System.out.println("Povrsina kvadra je "+povrsinaKvadrata(a, b, c));
				break;
			case 2:
				System.out.println("Zapremina kvadra je "+zapreminaKvadrata(a, b, c) );
				break;
				default:
					System.out.println("Izabrali ste opciju koja ne postoji");
					sc.close();
			
			}
			
			
			

			
			
			
		}
		


	}
	
	public static int zapreminaKvadrata(int a, int b, int c) {
		int v = a*b*c;
		return v;
	}
	public static int povrsinaKvadrata(int a, int b, int c) {
		int p= 2*(a*b+a*c+b*c);
		return p;
	}

}
