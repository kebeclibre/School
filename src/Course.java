import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Course {

	private List<Exam> exams;
	private Set<Student> students;
	private String name;
	private Prof prof;
	
	public Course(String name){
		this.name = name;
		this.exams = new ArrayList<Exam>();
	}

	public List<Exam> getExams() {
		return exams;
	}

	public void setExams(List<Exam> exams) {
		this.exams = exams;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
