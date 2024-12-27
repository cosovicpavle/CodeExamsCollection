package vezbanje2;

import java.util.Iterator;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		Krug []krugovi =  new Krug[3];
		Pravougaonik []pravougaonici = new Pravougaonik[3];

		for(int i =0;i<3;i++) {
			System.out.println("Unesite poluprenik "+(i+1)+" Kruga");
			double r=sc.nextDouble();
			krugovi[i]= new Krug(r);

			System.out.println("Unesite stranice "+(i+1)+" Pravougaonika");
			int a=sc.nextInt();
			int b=sc.nextInt();
			pravougaonici[i]=new Pravougaonik(a,b);
		}

		ispisK(krugovi);
		ispisP(pravougaonici);
		sc.close();

	}

	public static void ispisK(Krug[]krugovi) {
		for (int i = 0; i < krugovi.length; i++) {
			System.out.println(krugovi[i]);

		}

	}
	public static void ispisP(Pravougaonik[]pravougaonici) {
		for (int i = 0; i < pravougaonici.length; i++) {
			System.out.println(pravougaonici[i]);

		}

	}

}
