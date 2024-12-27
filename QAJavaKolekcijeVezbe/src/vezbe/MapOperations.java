package vezbe;

import java.util.HashMap;
import java.util.Map;

public class MapOperations {

	public static void main(String[] args) {
		HashMap<Integer, String>languages = new HashMap<Integer, String>();


		languages.put(1, "Java");
		languages.put(2, "JavaScript");
		languages.put(3, "Pyton");
		System.out.println(languages);


		System.out.println("return set view of keys");
		for (Integer key : languages.keySet()) {
			System.out.println(key);

		}

		System.out.println("-----------------");

		System.out.println("return set view of values");


		for (String value : languages.values()) {
			System.out.println(value);


		
		}
		System.out.println("-----------------");
		
		
		System.out.println("return set view of values and keys");
		
		
		for (Map.Entry<Integer, String>  entry : languages.entrySet()) {
			System.out.println(entry);
			
		}
		
		System.out.println("-----------------");
		
		
		languages.replace(2, "C++");
		System.out.println(languages);
		
		
		System.out.println("-----------------");
		
		languages.remove(2);
		
		System.out.println(languages);

	}

}
