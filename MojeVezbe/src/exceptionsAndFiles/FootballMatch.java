package exceptionsAndFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FootballMatch  {

	public static void main(String[] args) {
		
		
		
		
		BufferedReader br =null;
		
		try {
			br=new BufferedReader(new FileReader("filess//utakmice.txt"));
			String line = br.readLine();
			FootballGame match=new FootballGame();
			
			while(line!=null) {
				String[]words=line.split(":");
				if(words.length==3) {
					match.setHomeTeam(words[0]);
					match.setVisitingTeam(words[1]);
					match.setStadium(words[2]);
					
					
					
					
					
					System.out.println("Match start!");
					System.out.println("----------------");
					
					match.firstHalf();
					
					System.out.println("----------------");
					System.out.println("HalfTtime");
					match.HalfTimeScore();
					System.out.println("----------------");
					
					
					match.secondHalf();
					
					System.out.println("----------------");
					System.out.println("Match ended");
					System.out.println(match.result());
					System.out.println("////////////////");
					
					
					
					
					
					
					
					
					
					
					
					
				}
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
