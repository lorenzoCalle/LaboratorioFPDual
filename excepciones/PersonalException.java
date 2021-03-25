package excepciones;

public class PersonalException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final static String MESSAGE = "Personal Exception";
	
	public PersonalException(String message) {
		super(MESSAGE+ ": " + message);
	}
}
