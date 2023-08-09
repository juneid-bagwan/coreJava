package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class treeSetDemo {

	public static void main(String[] args) {

		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(123);
		ts.add(5);
		ts.add(78);
		ts.add(87);
		ts.add(6565);
		ts.add(5);// no duplicate value allowed
		Iterator<Integer> itr = ts.iterator();
		while (itr.hasNext()) {// sort in ascending order
			int a=itr.next();
			if (a> 50) {
				System.out.println(a);
			}

		}
		System.out.println(ts);


	}
}
