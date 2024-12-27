package vezbe;

import java.util.HashSet;

public class SetDifference {

	public static void main(String[] args) {
		HashSet<Integer>primeNumbers = new HashSet<Integer>();
		primeNumbers.add(2);
		primeNumbers.add(3);
		primeNumbers.add(5);
		
		
		HashSet<Integer>oddNumbers = new HashSet<Integer>();
		oddNumbers.add(1);
		oddNumbers.add(3);
		oddNumbers.add(5);
		
		primeNumbers.removeAll(oddNumbers);
		
		System.out.println(primeNumbers);
		
		


	}

}
