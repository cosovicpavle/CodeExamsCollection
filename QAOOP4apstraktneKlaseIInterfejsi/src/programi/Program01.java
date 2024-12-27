package programi;

import model.IPolaganje;
import model.Osoba;
import model.Predmet;
import model.Profesor;
import model.Student;

public class Program01 {
	
	public static void main(String []arg) {
		
		
		System.out.println("OOP4");
		
		// Osoba o =  new Osoba();
		
		Student s = new Student();
		
		Osoba o =  new Student();
		
		s.test();
		s.testStudent();
		o.test();
		
		
		if(o instanceof Student)
			((Student) o).testStudent();
		
		s.testAbstract();
		o.testAbstract();
		
		Profesor p = new Profesor();
		p.testAbstract();
		
		Osoba o2 = new Profesor();
		o2.testAbstract();
		
		IPolaganje Ip =  new IPolaganje() {
			
			@Override
			public void polaganje() {
				// TODO Auto-generated method stub
				
			}
		};
		
		s.pozdrav();
		
		IPolaganje s2 = new Student();
		IPolaganje p1 =  new Predmet();
		
		s2.polaganje();
	
		
		
		
		
		
		
	}

}
