package concurrentCollection;

import java.util.concurrent.CopyOnWriteArrayList;

public class concurrentCopyOnWriteArrayListDemo {

	public static void main(String[] args) {
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
		list.add("concurrent collection");
		list.add("traditional collection");
		list.add("concurrent collection");
		list.add("");
		System.out.println(list);
	}

}
