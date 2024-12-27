package model;

public class Student {
	
	public int id;
	public String name;
	
	public Student(int id,String name) {
		this.id=id;
		this.name=name;
		
		
	}
	
	public Student(Student s) {
		this.id = s.id;
		this.name = s.name;
		
	}
	
	@Override
	
	public String toString () {
		return "Student info:\nId: "+id+"\nName: "+name;
		
	}

}
