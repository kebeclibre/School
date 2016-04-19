package model.exceptionSchool;

public class ExceptIllegalNumber extends Exception{

	public ExceptIllegalNumber() {
		super("Number inferior to 0");
	}
	
	public ExceptIllegalNumber(String message) {
		super(message);
	}

	public ExceptIllegalNumber(Throwable cause) {
		super(cause);
	}
	
	public ExceptIllegalNumber(String message, Throwable cause) {
		super(message,cause);
	}
}
