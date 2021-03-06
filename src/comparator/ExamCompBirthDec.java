package comparator;

import java.util.Comparator;
import model.Exam;

public class ExamCompBirthDec implements Comparator<Exam> {

	@Override
	public int compare(Exam o1, Exam o2) {
		return o1.getStudent().compareTo(o2.getStudent());
	}
	
}
