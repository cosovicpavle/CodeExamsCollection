package obnova;



public class Faktorijel {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		
		double Rezultat = (faktorijel(a)+faktorijel(b))/faktorijel(a);
		System.out.println("Rezultat je : "+Rezultat);

	}
	
	public static int faktorijel(int n) {
		int f = 1;
		for (int i = 1; i <=n; i++) {
			 f=f*i;
			
			
		}
		return f;
			
			
		}
	}


