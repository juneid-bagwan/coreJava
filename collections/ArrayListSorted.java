package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListSorted {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(32);
		al.add(62);
		al.add(72);
		al.add(45);
		al.add(100);
		
		Collections.sort(al);
		System.out.println(al);
		al.add(2, 45);
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al.get(4));
		System.out.println("-----sorted list----------");
		Iterator<Integer> i=al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
