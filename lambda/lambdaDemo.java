package lambda;

import java.util.ArrayList;

public class lambdaDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(43);
		list.add(26);
		list.add(42);
		list.add(5);
		list.forEach((n) -> {
			if (n % 2 == 0) {
				System.out.println(n);
			}
		});
	}

}
