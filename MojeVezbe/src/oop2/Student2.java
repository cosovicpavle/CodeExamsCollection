package oop2;

public class Student2 {
	
	public int brIndexa;
	public String ime;
	public static String fakultet="FON";
	
	Student2(int brIndexa,String ime){
		
		this.brIndexa=brIndexa;
		this.ime=ime;
		
		
		
	}
	
	void display() {
		System.out.println("Student info:\nBrIndexa: "+this.brIndexa+"\nIme: "+this.ime+"\nFakultet= "+fakultet);
	}
	
	public static void main(String []args) {
		Student2 s1 =  new Student2(1, "Stefan") ;
		Student2 s2 =  new Student2(2, "Nikola");
		
		
		s1.display();
		s2.display();
	
	}

}
