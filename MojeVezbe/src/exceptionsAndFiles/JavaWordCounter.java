package exceptionsAndFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavaWordCounter {

	public static void main(String[] args) {
BufferedReader br=null;
		
		
		try {
			br=new BufferedReader(new FileReader("filess//myfile.txt"));
			int counter=0;
			String line=br.readLine();
			while(line!=null){
				
				counter+=javaWordCounter(line);
				
				
				line=br.readLine();
				
				
			}
			System.out.println(counter);
			
			
			
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		


	}
	public static int javaWordCounter(String line) {
		int counter=0;
		
		String []words = line.split(",");
		
		for (String word : words) {
			if(word.equalsIgnoreCase("Java")) {
				counter++;
			}
			
		}
		return counter;
		
		
	}

}
