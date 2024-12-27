package vezbe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class University {
	
	public static void main(String[] args) {
		
		Map<String, College> university = new HashMap<String, College>();
		
		
		List<Student> students1 = new ArrayList<Student>();
		
		Student s1 = new Student("Marko", 20, 205/34);
		Student s2 = new Student("Milena", 23, 303/54);
		students1.add(s1);
		students1.add(s2);
		
		
		
		List<Professor>professors1= new ArrayList<Professor>();
		Professor p1 = new Professor("Zarko", 45, 15);
		Professor p2 = new Professor("Milan", 55, 13);
		professors1.add(p1);
		professors1.add(p2);
		
		College gradjevina = new College(students1, professors1);
		
       List<Student> students2 = new ArrayList<Student>();
		
		Student s3 = new Student("Filip", 23, 223/89);
		Student s4 = new Student("Nemanja", 21, 350/21);
		students2.add(s3);
		students2.add(s4);
		
		
		
		List<Professor>professors2 = new ArrayList<Professor>();
		Professor p3 = new Professor("Slavica", 35, 6);
		Professor p4 = new Professor("Olga", 44, 10);
		professors2.add(p3);
		professors2.add(p4);
		
		
		College knjizevnost = new College(students2, professors2);
		
		university.put("Gradjevina", gradjevina);
		university.put("Knjizevnost", knjizevnost);
		
		for (Map.Entry<String, College> entry : university.entrySet()) {
			System.out.println("College["+entry.getKey()+"] "+entry.getValue());
			
		}
		
	}

}
