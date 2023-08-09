package innerClass;
//LIC
public class localinnerClass {
	private int a = 30;

	void display() {
		class LocalInner {
			void show() {
				System.out.println("I am local inner class=" + a);
			}
		}

		LocalInner n = new LocalInner();
		n.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		localinnerClass o = new localinnerClass();
		o.display();
	}

}
