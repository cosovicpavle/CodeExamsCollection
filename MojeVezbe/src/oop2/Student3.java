package oop2;

public class Student3 {
	
	public int brIndexa;
	public String ime;
	public Status status;
	
	public Student3(int brIndexa,String ime,Status status){
		this.brIndexa=brIndexa;
		this.ime= ime;
		this.status=status;
		
	}
	
	
	@Override
	public String toString() {
		return "Student info:\nBrIndexa: "+this.brIndexa+"\nIme: "+this.ime+"\nStatus: "+this.status;
	}
	
	
	
	

}
