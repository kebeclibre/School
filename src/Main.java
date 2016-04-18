
import model.*;

public class Main {

	public static void main(String[] args) {
		School school = new School("ND de La tourette");
		Student st = new Student("Ducobu", "Christoph");
		Prof p = new Prof("Crepin", "Dany");
		Course histoire = new Course("Histoire");
		Course math = new Course("Math");
		Exam ex = new Exam();
		
		school.addCourse(histoire);
		school.addCourse(math);
		histoire.setProf(p);
		histoire.addExam(ex);
		histoire.addStudent(st);
		ex.setStudent(st);
		ex.setResult(60);
		school.printState();
		
		
		
	}

}
