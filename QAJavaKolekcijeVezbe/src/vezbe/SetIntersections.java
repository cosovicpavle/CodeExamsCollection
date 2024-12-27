package vezbe;

import java.util.HashSet;

public class SetIntersections {

	public static void main(String[] args) {

		HashSet<Integer>evenNumbers = new HashSet<Integer>();
		evenNumbers.add(2);
		evenNumbers.add(3);
		
		HashSet<Integer>primeNumbers = new HashSet<Integer>();
		primeNumbers.add(2);
		primeNumbers.add(4);
		
		primeNumbers.retainAll(evenNumbers);
		
		System.out.println(evenNumbers);

	}

}
