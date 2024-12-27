package programi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program02 {
	public static Scanner sc =  new Scanner(System.in);

	public static void main(String[] args) {
		try {
			
		
		System.out.println("Unesite prvi broj");
		
		int a =sc.nextInt();
		
		System.out.println("Unesite drugi broj");
		String b = sc.next();
		int bi= Integer.parseInt(b);
		
		
		System.out.println(a+b);
		
		} catch (InputMismatchException e) {
			System.err.println("Morate uneti broj");
			
			
		}catch (NumberFormatException e) {
			System.err.println("Morate uneti broj");
			
		}

	}

}
