package vezbanjenizovi;

public class BrojReciURecenici {

	public static void main(String[] args) {
		String recenica= "Planeta Zemlja je treca planeta suncevog sistema.";
		
		String []reci = recenica.split(" ");
		
		System.out.println("Broje reci u recenici je: "+ reci.length);

	}

}
