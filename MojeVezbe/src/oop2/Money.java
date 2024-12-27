package oop2;

public class Money {
	
	public int amount;
	public String currencyCode;
	
	
	Money(int amount,String currencyCode){
		
		this.amount=amount;
		this.currencyCode=currencyCode;
		
		
		
		
		

	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj ==this)
			return true;
		if(!(obj instanceof Money))
			return false;
		Money pom = (Money)obj;
		if(pom.amount==this.amount && pom.currencyCode.equals(this.currencyCode))
			return true;
		else
			return false;
			
	}
	
	
	public static void main (String []args) {
		Money m1 =  new Money(500, "RSD");
		Money m2 = new Money(20, "USD");
		
		
		if(m1.equals(m2)) {
			System.out.println("They are equal!");
		}else {
			System.out.println("They are not equal!");
		}
		
		
				
	}

}
