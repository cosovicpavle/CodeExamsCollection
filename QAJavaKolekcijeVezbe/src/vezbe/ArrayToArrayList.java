package vezbe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {
		
		
		String []array = {"Java","Pyton","C"};
		System.out.print("Array: ");
		System.out.println(Arrays.toString(array));
		
		
		
		List<String>languages = new ArrayList<String>(Arrays.asList(array));
		System.out.println("Languages = "+languages);
	}

}
