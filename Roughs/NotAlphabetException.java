package Roughs;

public class NotAlphabetException extends ArithmeticException {
	public String getMessage() {
		return "Entered character is not an Alphabet";
	}

}
