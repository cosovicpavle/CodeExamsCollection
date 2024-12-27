package obnova;

import java.util.Scanner;

public class ParniIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu niza");
		int n = sc.nextInt();
		
		int [] niz =new int [n];
		System.out.println("Unesite clanove niza: ");
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesite "+(i+1)+" clan niza: ");
			niz[i]=sc.nextInt();
			
			
			
		}
		System.out.println("Clanovi niza sa parnim indexom su: ");
		parniIndex(niz);
		
		sc.close();

	
	}
	public static void parniIndex(int []niz) {
		for (int i = 0; i <=niz.length; i+=2) {
			
				System.out.println(niz[i]);
			}
			
		}
	}

