package programi;

import java.io.File;
import java.io.FileWriter;

import java.io.PrintWriter;
import java.util.Scanner;

public class Program03 {

	public static void main(String[] args) {
		/*PrintWriter pw = null;
		
		try {
			pw = new PrintWriter(new FileWriter("test.txt"));
			
			pw.println("Test upisa");
			for(int i =0;i<=10;i++) {
				pw.println(i);
			}
				
			
			
		} catch ( Exception e) {
			System.out.println("Greskaa");
		}finally {
			if(pw!=null)
			pw.close();
			
		}
*/
		
		Scanner sc = null;
		try {
			sc= new Scanner(new File("test.txt"));
			//citanje 
			while (sc.hasNext()) {
			//	System.out.println(sc.next());
			//	System.out.println(sc.nextLine());
			String red = sc.nextLine();
			String [] s = red.split(",");
			// if(s[0] == b)
			}
		} catch (Exception e) {
			System.out.println("Greskaa");
			e.printStackTrace();
		}finally {
			if(sc!=null) 
				sc.close();
				
			
		}
	}

}
