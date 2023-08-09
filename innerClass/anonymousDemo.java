package innerClass;

class polygon {
	void display() {
		System.out.println("inside the polygone class....");
	}
}

class anonyDemo {
	void createClass() {
		polygon p = new polygon() {
			void display() {
				System.out.println("inside an anonymous");
			}
		};
		p.display();
	}
}

public class anonymousDemo {

	public static void main(String[] args) {
		anonyDemo an=new anonyDemo();
		an.createClass();
	}

}
