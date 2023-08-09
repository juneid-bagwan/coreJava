package concurrentCollection;

import java.util.concurrent.CopyOnWriteArraySet;

public class concurrentCopyOnWriteArraySetDemo {

	public static void main(String[] args) {
		CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<String>();
		set.add("juneid");
		set.add("bagwan");
		set.add("juneid");// duplicate values are not allowed
		set.add("");
		System.out.println(set);

	}

}
