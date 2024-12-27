package vezbe;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionExample {
	
	
	public static void main(String[]args) {
		
		try {
			FileInputStream fis = new FileInputStream("B:/myfile.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Desio se Checked exception");                  
			e.printStackTrace();
		}
		
		
	}

}
