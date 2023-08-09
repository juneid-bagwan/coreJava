package collections;

import java.util.Iterator;
import java.util.Stack;

public class stackDemo {

	public static void main(String[] args) {
		Stack st=new Stack();
		st.push("juneid");
		st.push("majeed");
		st.push("bagwan");
		System.out.println(st);
		st.pop();
		System.out.println(st);
		System.out.println(st.peek());
		st.add("musaib");//add element in stack
		System.out.println(st);
		System.out.println(st.search("juneid"));//search element in stack

//		st.clear();   //remove all elements in stack.
		System.out.println(st);
		Iterator itr=st.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
