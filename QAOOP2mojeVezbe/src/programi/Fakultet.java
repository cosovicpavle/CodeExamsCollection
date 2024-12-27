package programi;

import model1.Status;
import model1.Student;

public class Fakultet {
	
	public Student[]studenti;
	
	public Fakultet(Student[]studenti) {
		this.studenti=studenti;
	}
	
	public Student[]budzetski(){
		int br=0;
		
		Student[]budzetski =  new Student[2];
		
		
		for (Student student:this.studenti) {
			if(student.status==Status.BUDZET) {
				budzetski[br++]=student;
			}
		}
		return budzetski;
		
	}
	
	public Student[]samofinansiranje(){
		int br=0;
		Student[] samofinansirajuci= new Student[2];
		for (Student student:this.studenti) {
			if(student.status==Status.SAMOFINANSIRANJE) {
				samofinansirajuci[br++]=student;
			}
			
		}
		return samofinansirajuci;
	}
	
	
	

	public static void main(String[] args) {
		
		
		Student s1 =  new Student(1, "Mirko", Status.BUDZET);
		Student s2 =  new Student(2, "Nikola", Status.SAMOFINANSIRANJE);
		Student s3 =  new Student(3, "Jovan", Status.BUDZET);
		
		Student []studenti = {s1,s2,s3};
		
		Fakultet fakultet =  new Fakultet(studenti);
		
		
		Student []budzetskiStudenti=fakultet.budzetski();
		Student[]samofinansirajuciStudneti=fakultet.samofinansiranje();
		System.out.println("Studenti na budzetu su:");
		for(Student student:budzetskiStudenti) {
			if(student!=null) {
				System.out.println(student);
			}
		}
		
		System.out.println("----------------");
		System.out.println("Studenti na samofinansiranju su: ");
		
		
		for(Student student:samofinansirajuciStudneti) {
			if(student!=null) {
				System.out.println(student);
			}
		}
		
		
		
		
			
		}
		
		
		
		

	}


