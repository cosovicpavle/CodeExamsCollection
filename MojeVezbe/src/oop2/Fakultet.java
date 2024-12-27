package oop2;

public class Fakultet {
	
	
	public Student3 []studenti;
	
	
	public Fakultet(Student3[]studenti){
		this.studenti=studenti;
		
	}
	
	public Student3[] samofinansirajuci() {
		Student3[]samofinansirajuci =  new Student3[2];
		int br=0;
		for(Student3 student:this.studenti) {
			if(student.status==Status.SAMOFINANSIRAJUCI)
				samofinansirajuci[br++]=student;
			
		}
		return samofinansirajuci;
	
		
		
		
		
		
	}
	
	public Student3[] budzetski() {
		Student3[] budzetski = new Student3[2];
		
		int br=0;
		
		for(Student3 student:this.studenti) {
			if(student.status==Status.BUDZETSKI) {
				budzetski[br++]=student;
			}
			
		}
		return budzetski;
	
	}
	
		
		
	

	public static void main(String[] args) {
		
		Student3 s1 =  new Student3(1, "Milan", Status.BUDZETSKI);
		Student3 s2 =  new Student3(2, "Marko", Status.SAMOFINANSIRAJUCI);
		Student3 s3 =  new Student3(3, "Aleksa", Status.SAMOFINANSIRAJUCI);
		
		
		Student3 []studenti= {s1,s2,s3};
		
		Fakultet f =  new Fakultet(studenti);
		
		
		Student3[]budzetski=f.budzetski();
		Student3[]samofinansirajuci=f.samofinansirajuci();
		
		
		System.out.println("Budzetski studenti su: ");
		for(Student3 student:budzetski) {
			if(student!=null)
			System.out.println(student);
		}
		
		
		System.out.println("Samofinansirajuci studenti su: ");
		
		for(Student3 student :samofinansirajuci) {
			if(student!=null)
			System.out.println(student);
		}
				
		
		
		

	}

}
