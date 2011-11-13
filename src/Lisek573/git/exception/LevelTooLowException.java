package Lisek573.git.exception;

public class LevelTooLowException extends Exception {
	private static final long serialVersionUID = 1L;

	public LevelTooLowException(String message) {
		super(message);
	}
}