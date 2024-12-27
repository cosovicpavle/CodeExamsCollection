package vezbanje;



public class Faktorijel {
	
	
	public static void main(String[] args) {
		
		int a=3, b=4;
		
		
		
		System.out.println(faktorijel(b));
		
		System.out.println("Resenje "+resenje(a, b));
		
		
		
		
	}
	
	public static int faktorijel(int n) {
		int f= 1;
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
		return f;
	}
	
	public static int resenje(int a,int b) {
		
		
		int z =(faktorijel(a)+faktorijel(b))/faktorijel(a);
				
				
		
		
		return z;
	}
		
	}


