package vezbe;

public class UncheckedExceptionExample {

	public static void main(String[] args) {
		String s =null;
		try {
			System.out.println("Duzina Stringa s : "+s.length());
		} catch (NullPointerException e) {
			
			System.out.println("NullPointerException happened!!! ");
			
			
		}
		int a=5;
		int b=0;
		try {
		System.out.println("a/b= "+a/b);
		}catch(ArithmeticException e){
			System.out.println("ArithmeticException happened!!!");
			
			
		}

	}

}
