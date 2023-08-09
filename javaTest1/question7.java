package javaTest1;

import java.util.Scanner;

class LowPercentageException extends Exception {

	private static final long serialVersionUID = 1L;

	public LowPercentageException(String s) {
		super(s);
	}
}

public class question7 {
	static void percent(int s) throws LowPercentageException {
		if (s < 40) {
			throw new LowPercentageException("not eligible for admission.");
		} else {
			System.out.println("eligible for admission.");
		}
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your persentege:");
		int n = sc.nextInt();
		try {
			percent(n);
		} catch (LowPercentageException e) {
			System.out.println(e);
		} finally {
			System.out.println("have a nice day.");
			sc.close();
		}
	}

}