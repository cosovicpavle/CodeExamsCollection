package exceptionsAndFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		
		BufferedReader br=null;
		
		
		try {
			br=new BufferedReader(new FileReader("filess//baza.txt"));
			
			String line=br.readLine();
			
			int arrCounter=0;
			
			double iznos=0;
			
			Artikal[]artikli = new Artikal[4];
			
			Artikal artikal=null;
			
			while(line!=null) {
				String[]words=line.split(",");
				
				if(words[0].equalsIgnoreCase("h")) {
					artikal=new Hrana(words[1], Double.parseDouble(words[2]), words[3]);
				}else if(words[0].equalsIgnoreCase("p")) {
					artikal=new Pice(words[1], Double.parseDouble(words[2]), Integer.parseInt(words[3]));
					
				}
				
				artikli[arrCounter++]=artikal;
				iznos+=artikal.getCena();
				
				
				
				
				
				line=br.readLine();
				
				
				
				
			}
			
			
			racun(artikli, iznos);
			
			
			
			
			
			
			
			
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
	
	public static void racun(Artikal[]artikli,double iznos) {
		System.out.println("----------Racun-----------");
		for (Artikal artikal : artikli) {
			if(artikal!=null) {
				System.out.println("Naziv: "+artikal.getNaziv()+" Cena: "+artikal.getCena());
			}
			
			
			
		}
		System.out.println("----------------");
		System.out.println("Iznos= "+iznos);
	}

}
