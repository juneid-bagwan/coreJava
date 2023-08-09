import java.util.Scanner;

public class static_method {
	static int c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		System.out.println("enter the value of a and b:");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		add(a, b);
		System.out.println(c);
		sc.close();

	}

	static void add(int d, int c) {
		System.out.println("a+b=" + (c + d));
	}

}
