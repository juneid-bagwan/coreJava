package assignment1;

class grandFather {
	void daily() {
		System.out.println("grandfather like to walk at night");
	}
}

class father extends grandFather {
	void job() {
		System.out.println("father dont like to work");
	}
}

public class son extends father {
	void edu() {
		System.out.println("son completed B tech");
	}

	public static void main(String[] args) {
		son s = new son();
		s.daily();
		s.job();
		s.edu();
	}

}
