package obnova;

import java.util.Scanner;

public class BrojDana {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite mesec");
		int mesec = sc.nextInt();
		System.out.println("Unesite godinu");
		int godina = sc.nextInt();
		
		System.out.println("Za uneti mesec i godinu broj dana je : "+brojDana(mesec, godina));
		
		sc.close();


	}

	public static boolean prestupnaGodina(int godina) {

		if(godina%4==0 && godina%100!=0 || godina%400==0) {
			return true;
		}
		return false;
	}
	public static int brojDana(int mesec,int godina) {
		if(mesec==1 || mesec==3 || mesec == 5 || mesec==7 || mesec ==8 || mesec==10 || mesec==12) {
			return 31;
		}else if(mesec==2) {
			if(prestupnaGodina(godina)) {
				return 29;
			}
			return 28;
		}
			return 30;
		
		
			
		

	}
}
