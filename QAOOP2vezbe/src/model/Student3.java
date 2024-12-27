package model;

public class Student3 {
	
	public int brIndex;
	public String ime;
	public Status status;
	
	public Student3 (int brIndex,String ime,Status status) {
		this.brIndex=brIndex;
		this.ime=ime;
		this.status=status;
		
		
		
		
	}
	
	@Override
	public String toString() {
		return "Student info:\nBrIndexa: "+this.brIndex+"\nIme: "+this.ime+"\nStatus: "+status;
	}
	
	
	

}
