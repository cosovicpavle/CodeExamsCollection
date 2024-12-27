package test;


import java.util.Iterator;
import java.util.Scanner;

public class Zadatak01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		double []niz1 = new double[6];
		
		System.out.println("Unesite 6 nenegativnih brojeva:");
		for(int i = 0;i<niz1.length;i++) {
			System.out.println("Unesite "+(i+1)+" broj");
			niz1[i]=sc.nextDouble();
		}
		
		
		double []niz2 = new double [3];
		double []niz3 = new double [3];
		
	    for (int i = 0,j=0;i < niz1.length; i++) {
	    	if(i%2!=0) 
	    		
	    			
	    		if(j<3)
	    			niz2[j++]=Math.pow(niz1[i], 3);
	    		else
	    			break;
	    			
	    		
	    		
	    	}
	    
	    
	    for (int i = 0,j=0; i < niz1.length; i++) {
	    	
	    	if(i%2==0) {
	    		if(j<3) {
	    			niz3[j++]=Math.sqrt(niz1[i]);
	    		}else
	    			break;
	    	}
			
		}
	    
	    
	    zbirElemenataNiza(niz1);
	    zbirElemenataNiza(niz2);
	    zbirElemenataNiza(niz3);
	    
	    
	    sc.close();
	    
	    
	    	
			
			
		
	    
	    
			
		}
	
	public static void zbirElemenataNiza(double []niz) {
		double counter=0;
		for (double d : niz) {
			counter+=d;
			
			
			
		}
		System.out.println("ZbirElemenataNiza= "+counter);
		
		
		
		
		
	}
		
		
		

	}


