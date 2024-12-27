package oop1;

public class Student2 {
	
	public int id;
	public String name;
	public int age;
	
	
	Student2(int id, String name){
		this.id=id;
		this.name=name;
		
	}
	
	Student2(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	public void dispay() {
		System.out.println("Student info:\nID: "+id+"\nName: "+name+"\nAge: "+age);
	}
	
	
	public static void main(String []args) {
		Student2 s1 =  new Student2(1, "Nikola");
		Student2 s2 =  new Student2(2, "Stefan", 18);
		
		s1.dispay();
		s2.dispay();
		
	}

}
