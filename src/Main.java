
public class Main {

	public static void main(String[] args) {
		School school = new School("ND de La tourette");
		Student st = new Student("Ducobu", "Christoph");
		Prof p = new Prof("Crepin", "Dany");
		Course histoire = new Course("Histoire");
		Exam ex = new Exam();
		
		school.addCourse(histoire);
		histoire.setProf(p);
		histoire.addExam(ex);
		histoire.addStudent(st);
		
		
		
	}

}
