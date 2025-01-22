package logic;

public class InvalidAgeException extends Exception {
	
	private static final long serialVersionUID = 1L;
	public static String MSG = "Age invalid! Must between 18 and 75.";
	
	public InvalidAgeException(String msg) {
		super(msg);
	}

}
