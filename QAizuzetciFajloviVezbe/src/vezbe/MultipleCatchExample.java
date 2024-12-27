package vezbe;

public class MultipleCatchExample {

	public static void main(String[] args) {
		String s = null;
		int a =5;
		int b=0;
		try {
			System.out.println(s.length());
			System.out.println(a/b);
		}catch(NullPointerException e){
			System.out.println("NullPointerException happened!!!");
			
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException happened");
		}

	}

}
