package oop2;

public class Student {
	
	public int id;
	public String name;
	
	
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	Student(Student s){
		this.id=s.id;
		this.name=s.name;
	}
	
	void display() {
		System.out.println("Student info:\nID: "+this.id+"\nName: "+this.name);
	}
	
	public static void main(String []arg) {
		Student s1 =  new Student(1, "Milan");
		Student s2 =  new Student(s1);
		
		
		s1.display();
		s2.display();
				
				
	}

}
