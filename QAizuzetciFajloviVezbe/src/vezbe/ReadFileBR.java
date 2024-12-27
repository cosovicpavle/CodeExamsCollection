package vezbe;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileBR {

	public static void main(String[] args) {
		BufferedReader br=null;
		
		try {
			br=new BufferedReader(new FileReader("files\\input.txt"));
			String line = br.readLine();
			while(line!=null) {
				System.out.println(line);
				line=br.readLine();
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			}
		}

	}


