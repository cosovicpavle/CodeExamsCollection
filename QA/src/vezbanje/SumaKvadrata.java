package vezbanje;

import java.util.Scanner;

public class SumaKvadrata {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("unesite neka dva broja");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		System.out.println("Suma kvadrata od"+m+ "do "+n+"je "+sumaKvadrata(m, n));
		
		sc.close();
		
		

	}
	
	public static int sumaKvadrata(int m,int n) {
		
		
			
	
		
		int suma=0;
		for (int i=m;i<=n;i++) {
			suma=suma+i*i;
		
	}
		return suma;
	
	}
	
}
