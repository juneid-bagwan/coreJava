package collections;

import java.util.Vector;
@SuppressWarnings({ "rawtypes", "unchecked" })
public class VectorDemo {

	public static void main(String[] args) {

		Vector v = new Vector();
		System.out.println(v.capacity());
		System.out.println(v.size());
		v.add(1);
		v.add(2);
		v.add(134);
		v.add(22);
		v.add(112);
		v.add(265);
		v.add(1456);
		v.add("juneid");
		v.add("majeed");
		v.add(2.45);
		v.add('f');
		v.add(223);
		v.add(145);
		v.add(25);
		v.add(13);
		v.add(21);
		System.out.println(v.capacity());
		System.out.println(v);
		System.out.println(v.contains(2));// check weather element is present in vector return boolean value
		System.out.println(v.elementAt(5));// which element present at index
		System.out.println(v.remove(5));// remove element present at index
		System.out.println(v.get(5));
		System.out.println(v.indexOf(265));
		System.out.println(v);

	}
}

