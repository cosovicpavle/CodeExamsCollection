package vezbe;

import java.util.HashSet;

public class SetSubset {

	public static void main(String[] args) {
		
		
		HashSet<Integer>numbers = new HashSet<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		
		
		HashSet<Integer>primeNumbers = new HashSet<Integer>();
		primeNumbers.add(2);
		primeNumbers.add(3);
		
		
		
		boolean result=numbers.containsAll(primeNumbers);
		
		System.out.println(result);
	}

}
