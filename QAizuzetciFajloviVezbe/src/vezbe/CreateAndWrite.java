package vezbe;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateAndWrite {

	public static void main(String[] args) {
		
		File myObj = new File("files\\filename.txt");
		
		try {
			if(myObj.createNewFile()) {
				System.out.println("File created: "+myObj.getName());
			}else {
				System.out.println("File already exist");
			}
			
			FileWriter fw = new FileWriter("files\\filename.txt");
			fw.write("Files in java might be tricky but its fun enought");
			fw.close();
			System.out.println("Successfully wrote to the file");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
