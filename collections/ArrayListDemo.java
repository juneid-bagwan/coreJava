package collections;

import java.util.ArrayList;

import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("asif");
		al.add("bagwan");
		al.add("hello");
		System.out.println("element at 3rd position is:" + al.get(2));
		ListIterator<String> itr = al.listIterator();
		System.out.println("forward list itrator:");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("backward list itretor:");
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}

	}

}
