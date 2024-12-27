package vezbe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) {
		List<String>languages = new ArrayList<String>();
		
		languages.add("Java");
		languages.add("Pyton");
		languages.add("C++");
		
		
		
		String[]languages1 = new String[languages.size()];
		
		languages.toArray(languages1);
		
		System.out.println(Arrays.toString(languages1));

	}

}
