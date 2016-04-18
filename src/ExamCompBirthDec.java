import java.util.Comparator;

public class ExamCompBirthDec implements Comparator<Exam> {

	@Override
	public int compare(Exam o1, Exam o2) {
		
		if (null != o1.getStudent().getBirthdate() && null != o1.getStudent().getBirthdate()) {
			long do1 = o1.getStudent().getBirthdate().getTime();
			long do2 = o2.getStudent().getBirthdate().getTime();
			if (do1 != do2) { 
				Long res = (do1-do2)*10^5; 
				return res.intValue(); }
		}
		return o1.getStudent().compareTo(o2.getStudent());
	}
	
}
