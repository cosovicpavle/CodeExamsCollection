package funkcije;

import java.util.Scanner;

public class Datum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unsite mesec i godinu: ");
		System.out.println("Mesec: ");
		int mesec = sc.nextInt();
		System.out.println("Godina: ");
		int godina = sc.nextInt();
		
		
		System.out.println("Za mesec "+mesec+" i  godinu "+godina+" broj dana u mesecu je= "+brojDana(mesec, godina));
		
		sc.close();
	

	}
	
	public static int brojDana(int mesec,int godina) {
		if(mesec == 1 || mesec == 3 || mesec == 5 || mesec == 7 || mesec == 8 ||mesec == 10 || mesec==12) 
			return 31;
		    if(mesec==2)
		    	if(prestupnaGodina(godina))
		    		return 29;
		    	else
		    		return 28;
			
		
		else
			return 30;
			
		
		
		
	}
	
	public static boolean prestupnaGodina(int godina) {
		if(godina%4==0 && godina%100!=0 || godina%400==0) {
			return true;
		}else {
			return false;
		}
		
	}

}
