package collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("a");
		ll.add("b");
		ll.add("c");
		ll.add("a");// allows duplicate value
		System.out.println(ll);
		System.out.println("---------------student percentage------------");
		LinkedList<Integer> ll2 = new LinkedList<Integer>();
		ll2.add(32);
		ll2.add(62);
		ll2.add(72);
		ll2.add(45);
		ll2.add(100);

		System.out.println(ll2);
		ll2.add(2, 45);
		System.out.println(ll2);
		ll2.remove(2);
		System.out.println(ll2);
		System.out.println(ll2.isEmpty());
		System.out.println(ll2.get(4));
		ll2.removeAll(ll2);
		System.out.println(ll2);
	}

}
