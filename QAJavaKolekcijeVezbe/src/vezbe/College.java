package vezbe;

import java.util.List;

public class College {
	
	public List<Student>students;
	public List<Professor>professors;
	
	public College(List<Student>students,List<Professor>professors) {
		this.professors=professors;
		this.students=students;
		
	}
	
	@Override
	public String toString() {
		
		StringBuilder result = new StringBuilder("").append("\n");
		result.append("Students: ").append("\n");
		
		for (Student student : students) {
			result.append(student.toString()).append("\n");
			
		}
		result.append("------------------").append("\n");
		
		result.append("Proffesor: ").append("\n");
		
		for (Professor professor : professors) {
			result.append(professor.toString()).append("\n");
			
		}
		
		
		
		return result.toString();
	}
	
	
	}


