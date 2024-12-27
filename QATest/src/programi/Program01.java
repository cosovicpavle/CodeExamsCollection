package programi;


import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		double []niz1 =new double [6];
		System.out.println("Unesite 6 nenegativnih brojeva");
		System.out.println("--------------------------");
		for (int i = 0; i < niz1.length; i++) {
			System.out.println("Unesite "+(i+1)+" broj");
			niz1[i]=sc.nextInt();


		}

		double []niz2 = new double [3];
		double []niz3 = new double [3];


		for (int i = 0, j = 0; i < niz1.length; i ++) {
			if(i%2!=0) {


				if (j < 3) {
					niz2[j++] = Math.pow(niz1[i], 3);
					System.out.println(niz1[i]);
				}
			}
		}

		for (int i = 0, j = 0; i < niz1.length; i ++) {
			if(niz1[i]%2==0) {
				


				if(j<3)
					niz3[j++]=Math.sqrt(niz1[i]);
				System.out.println(niz1[i]);
			}
		}















		System.out.println("Suma prvog niza");
		sumaElemenataNiza(niz1);
		System.out.println("Suma drugog niza");
		sumaElemenataNiza(niz2);
		System.out.println("Suma treceg niza");
		sumaElemenataNiza(niz3);
		
		
		sc.close();








	}

	public static void sumaElemenataNiza(double[]niz) {

		double sum=0;
		for (double pom : niz) {
			sum+=pom;



		}
		System.out.println(sum);
	}





}
