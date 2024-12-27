package model;

public class Student2 {

	public int brindex;
	public String ime;
	public static String fakultet="PMF";
	
	public Student2(int brStudenta,String ime){
		this.brindex = brStudenta;
		this.ime = ime;
		
		
	}
	
	
	public void display() {
		System.out.println(+this.brindex+" "+this.ime+" "+fakultet);
		
	}

	}


