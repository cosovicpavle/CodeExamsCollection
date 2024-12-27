package vezbe;

public class Student extends Person {
	
	public int indexNumber;

	public Student(String name, int age,int indexNumber) {
		super(name, age);
		this.indexNumber=indexNumber;
	}
	
	
	@Override
	public String toString() {
		
		return "Student info: Name: "+this.name+" Age: "+this.age+" IndexNumber: "+this.indexNumber;
	}

}
