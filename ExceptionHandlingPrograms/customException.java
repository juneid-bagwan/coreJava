package ExceptionHandlingPrograms;

class LowPercentException extends Exception {
//	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LowPercentException(String s) {
		super(s);
	}
}

public class customException {
	static void percent(int s) throws LowPercentException {
		if (s < 40) {
			throw new LowPercentException("not eligible for admission.");
		} else {
			System.out.println("eligible for admission.");
		}
	}

	public static void main(String[] args) {

//		customException c = new customException();
		try {
			percent(20);
		} catch (LowPercentException e) {
			System.out.println(e);
		} finally {
			System.out.println("have a nice day.");
		}
	}

}