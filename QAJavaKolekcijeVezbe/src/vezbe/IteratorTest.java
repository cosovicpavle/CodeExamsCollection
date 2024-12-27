package vezbe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

	public static void main(String[] args) {
		
		
		Chocolate c1 = new Chocolate("Milka", 100);
		Chocolate c2 = new Chocolate("Crunch", 50);
		Chocolate c3 = new Chocolate("Najlepse zelje", 75);
		
		
		List<Chocolate> chocolates = new ArrayList<Chocolate>();
		
		chocolates.add(c1);
		chocolates.add(c2);
		chocolates.add(c3);
		
		Iterator<Chocolate> iterator = chocolates.iterator();
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		
	}

}
