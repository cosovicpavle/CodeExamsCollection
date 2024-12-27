package vezbe;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavaWordCounter {

	public static void main(String[] args) {
		BufferedReader br =null;
		
		try {
			br = new BufferedReader(new FileReader("files//multiLine.txt"));
			
			int counter=0;
			
			String line =br.readLine();
			
			while(line!=null) {
				System.out.println(line);
				counter+=JavaWordCount(line);
				
				line=br.readLine();
				
				
			}
			System.out.println(counter);
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}
	public static int JavaWordCount(String line) {
		int counter=0;
		
			String []words = line.split("\\s+");
			for(String word: words) {
				if(word.equalsIgnoreCase("Java")) {
					counter++;
					
				}
				
				
			
		}
		return counter;
		
		
		
		
		
	}

}
