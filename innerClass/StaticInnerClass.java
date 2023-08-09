package innerClass;

public class StaticInnerClass {
	static int c = 30;

	static class Inner {
		void show(int a, int b) {
			System.out.println("i am static inner class.\n addition of two number is:" + (a + b + c));
		}
	}

	public static void main(String[] args) {
		Inner s = new Inner();
		s.show(58, 44);
	}

}
