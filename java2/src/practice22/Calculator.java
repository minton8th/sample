package practice22;

public class Calculator {
	public static int divide(int x, int y) throws IllegalInputException {
		try {
			return x / y;
		} catch (ArithmeticException e) {
			// TODO: handle exception
			throw new IllegalInputException(e);
		}

	}
}
