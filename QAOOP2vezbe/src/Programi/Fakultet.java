package Programi;



import model.Status;
import model.Student3;

public class Fakultet {
	
	private Student3 []studenti;
	
	Fakultet (Student3 [] studenti){
		this.studenti = studenti;
		
	}
	
	public Student3[] budzetski() {
		
		Student3 []budzetski = new Student3[2];
		int br=0;
		
		
			for (Student3 student3 : this.studenti ){
				if(student3.status == Status.BUDZET) {
					budzetski[br++]=student3;
					
				
			}
				
				
			
			
		}
			return budzetski;
	}
	
	public Student3 [] samofinansiranje() {
		int br=0;
		Student3 []samofinansiranje = new Student3[2];
		
		for(Student3 student3: this.studenti) {
			if(student3.status == Status.SAMOFINANSIRANJE) {
				samofinansiranje[br++]=student3;
			}
		}
		return samofinansiranje;
		
		
	}
	
	
	
	
	
	
	public static void main (String [] args) {
		
		
		Student3  s1  = new Student3(1, "Marko", Status.SAMOFINANSIRANJE);
		Student3  s2  = new Student3(2, "Nikola", Status.BUDZET);
		Student3  s3  = new Student3(3, "Stefan", Status.BUDZET);
		
		
		Student3[] studenti =  {s1,s2,s3} ;
		
		
		Fakultet fakultet =  new Fakultet(studenti);
		
		
		Student3[] budzetskiStudenti = fakultet.budzetski();
		Student3[]samofinansirajuciStudenti= fakultet.samofinansiranje();
		
		System.out.println("Studenti na samofinansiranju: ");
		for (Student3 student3 : samofinansirajuciStudenti) {
			if(student3!=null) {
				System.out.println(student3);
			}
			
			
		}
		
		System.out.println("Studenti na budzetu");
		for (Student3 student3 : budzetskiStudenti) {
			if(student3!=null) {
				System.out.println(student3);
			}
			
			
		}
		
		
		
		
		
	}
	
	
		
		
	
	
	
	

}
