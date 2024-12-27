package vezbe;

public class Counter {

	static int count=0;

	private int uniqueId;

	public Counter() {
		this.uniqueId=count++;

	}






	public static void main(String[]args) {


		Counter c1 =  new Counter();
		System.out.println("Count: "+c1.count+"UniqueId: "+c1.uniqueId);

		Counter c2 = new Counter();
		System.out.println("Count: "+Counter.count+"UniqueId: "+c2.uniqueId);

		Counter c3 =  new Counter();
		System.out.println("Count: "+c3.count+"UniqueId: "+c3.uniqueId);
		
		


	}
}
