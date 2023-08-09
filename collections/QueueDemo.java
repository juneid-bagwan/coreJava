package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue q=new LinkedList();
		q.add("asif");
		q.add("juneid");
		q.add("sohail");
		q.add("sohail");//allows duplicate value
		q.add(1.2);
//		Iterator 
		Iterator itr=q.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
//		using for each loop
		for(Object o:q) {
			System.out.println(o);
		}
		System.out.println(q.isEmpty());
		System.out.println(q.contains("juneid"));
		System.out.println(q.size());
		System.out.println(q.peek());
		System.out.println(q.poll());
//		System.out.println(q.poll());      remove and display first element from queue
		System.out.println(q.peek());
		System.out.println(q);
	}

}
