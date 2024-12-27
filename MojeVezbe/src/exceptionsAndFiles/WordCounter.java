package exceptionsAndFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordCounter {

	public static void main(String[] args) {
		
		
		BufferedReader br=null;
		
		
		try {
			br=new BufferedReader(new FileReader("filess//myfile.txt"));
			int counter=0;
			String line=br.readLine();
			while(line!=null){
				String []words=line.split(",");
				
				counter+=words.length;
				
				line=br.readLine();
				
				
			}
			System.out.println(counter);
			
			
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
