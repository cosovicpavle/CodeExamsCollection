package programi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program01 {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		System.out.println("Izuzetci,fajlovi");
		
		
		
		try {
			
			System.out.println("Unesite broj");
		int a = sc.nextInt();   // ImputMismatchEcxeption
		
		System.out.println("Uneti drugi broj");
		String b = sc.next();
		
		int bi = Integer.parseInt(b); // NumberFormatException
		
		
		int []niz = {3,5,7,8,9,4};
		System.out.println(niz[a]+niz[bi]);// ArrayIndexOutOfBoundsException
		if(bi==0) throw new Exception("Nije dozvoljeno deljenje sa nulom");
		System.out.println(a/bi);// Aritmetic Exception
	} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Doslo je do greske u nizu!!!"+e.getMessage());
			//e.printStackTrace();
		}catch (InputMismatchException e) {
		    System.err.println("Prvi unos mora biti broj");
		    
		}catch (NumberFormatException e) {
			System.err.println("Drugi unos mora biti broj");
			
		}catch (Exception e) {
			System.err.println("Doslo je do greske!!!");
		}finally {
			System.out.println("Finally");
		}
		sc.close();
		
		try {
			deljenje(5, 3);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		try {
			int p =11;
			if(p>10) throw new ProsekException();
			
		} catch (ProsekException e) {
			System.err.println("Prosek nije ok");
			
			
		}
		
		
		
		
	//	a=sc.nextInt();// IllegalStateException
		
		Scanner sc1 = null;
		
		// a=sc.nextInt(); // NullPointerException
		
		System.out.println("Kraj");
		
		
		

	}
	
	public static double deljenje(int a, int b) throws Exception {
		if(b==0)throw new Exception();
		return a/b;
		
	}

}
