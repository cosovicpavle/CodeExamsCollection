package vezbe;

public class ThrowExceptionExample {

	public static void main(String[] args) {
		
		try {
			testMetod(3);
		} catch (NumberThreeException e) {
			
			System.out.println(e.getMessage());
		}
		

	}
	
	public static void testMetod(int a)throws NumberThreeException {
		if(a==3) {
			throw new NumberThreeException("ulazni parametar testmetod funkcije ne sme da bude 3!!!");
		}
		
	}

}
