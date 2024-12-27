package oop1;

public class Student {
	
	public int id;
	public String name;
	
	
	Student(){
		
	}
	Student(int id,String name){
		this.id= id;
		this.name = name;
	}
	
	
	
	public void display() {
		
		System.out.println("Student info:\nID: "+id+"\nName: "+name);
	}
	
	public static void main(String []args) {
		
		Student s =  new Student();
		s.display();
		
		Student s2 =  new Student(1, "Milos");
		s2.display();
		
		
		
	}

}
