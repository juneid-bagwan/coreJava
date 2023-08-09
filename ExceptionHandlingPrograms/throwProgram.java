package ExceptionHandlingPrograms;

public class throwProgram {
	static void display(int a) {
		if (a < 20) {
			throw new ArithmeticException("cannot drive");
		} else {
			System.out.println("can drive");
		}
	}

	public static void main(String[] args) {
		int age = 12;
		display(age);
	}

}
