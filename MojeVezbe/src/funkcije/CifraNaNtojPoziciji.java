package funkcije;


import java.util.Scanner;

public class CifraNaNtojPoziciji {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite ceo broj");
		int n = sc.nextInt();
		
		System.out.println("Unesite poziciju");
		int pozicija=sc.nextInt();
		
		System.out.println("Za uneti broj "+n+" i unetu pozicijiu "+pozicija+" cifra je "+cifraNaNtojPoziciji(n, pozicija));
		
		
		sc.close();
		
		

	}
	
	public static int cifraNaNtojPoziciji(int n,int pozicija) {
		
		
		
		int brCif=brCifara(n);
		
		for(int i =0;i<brCif-pozicija;i++) {
			n=n/10;
			
		}
		
		int cifra=n%10;
		
		return cifra;
	}
	
	public static int brCifara(int n) {
		int br=0;
		int temp=n;
		
		while(temp!=0){
			br++;
			
			temp=temp/10;
			
			
		}
			
			
		
			
			
		
		return br;
		
		
	}

}
