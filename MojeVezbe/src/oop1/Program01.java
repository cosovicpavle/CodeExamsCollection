package oop1;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		double r, a, b;
		
		
		Krug []krugovi = new Krug[3];
		Pravougaonik[]pravougaonici =  new Pravougaonik[3];
		
		for (int i = 0; i <3; i++) {
			System.out.println("Unesite poluprecnik "+(i+1)+" kruga");
			r=sc.nextDouble();
			krugovi[i]= new Krug(r);
			
			System.out.println("Unesite stranice "+(i+1)+" pravougaonika");
			a=sc.nextDouble();
			b=sc.nextDouble();
			pravougaonici[i]=new Pravougaonik(a, b);
			
			
			
			
			
			
			
			
			
		}
		
		for(Krug krug:krugovi) {
			System.out.println(krug);
		}
		System.out.println();
		System.out.println("-------------");
		System.out.println();
		for(Pravougaonik pravougaonik:pravougaonici) {
			System.out.println(pravougaonik);
			
		}
		sc.close();
		
	
	

	}

}
