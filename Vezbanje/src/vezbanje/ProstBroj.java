package vezbanje;


import java.util.Scanner;

public class ProstBroj {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite neki broj");
		int n=sc.nextInt();
		
		ispisProstihBrojeva(n);
		
		sc.close();
		

	}
	public static boolean prostBroj(int n) {
		
	   if(n<=1) {
		   return false;
	   }
	   
	   for(int i=2;i<=Math.sqrt(n);i++) {
		   if(n%i==0) {
			   return false;
		   }
		   
		   
	   }
	   
	   return true;
			
			
		
		
		
		
		
		
		
	}
	public static void ispisProstihBrojeva(int n) {
		
		for (int i = 2; i <n ; i++) {
			if(prostBroj(i)) {
				System.out.println(i);
			}
			
		}
		
	}
	

}
