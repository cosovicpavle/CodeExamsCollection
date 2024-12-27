package vezbe;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileFR {
	
	public static void main(String []args) {
		
		FileReader fr=null;
		
		try {
			fr=new FileReader("files\\input.txt");
			
			int i;
			
			while((i=fr.read())!=-1) {
				System.out.print((char)i);
				
			}
			
			
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		
	}

}
