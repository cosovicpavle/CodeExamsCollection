package vezbe;

public class TestFinallyBlock {

	public static void main(String[] args) {
		try {
			int a=25,b=5;
			int data=a/b;
			System.out.println(data);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			
		}finally {
			System.out.println("Finally block is always executed");
		}
		System.out.println("rest of the code...");

	}

}
