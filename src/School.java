import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class School {

	private String name;
	private List<Course> courses;

	public School(String name) {
		this.name = name;
		this.courses = new ArrayList<Course>();
	}
	public Set<Prof> getAllProfs(){
		Set<Prof> allProfs = new TreeSet<Prof>();
		
		for (Course course : this.courses) {
			allProfs.add(course.getProf());
		}
		
		
		return allProfs;
	}
	public Set<Student> getAllStudents(){
		Set<Student> allStudents = new TreeSet<Student>();
		for (Course course : this.courses) {
			for (Student student : course.getStudents()) {
				
				allStudents.add(student);
			}
		}
		return allStudents;
	}
	public Set<Exam> getAllExams(Student x){
		Set<Exam> examOneStudent = new TreeSet<Exam>();
		for (Course course : this.courses) {
			for (Exam exam : course.getExams()) {
				if (exam.getStudent().equals(x)) {
					examOneStudent.add(exam);
				}
			}
		}
		return examOneStudent;
	}
	// x got more than 50% average on all exams
	public boolean getMoreThan50(Student x){
		Set<Exam> exams50 = new HashSet<Exam>();
		for (Exam exam : getAllExams(x)) {
			if (exam.getResult() >= 50) {
				exams50.add(exam);
			}
		}
		return  (exams50.size() == getAllExams(x).size());
	}
	public Student getBestStudent(){
		Student best = null;
		int bestNote = 0;
		for (Student student : getAllStudents()) {
			if (studentMean(student) > bestNote) {
				best = student;
				bestNote = studentMean(student);
			}	
		}
		return best;	
	}
	public Student getBestStudent(Course c){
		return null;
	}
	public Student getBestExam(Course c){
		Student best = null;
		double bestNote = 0;
		for (Exam exam : c.getExams()) {
			if (exam.getResult() > bestNote) {
				bestNote = exam.getResult();
				best = exam.getStudent();
			}
			
		}
		return best;
	}
	public Course getCourseByCourseName(String courseName){
		for (Course course : this.courses) {
			if (course.getName().equals(courseName)) {
				return course;
			}
		}
		return null;
	}
	public Set<Course> getCoursesByProf(Prof x){
		Set<Course> courseByProf = new HashSet<Course>();
		for (Course course : this.courses) {
			if (course.getProf().equals(x)) {
				courseByProf.add(course);
			}
		}
		return courseByProf;
	}
	public Set<Person> getPersonsByBirthYear(int year){
		Set<Person> people = new TreeSet<Person>();
		Calendar cal = GregorianCalendar.getInstance();
		
		for (Person person : getAllProfs()) {		
			cal.setTime(person.getBirthdate());
			if (cal.get(Calendar.YEAR) == year) {
				people.add(person);
			}
		}
		
		for (Person person : getAllStudents()) {
			cal.setTime(person.getBirthdate());
			if (cal.get(Calendar.YEAR) == year) {
				people.add(person);
			} 
		}
		return people;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int studentMean(Student x) {
		int result=0;
		for (Exam exam : getAllExams(x)) {
			result += exam.getResult();
		}
		return result/getAllExams(x).size();
	}
	public void addCourse(Course course) {
		courses.add(course);
	}

}
