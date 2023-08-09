package AbstractionPrograms;

interface A {
	static void show() {
		System.out.println("this is static method.");
	}
}

public class StaticMethodInteface {

	public static void main(String[] args) {
		A.show();
	}

}
