package model;
import model.exceptionSchool.ExceptIllegalNumber;
public class Exam implements Comparable<Exam> {

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
	public void setResult(double result) throws ExceptIllegalNumber{
		if (result < 0) {
			throw new ExceptIllegalNumber();
		} else if (result > 1500 ) { throw new ExceptIllegalNumber("nombre superieur à 1500"); } 
		else {this.result = result; }
	}
	@Override
	public String toString() {
		return "Exam [student=" + student + ", result=" + result + "]";
	}
	@Override
	public int compareTo(Exam o) {
		return (int) o.getResult()*100 - (int) this.getResult()*100;
	}
	
	
	
}
