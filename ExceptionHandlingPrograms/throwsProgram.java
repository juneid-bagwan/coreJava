package ExceptionHandlingPrograms;

import java.io.IOException;

public class throwsProgram {
	static void show(int a) throws IOException, ArrayIndexOutOfBoundsException {
		if (a == 0) {
			throw new IOException("number is zero ");
		} else {
			throw new ArrayIndexOutOfBoundsException("positive");
		}
	}

	public static void main(String[] args) {
		int num = 55;
		try {
			show(num);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
