package ExceptionHandlingPrograms;

public class finallyDemo {

	public static void main(String[] args) {
		try {
//			String s = null;
//			System.out.println(s.length());
			return;
		} catch (NullPointerException e) {
			System.out.println(e);
		} finally {
			System.out.println("finally always get executed...");
		}
		System.out.println("last line");
	}

}
