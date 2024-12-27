package vezbanje;

import java.util.Scanner;

public class PrestupnaGodina {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite mesec");
		int mesec = sc.nextInt();
		System.out.println("Unesite godinu");
		int godina = sc.nextInt();

		System.out.println("Za uneti mesec "+mesec+" i unetu godinu "+godina+" broj dana je = "+brojDana(mesec, godina));

		sc.close();

	}

	public static int brojDana(int mesec, int godina) {

		if(mesec==1|| mesec==3 || mesec==5 || mesec==7 || mesec==8 || mesec==10 ||mesec==12 ) {
			return 31;
		}else if(mesec==2) {
			if(prestupnaGodina(godina)) {
				return 29;
			}else
				return 28;


		}
		return 30;


	}
	public static boolean prestupnaGodina(int godina) {

		if (godina%4==0 && godina%100!=0 || godina%400==0) {
			return true;
		}else {
			return false;
		}


	}
}