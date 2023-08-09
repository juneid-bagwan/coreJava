package innerClass;

public class MemberInnerClass {
	void display() {
		System.out.println("i am display");
		MIC m = new MIC();// first method to access Member inner class
		m.show();
	}

	class MIC {
		void show() {
			System.out.println("i am Member Inner Class");
		}
	}

	public static void main(String[] args) {
		MemberInnerClass m = new MemberInnerClass();
		m.display();
		MemberInnerClass.MIC in = m.new MIC();// second method to access Member inner class
		in.show();
	}

}
