package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedHashSetDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		LinkedHashSet set = new LinkedHashSet();
//		LinkedHashSet<String> set2=new LinkedHashSet<String>(); 
		set.add(3);
		set.add(2);
		set.add("a");
		set.add(2);// duplicate entry is not allowed
		set.add("");//it allows null value
		set.add(12.32);// any primitive data type you can enter
		System.out.println(set);// it follows insertion order
		System.out.println(set.contains("A"));// checks that element present in set or not returns boolean value
		System.out.println(set.size());// returns the size of set
		System.out.println(set.isEmpty());// check it is empty or not returns boolean value
		@SuppressWarnings("rawtypes")
		Iterator itr = set.iterator();
		while (itr.hasNext()) {//returns boolean value
			System.out.println(itr.next());//returns next element in set
		}
		System.out.println(set);
	}

}
