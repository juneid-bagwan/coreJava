package ExceptionHandlingPrograms;

public class arrayAndNumberEXP {

	public static void main(String[] args) {
		System.out.println("first line");
		int a[] = new int[5];
		a[0] = 5;
		a[1] = 588;
		a[2] = 45;
		a[3] = 54;
		a[4] = 6;
		try {
			try {
				int c = Integer.parseInt("state");
				System.out.println(c);
			} catch (NumberFormatException f) {
				System.out.println(f);
			}
			System.out.println(a[8]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array length is 5 you cannot access a[8]");
		}
		System.out.println("last line");
	}

}