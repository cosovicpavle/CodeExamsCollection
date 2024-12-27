package Programi;

import model.Money;

public class program02 {

	public static void main(String[] args) {
		
		Money m1 =  new Money(1000, "USD");
		Money m2 = new Money(1000, "USD");
		
		
		if(m1==m2) {
			System.out.println("EQUALS");
			
			}else {
				System.out.println("NOT EQUALS");
		}
		
		if(m1.equals(m2)) {
			System.out.println("EQUALS");
		}else{
			System.out.println("NOT EQUALS");
			
		}
		
		
		

	}

}
