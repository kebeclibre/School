import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class School {

	private String name;
	private List<Course> courses;

	public School(String name) {
		this.name = name;
		this.courses = new ArrayList<Course>();
	}
	public Set<Prof> getAllProfs(){
		return null;
	}
	public Set<Prof> getAllStudents(){
		return null;
	}
	public Set<Exam> getAllExams(Student x){
		return null;
	}
	// x got more than 50% average on all exams
	public boolean getMoreThan50(Student x){
		return false;
	}
	public Student getBestStudent(){
		return null;
	}
	public Student getBestStudent(Course c){
		return null;
	}
	public Student getBestExam(Course c){
		return null;
	}
	public Course getCourseByCourseName(String courseName){
		return null;
	}
	public Set<Course> getCoursesByProf(Prof x){
		return null;
	}
	public Set<Person> getPersonsByBirthYear(int year){
		return null;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
