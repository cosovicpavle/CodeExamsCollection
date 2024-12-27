package program;

import vezbe.Dete;
import vezbe.Roditelj;

public class program02 {

	public static void main(String[] args) {
		
		
		Roditelj r  = new Roditelj();
		
		System.out.println("r.x from Roditelj class= "+r.x);
		System.out.println("r.y from Roditelj class= "+r.y);
		
		Dete d =  new Dete();
		
		System.out.println("d.x from Dete class= "+d.x);
		System.out.println("d.y from Dete class= "+d.y);
		

	}

}
