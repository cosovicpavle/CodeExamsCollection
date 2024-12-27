package vezbe;

import java.util.HashSet;

public class SetUnion {
	public static void main(String[] args) {
		
		
		HashSet<Integer>evenNumbers = new HashSet<Integer>();
		evenNumbers.add(2);
		evenNumbers.add(4);
		
		HashSet<Integer>primeNumbers = new HashSet<Integer>();
		primeNumbers.add(1);
		primeNumbers.add(3);
		
		primeNumbers.addAll(evenNumbers);
		
		System.out.println(primeNumbers);
		
		
		
	}
	

}
