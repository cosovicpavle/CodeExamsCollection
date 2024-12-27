package Programi;

import model.Student;

public class program01 {

	public static void main(String[] args) {
		Student s1 =  new Student(1,"Milos");
		
		Student s2 = new Student(s1);
		
		System.out.println(s1);
		System.out.println(s2);
		
		Student s3 = s1;
		System.out.println(s3);

	}

}
