
public class Exam {

	private Student student;
	// resultat obtenu en %
	private double result;
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Exam [student=" + student + ", result=" + result + "]";
	}
	
	
	
}
