package vezbe;

import java.util.ArrayList;
import java.util.List;

public class JoinLists {
	
	
	public static void main(String[] args) {
		
		List<String> l1 = new ArrayList<String>();
		l1.add("Lav");
		l1.add("Medved");
		
		
		
		List<String>l2 = new ArrayList<String>();
		l2.add("Vuk");
		l2.add("Zmija");
		
		
		List<String> joined=new ArrayList<String>();
		joined.addAll(l1);
		joined.addAll(l2);
		
		
		System.out.println("list1 = "+l1);
		System.out.println("list2 = "+l1);
		System.out.println("Joined = "+joined);
	}

}
