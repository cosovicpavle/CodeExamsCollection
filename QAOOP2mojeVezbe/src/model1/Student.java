package model1;

public class Student {
	
	public int brIndexa;
	public String ime;
	
	public Status status;
	
	public Student(int brIndexa,String ime,Status status) {
		this.brIndexa=brIndexa;
		this.ime=ime;
		this.status=status;
	}
	
	@Override 
	public String toString() {
		return "Student info:\nBr.Indexa: "+this.brIndexa+"\nIme: "+this.ime+"\nStatus: "+status;
	}
	

}
