package vezbe;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordCounter {

	public static void main(String[] args) {
		BufferedReader br =null;
		
		
		try {
			br=new BufferedReader(new FileReader("files\\multiLine.txt"));
			//System.out.println((char)br.read());
			int counter=0;
			
			
			String line  =br.readLine();
			
			while(line !=null) {
				
				String[]words = line.split("\\s+");
				counter+=words.length;
				line=br.readLine();
				
				
				
				
			}
			System.out.println(counter);
			br.close();
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		

	}

}
